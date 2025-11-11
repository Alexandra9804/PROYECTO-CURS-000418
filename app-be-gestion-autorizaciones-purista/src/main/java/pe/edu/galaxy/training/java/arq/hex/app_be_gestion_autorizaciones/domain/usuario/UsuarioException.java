package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.usuario;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;

public class UsuarioException extends DomainException {
    public UsuarioException() {
    }

    public UsuarioException(String message) {
        super(message);
    }

    public UsuarioException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsuarioException(Throwable cause) {
        super(cause);
    }

    public UsuarioException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
