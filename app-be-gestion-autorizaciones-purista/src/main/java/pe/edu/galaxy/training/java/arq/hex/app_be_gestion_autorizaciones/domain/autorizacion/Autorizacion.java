package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.constant.AutorizacionMessageConstant;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base.Domain;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Autorizacion extends Domain {

    private Long idUsuarioSolicitante;
    private BigDecimal montoPago;
    private LocalDateTime fechaSolicitud;
    private LocalDateTime fechaFinalizacion;
    private AutorizacionEstadoEnum estadoAutorizacion;
    private String motivo;

    public Autorizacion(Long idUsuarioSolicitante, BigDecimal montoPago) {
        this.idUsuarioSolicitante = idUsuarioSolicitante;
        this.montoPago = montoPago;
        this.fechaSolicitud = LocalDateTime.now();
        this.estadoAutorizacion = AutorizacionEstadoEnum.REGISTRADA;
    }

   public void enviarParaAsignarEvaluador() throws DomainException {
        if(estadoAutorizacion != AutorizacionEstadoEnum.REGISTRADA && estadoAutorizacion != AutorizacionEstadoEnum.OBSERVADA) {
            throw new AutorizacionException(AutorizacionMessageConstant.ERROR_ENVIO_NO_PERMITIDO);
        }

        this.estadoAutorizacion = AutorizacionEstadoEnum.PENDIENTE_DE_ASIGNAR_EVALUADOR;
   }

    public Long getIdUsuarioSolicitante() {
        return idUsuarioSolicitante;
    }

    public BigDecimal getMontoPago() {
        return montoPago;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public LocalDateTime getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public AutorizacionEstadoEnum getEstadoAutorizacion() {
        return estadoAutorizacion;
    }

    public String getMotivo() {
        return motivo;
    }

    @Override
    public boolean valid() throws DomainException {
        return false;
    }

}
