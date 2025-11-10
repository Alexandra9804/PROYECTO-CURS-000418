package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion;

public enum AutorizacionEstadoEnum
{

    REGISTRADA(10, "Registrada"),

    PENDIENTE_DE_ASIGNAR_EVALUADOR(11, "Pendiente de Asignar Evaluador"),
    EN_EVALUACION(12, "En Evaluación"),
    OBSERVADA(13, "Observada"),
    APROBADA(14, "Aprobada"),
    RECHAZADA(15, "Rechazada");

    private Integer valor;
    private String descripcion;

    AutorizacionEstadoEnum(Integer valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
