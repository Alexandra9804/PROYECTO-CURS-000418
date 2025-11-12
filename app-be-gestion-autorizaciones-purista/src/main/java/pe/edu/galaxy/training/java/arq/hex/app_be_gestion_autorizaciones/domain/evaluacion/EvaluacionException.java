package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.evaluacion;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;

public class EvaluacionException extends DomainException {
    public EvaluacionException() {
    }

    public EvaluacionException(String message) {
        super(message);
    }

    public EvaluacionException(String message, Throwable cause) {
        super(message, cause);
    }

    public EvaluacionException(Throwable cause) {
        super(cause);
    }

    public EvaluacionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
