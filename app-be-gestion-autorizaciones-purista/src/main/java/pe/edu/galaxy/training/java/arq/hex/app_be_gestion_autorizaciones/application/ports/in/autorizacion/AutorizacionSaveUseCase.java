package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.autorizacion;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.base.UseCaseResponse;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.dto.AutorizacionSaveUseCaseRequestDto;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.dto.AutorizacionSaveUseCaseResponseDto;

@FunctionalInterface
public interface AutorizacionSaveUseCase {
    UseCaseResponse<AutorizacionSaveUseCaseResponseDto> saveAutorizacion(AutorizacionSaveUseCaseRequestDto requestDto);
}
