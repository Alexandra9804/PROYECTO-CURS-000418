package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.in.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AutorizacionSaveUseCaseResponseDto {

    private Long autorizacionId;
    private Long usuarioId;
    private BigDecimal montoPago;
    private LocalDateTime fechaSolicitud;
    private String estado;

    public AutorizacionSaveUseCaseResponseDto() {
    }

    public AutorizacionSaveUseCaseResponseDto(Long autorizacionId, Long usuarioId, BigDecimal montoPago, LocalDateTime fechaSolicitud, String estado) {
        this.autorizacionId = autorizacionId;
        this.usuarioId = usuarioId;
        this.montoPago = montoPago;
        this.fechaSolicitud = fechaSolicitud;
        this.estado = estado;
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

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
