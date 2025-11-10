package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.constant;

public final class AutorizacionMessageConstant {
    public static final String ERROR_SOLICITANTE_INVALIDO = "Debe existir un usuario solicitante válido para la autorización.";

    public static final String ERROR_MONTO_INVALIDO = "El monto de pago debe ser mayor a cero.";

    public static final String ERROR_FECHA_OBLIGATORIA = "La fecha de solicitud es obligatoria.";

    public static final String ERROR_FECHA_INVALIDA = "La fecha de solicitud no puede ser posterior a la fecha actual.";

    public static final String ERROR_ESTADO_OBLIGATORIO = "La autorización debe tener un estado definido.";

    public static final String ERROR_ENVIO_NO_PERMITIDO = "El estado actual de la autorización no permite que se pueda asignar un evaluador.";

    private AutorizacionMessageConstant(){};
}

