package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.evaluacion;

public enum EvaluacionEstadoEnum {
    EN_EVALUACION(202, "En Evaluación"),
    EVALUADO(203, "Evaluado"),
    NOTIFICADO(204, "Notificado");

    private Integer valor;
    private String descripcion;

    EvaluacionEstadoEnum(Integer valor, String descripcion) {
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
