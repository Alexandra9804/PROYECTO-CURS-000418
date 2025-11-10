package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;

public class AutorizacionException extends DomainException {
    public AutorizacionException() {
    }

    public AutorizacionException(String message) {
        super(message);
    }

    public AutorizacionException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutorizacionException(Throwable cause) {
        super(cause);
    }

    public AutorizacionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
