package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.evaluacion.constant;

public final class EvaluacionMessageConstant {

    public static final String ERROR_AUTORIZACION_REQUERIDA = "La autorización es requerida.";
    public static final String ERROR_EVALUADOR_REQUERIDO = "El evaluador es obligatorio y debe tener un identificador válido.";
    public static final String ERROR_EVALUADOR_INHABILITADO= "El usuario con id: %d se encuentra inhabilitado.";
    public static final String ERROR_ROL_NO_PUEDE_EVALUAR = "El usuario con id: %d posee el rol '%s', el cual no tiene permisos para evaluar autorizaciones.";
    public static final String ERROR_ESTADO_INVALIDO_PARA_EVALUAR =  "El estado actual de la autorización no permite evaluar.";
    public static final String ERROR_OBSERVACION_REQUERIDA = "Debe ingresar una observación para esta acción.";
    public static final String ERROR_ESTADO_INVALIDO_PARA_ENVIO = "El estado actual de la evaluacion no permite enviar.";
    public static final String ERROR_RESULTADO_REQUERIDO_PARA_ENVIO = "Se requiere el resultado para poder enviar.";
    public static final String ERROR_ESTADO_INVALIDO_PARA_NOTIFICAR = "El estado actual de la evaluacion no permite notificar al registrador.";


    private EvaluacionMessageConstant(){};
}
