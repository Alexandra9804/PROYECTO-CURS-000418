package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.mappers;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.dto.AutorizacionSaveUseCaseResponseDto;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.Autorizacion;

public class AutorizacionUseCaseMapperImpl implements AutorizacionUseCaseMapper{

    @Override
    public AutorizacionSaveUseCaseResponseDto toUseCaseResponse(Long idAutorizacionGenerado, Autorizacion autorizacion) {
            return new AutorizacionSaveUseCaseResponseDto(
                    idAutorizacionGenerado,
                    autorizacion.getIdUsuarioSolicitante(),
                    autorizacion.getMontoPago(),
                    autorizacion.getFechaSolicitud(),
                    autorizacion.getEstadoAutorizacion().getDescripcion()
            );
    }
}
