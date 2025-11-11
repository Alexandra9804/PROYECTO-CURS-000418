package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.usuario;

public enum RolEnum {
    REGISTRADOR(1, "Registrador"),
    EVALUADOR(2, "Evaluador"),
    ADMINISTRADOR (3, "Administrador");

    private Integer value;
    private String description;

    RolEnum(Integer value, String description) {
        this.value = value;
        this.description = description;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
