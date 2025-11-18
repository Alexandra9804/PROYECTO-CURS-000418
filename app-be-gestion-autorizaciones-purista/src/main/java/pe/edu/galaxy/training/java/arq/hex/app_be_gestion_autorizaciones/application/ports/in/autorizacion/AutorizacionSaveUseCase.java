package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.autorizacion;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.common.UseCaseResponse;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.exceptions.UsuarioApplicationException;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.dto.AutorizacionSaveUseCaseRequestDto;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.dto.AutorizacionSaveUseCaseResponseDto;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.AutorizacionException;

@FunctionalInterface
public interface AutorizacionSaveUseCase {
    UseCaseResponse<AutorizacionSaveUseCaseResponseDto> saveAutorizacion(AutorizacionSaveUseCaseRequestDto requestDto) throws UsuarioApplicationException, AutorizacionException;
}
