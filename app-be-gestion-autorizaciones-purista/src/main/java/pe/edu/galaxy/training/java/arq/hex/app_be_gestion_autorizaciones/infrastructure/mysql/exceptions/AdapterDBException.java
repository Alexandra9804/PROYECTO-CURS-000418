package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.exceptions;

public class AdapterDBException extends Exception{
    public AdapterDBException() {
    }

    public AdapterDBException(String message) {
        super(message);
    }

    public AdapterDBException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdapterDBException(Throwable cause) {
        super(cause);
    }

    public AdapterDBException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
