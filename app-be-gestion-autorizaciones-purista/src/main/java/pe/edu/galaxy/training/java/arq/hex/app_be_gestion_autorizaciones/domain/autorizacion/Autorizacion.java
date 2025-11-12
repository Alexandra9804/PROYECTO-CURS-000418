package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.constant.AutorizacionMessageConstant;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base.Domain;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.evaluacion.Evaluacion;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.usuario.RolEnum;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.usuario.Usuario;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static java.util.Objects.isNull;

public class Autorizacion extends Domain {

    private Long idUsuarioSolicitante;
    private BigDecimal montoPago;
    private LocalDateTime fechaSolicitud;
    private LocalDateTime fechaFinalizacion;
    private AutorizacionEstadoEnum estadoAutorizacion;

    public Autorizacion(Usuario usuario, BigDecimal montoPago) throws AutorizacionException {
        this.validarUsuario(usuario);
        this.idUsuarioSolicitante = usuario.getId();
        this.validarMontoPago(montoPago);
        this.montoPago = montoPago;
        this.fechaSolicitud = LocalDateTime.now();
        this.estadoAutorizacion = AutorizacionEstadoEnum.REGISTRADA;
    }

   private boolean validarUsuario(Usuario usuario) throws AutorizacionException {
       if (isNull(usuario) || isNull(usuario.getId())){
           throw new AutorizacionException(AutorizacionMessageConstant.ERROR_USUARIO_REQUERIDO);
       }

       if (!usuario.isFlgHabilitado()){
           throw  new AutorizacionException(String.format(AutorizacionMessageConstant.ERROR_USUARIO_INHABILITADO, usuario.getId()));
       }

       if (usuario.getRol() != RolEnum.REGISTRADOR){
           throw  new AutorizacionException(String.format(AutorizacionMessageConstant.ERROR_ROL_NO_PUEDE_REGISTRAR, usuario.getId(), usuario.getRol().getDescription()));
       }
       return true;
   }

   private boolean validarMontoPago(BigDecimal montoPago) throws AutorizacionException {
        if(isNull(montoPago)){
            throw new AutorizacionException(AutorizacionMessageConstant.ERROR_MONTO_PAGO_REQUERIDO);
        }

        if(montoPago.compareTo(BigDecimal.ZERO) <= 0){
            throw new AutorizacionException(AutorizacionMessageConstant.ERROR_MONTO_PAGO_MAYOR_A_CERO);
        }

        return true;
   }

    public void enviarParaAsignacion() throws DomainException {
        if(estadoAutorizacion != AutorizacionEstadoEnum.REGISTRADA && estadoAutorizacion != AutorizacionEstadoEnum.OBSERVADA) {
            throw new AutorizacionException(AutorizacionMessageConstant.ERROR_ENVIO_NO_PERMITIDO);
        }

        this.estadoAutorizacion = AutorizacionEstadoEnum.PENDIENTE_DE_ASIGNAR_EVALUADOR;
    }

    public void iniciarEvaluacion(Usuario evaluador) throws AutorizacionException {
        if (estadoAutorizacion != AutorizacionEstadoEnum.PENDIENTE_DE_ASIGNAR_EVALUADOR) {
            throw new AutorizacionException(AutorizacionMessageConstant.ERROR_ESTADO_NO_PERMITE_EVALUACION);
        }

        if (evaluador.getRol() != RolEnum.EVALUADOR) {
            throw new AutorizacionException(String.format(AutorizacionMessageConstant.ERROR_ROL_NO_PUEDE_EVALUAR, evaluador.getId(), evaluador.getRol().getDescription()));
        }

        this.estadoAutorizacion = AutorizacionEstadoEnum.EN_EVALUACION;
    }

    public void actualizarEstadoPorEvaluacion(Evaluacion evaluacion) throws AutorizacionException {
        if (isNull(evaluacion) || isNull(evaluacion.getResultado())) {
            throw new AutorizacionException(AutorizacionMessageConstant.ERROR_RESULTADO_REQUERIDO);
        }

        switch (evaluacion.getResultado()) {
            case APROBADA -> this.estadoAutorizacion = AutorizacionEstadoEnum.APROBADA;
            case OBSERVADA -> this.estadoAutorizacion = AutorizacionEstadoEnum.OBSERVADA;
            case RECHAZADA -> this.estadoAutorizacion = AutorizacionEstadoEnum.RECHAZADA;
        }

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

    @Override
    public boolean valid() throws DomainException {
        return false;
    }

}
