package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.dto;

import java.math.BigDecimal;

public class AutorizacionSaveUseCaseRequestDto {
    private Long usuarioId;
    private BigDecimal montoPago;

    public AutorizacionSaveUseCaseRequestDto() {
    }

    public AutorizacionSaveUseCaseRequestDto(Long usuarioId, BigDecimal montoPago) {
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
