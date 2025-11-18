package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.dto;

import java.math.BigDecimal;

public class AutorizacionSaveUseCaseResponseDto {
    Long usuarioId;
    BigDecimal montoPago;

    public AutorizacionSaveUseCaseResponseDto(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public AutorizacionSaveUseCaseResponseDto(Long usuarioId, BigDecimal montoPago) {
        this.usuarioId = usuarioId;
        this.montoPago = montoPago;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public BigDecimal getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(BigDecimal montoPago) {
        this.montoPago = montoPago;
    }
}
