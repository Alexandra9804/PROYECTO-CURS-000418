package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.exceptions;

public class AutorizacionApplicationException extends ApplicationException{
    public AutorizacionApplicationException() {
    }

    public AutorizacionApplicationException(String message) {
        super(message);
    }

    public AutorizacionApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutorizacionApplicationException(Throwable cause) {
        super(cause);
    }

    public AutorizacionApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
