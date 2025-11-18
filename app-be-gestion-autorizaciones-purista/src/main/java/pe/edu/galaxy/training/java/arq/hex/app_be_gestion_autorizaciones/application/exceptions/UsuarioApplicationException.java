package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.exceptions;

public class UsuarioApplicationException extends ApplicationException{
    public UsuarioApplicationException() {
    }

    public UsuarioApplicationException(String message) {
        super(message);
    }

    public UsuarioApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsuarioApplicationException(Throwable cause) {
        super(cause);
    }

    public UsuarioApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
