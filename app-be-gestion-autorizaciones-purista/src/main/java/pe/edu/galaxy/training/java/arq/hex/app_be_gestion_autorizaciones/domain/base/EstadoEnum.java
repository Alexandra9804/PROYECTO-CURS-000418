package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base;

public enum EstadoEnum {
    ACTIVO(1, "Activo"),
    ELIMINADO(2, "Eliminado");

    private Integer valor;

    private String description;

    EstadoEnum(Integer valor, String description) {
        this.valor = valor;
        this.description = description;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
