package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.exceptions;

public class AutorizacionAdapterDBException extends AdapterDBException{
    public AutorizacionAdapterDBException() {
    }

    public AutorizacionAdapterDBException(String message) {
        super(message);
    }

    public AutorizacionAdapterDBException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutorizacionAdapterDBException(Throwable cause) {
        super(cause);
    }

    public AutorizacionAdapterDBException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
