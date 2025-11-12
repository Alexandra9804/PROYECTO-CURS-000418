package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.evaluacion;

public enum EvaluacionResultadoEnum {
    OBSERVADA(301, "Observada"),
    APROBADA(302, "Aprobada"),
    RECHAZADA(303, "Rechazada");

    private Integer valor;
    private String descripcion;

    EvaluacionResultadoEnum(Integer valor, String descripcion) {
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
