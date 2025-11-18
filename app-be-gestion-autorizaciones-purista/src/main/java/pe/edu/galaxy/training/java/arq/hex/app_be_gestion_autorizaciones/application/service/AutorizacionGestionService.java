package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.service;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.common.UseCaseResponse;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.constant.AutorizacionErrorMessageConstant;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.exceptions.UsuarioApplicationException;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.autorizacion.AutorizacionSaveUseCase;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.dto.AutorizacionSaveUseCaseRequestDto;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.dto.AutorizacionSaveUseCaseResponseDto;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.mappers.AutorizacionUseCaseMapper;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.out.autorizacion.AutorizacionSavePort;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.out.usuario.UsuarioFindByIdPort;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.Autorizacion;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.AutorizacionException;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.usuario.Usuario;

public class AutorizacionGestionService implements AutorizacionSaveUseCase{

    private final UsuarioFindByIdPort usuarioFindByIdPort;

    private final AutorizacionSavePort autorizacionSavePort;

    private final AutorizacionUseCaseMapper autorizacionUseCaseMapper;

    public AutorizacionGestionService(UsuarioFindByIdPort usuarioFindByIdPort, AutorizacionSavePort autorizacionSavePort, AutorizacionUseCaseMapper autorizacionUseCaseMapper){
        this.usuarioFindByIdPort = usuarioFindByIdPort;
        this.autorizacionSavePort = autorizacionSavePort;
        this.autorizacionUseCaseMapper = autorizacionUseCaseMapper;
    }

    @Override
    public UseCaseResponse<AutorizacionSaveUseCaseResponseDto> saveAutorizacion(AutorizacionSaveUseCaseRequestDto requestDto) throws UsuarioApplicationException, AutorizacionException {
        Usuario usuario = usuarioFindByIdPort.findById(requestDto.getUsuarioId())
                .orElseThrow(() -> new UsuarioApplicationException(String.format(AutorizacionErrorMessageConstant.ERROR_USUARIO_NO_EXISTE, requestDto.getUsuarioId())));


        Autorizacion autorizacion = new Autorizacion(usuario, requestDto.getMontoPago());

        Long idGenerado = autorizacionSavePort.save(autorizacion);

        AutorizacionSaveUseCaseResponseDto responseDto = autorizacionUseCaseMapper.toUseCaseResponse(idGenerado, autorizacion);

        return new UseCaseResponse<AutorizacionSaveUseCaseResponseDto>(responseDto);
    }
}
