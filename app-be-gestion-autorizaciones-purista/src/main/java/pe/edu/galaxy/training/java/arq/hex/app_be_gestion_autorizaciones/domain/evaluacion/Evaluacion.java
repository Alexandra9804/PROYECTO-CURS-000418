package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.evaluacion;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.Autorizacion;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base.Domain;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.evaluacion.constant.EvaluacionMessageConstant;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.usuario.RolEnum;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.usuario.Usuario;

import java.time.LocalDateTime;
import static java.util.Objects.isNull;

public class Evaluacion extends Domain {

    private Long autorizacionId;
    private Integer nroEvaluacion;
    private Long evaluadorId;

    private EvaluacionResultadoEnum resultado;
    private EvaluacionEstadoEnum estadoEvaluacion;
    private String observacion;
    private LocalDateTime fechaEvaluacion;

    public Evaluacion(Autorizacion autorizacion, Usuario evaluador) throws EvaluacionException {
        this.validarAutorizacion(autorizacion.getId());
        this.autorizacionId = autorizacion.getId();
        this.validarEvaluador(evaluador);
        this.evaluadorId = evaluador.getId();
        this.estadoEvaluacion = EvaluacionEstadoEnum.EN_EVALUACION;
    }

    private void validarAutorizacion(Long autorizacionId) throws EvaluacionException {
        if (isNull(autorizacionId) || autorizacionId <= 0) {
            throw new EvaluacionException(EvaluacionMessageConstant.ERROR_AUTORIZACION_REQUERIDA);
        }
    }

    private void validarEvaluador(Usuario evaluador) throws EvaluacionException {
        if (isNull(evaluador) || isNull(evaluador.getId())) {
            throw new EvaluacionException(EvaluacionMessageConstant.ERROR_EVALUADOR_REQUERIDO);
        }

        if (!evaluador.isFlgHabilitado()) {
            throw new EvaluacionException(String.format(EvaluacionMessageConstant.ERROR_EVALUADOR_INHABILITADO, evaluador.getId()));
        }

        if (evaluador.getRol() != RolEnum.EVALUADOR) {
            throw new EvaluacionException(String.format(EvaluacionMessageConstant.ERROR_ROL_NO_PUEDE_EVALUAR,
                    evaluador.getId(), evaluador.getRol().getDescription()));
        }
    }

    public void aprobar() throws EvaluacionException{
        if (estadoEvaluacion != EvaluacionEstadoEnum.EN_EVALUACION) {
            throw new EvaluacionException(EvaluacionMessageConstant.ERROR_ESTADO_INVALIDO_PARA_EVALUAR);
        }

        this.resultado = EvaluacionResultadoEnum.APROBADA;
    }

    public void observar(String observacion) throws EvaluacionException {
        if (estadoEvaluacion != EvaluacionEstadoEnum.EN_EVALUACION) {
            throw new EvaluacionException(EvaluacionMessageConstant.ERROR_ESTADO_INVALIDO_PARA_EVALUAR);
        }

        if (isNull(observacion) || observacion.isBlank()) {
            throw new EvaluacionException(EvaluacionMessageConstant.ERROR_OBSERVACION_REQUERIDA);
        }

        this.resultado = EvaluacionResultadoEnum.OBSERVADA;
        this.observacion = observacion.trim();
    }

    public void rechazar(String observacion) throws EvaluacionException {
        if (estadoEvaluacion != EvaluacionEstadoEnum.EN_EVALUACION) {
            throw new EvaluacionException(EvaluacionMessageConstant.ERROR_ESTADO_INVALIDO_PARA_EVALUAR);
        }

        if (isNull(observacion) || observacion.isBlank()) {
            throw new EvaluacionException(EvaluacionMessageConstant.ERROR_OBSERVACION_REQUERIDA);
        }

        this.resultado = EvaluacionResultadoEnum.RECHAZADA;
        this.observacion = observacion.trim();
    }

    public void enviarEvaluacion() throws EvaluacionException {
        if (estadoEvaluacion != EvaluacionEstadoEnum.EN_EVALUACION) {
            throw new EvaluacionException(EvaluacionMessageConstant.ERROR_ESTADO_INVALIDO_PARA_ENVIO);
        }

        if (isNull(resultado)) {
            throw new EvaluacionException(EvaluacionMessageConstant.ERROR_RESULTADO_REQUERIDO_PARA_ENVIO);
        }

        this.fechaEvaluacion = LocalDateTime.now();
        this.estadoEvaluacion = EvaluacionEstadoEnum.EVALUADO;
    }

    public void notificarRegistrador() throws EvaluacionException {
        if (estadoEvaluacion != EvaluacionEstadoEnum.EVALUADO) {
            throw new EvaluacionException(EvaluacionMessageConstant.ERROR_ESTADO_INVALIDO_PARA_NOTIFICAR);
        }

        this.estadoEvaluacion = EvaluacionEstadoEnum.NOTIFICADO;
    }
    public Long getAutorizacionId() {
        return autorizacionId;
    }

    public Integer getNroEvaluacion() {
        return nroEvaluacion;
    }

    public Long getEvaluadorId() {
        return evaluadorId;
    }

    public EvaluacionResultadoEnum getResultado() {
        return resultado;
    }

    public EvaluacionEstadoEnum getEstadoEvaluacion() {
        return estadoEvaluacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public LocalDateTime getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    @Override
    public boolean valid() throws DomainException {
        return false;
    }
}
