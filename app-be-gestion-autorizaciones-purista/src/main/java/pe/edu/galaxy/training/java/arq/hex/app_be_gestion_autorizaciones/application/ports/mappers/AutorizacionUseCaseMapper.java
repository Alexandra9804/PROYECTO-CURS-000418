package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.mappers;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.dto.AutorizacionSaveUseCaseResponseDto;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.Autorizacion;

public interface AutorizacionUseCaseMapper {
    AutorizacionSaveUseCaseResponseDto toUseCaseResponse(Long idAutorizacion, Autorizacion autorizacion);

}
