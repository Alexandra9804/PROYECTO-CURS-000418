package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.constant;

public final class AutorizacionMessageConstant {

    public static final String ERROR_USUARIO_REQUERIDO = "El usuario es requerido.";

    public static final String ERROR_USUARIO_INHABILITADO= "El usuario con id: %d se encuentra inhabilitado.";

    public static final String ERROR_ROL_NO_PUEDE_REGISTRAR = "El usuario con id: %d posee el rol '%s', el cual no tiene permisos para registrar autorizaciones.";

    public static final String ERROR_ENVIO_NO_PERMITIDO = "El estado actual de la autorización no permite que se pueda asignar un evaluador.";

    public static final String ERROR_MONTO_PAGO_REQUERIDO = "El monto de pago es requerido.";

    public static final String ERROR_MONTO_PAGO_MAYOR_A_CERO = "El monto de pago debe ser mayor a cero.";

    public static final String ERROR_ESTADO_NO_PERMITE_EVALUACION = "El estado actual de la autorización no permite evaluar.";

    public static final String ERROR_ROL_NO_PUEDE_EVALUAR = "El usuario con id: %d posee el rol '%s', el cual no tiene permisos para evaluar autorizaciones.";

    private AutorizacionMessageConstant(){};
}

