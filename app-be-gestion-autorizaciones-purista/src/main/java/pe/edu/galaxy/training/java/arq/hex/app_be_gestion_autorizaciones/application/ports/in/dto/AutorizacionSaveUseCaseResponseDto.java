package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AutorizacionSaveUseCaseResponseDto {

    private Long autorizacionId;
    private Long usuarioId;
    private BigDecimal montoPago;

    public AutorizacionSaveUseCaseResponseDto() {
    }

    public AutorizacionSaveUseCaseResponseDto(Long autorizacionId, Long usuarioId, BigDecimal montoPago) {
        this.autorizacionId = autorizacionId;
        this.usuarioId = usuarioId;
        this.montoPago = montoPago;
    }

    public Long getAutorizacionId() {
        return autorizacionId;
    }

    public void setAutorizacionId(Long autorizacionId) {
        this.autorizacionId = autorizacionId;
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
