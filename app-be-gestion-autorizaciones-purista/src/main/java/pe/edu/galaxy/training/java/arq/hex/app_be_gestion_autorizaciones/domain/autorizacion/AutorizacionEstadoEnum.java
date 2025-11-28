package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion;

import java.util.Arrays;

public enum AutorizacionEstadoEnum
{
    REGISTRADA(100, "Registrada"),
    PENDIENTE_DE_ASIGNAR_EVALUADOR(111, "Pendiente de Asignar Evaluador"),
    EN_EVALUACION(112, "En Evaluación"),
    OBSERVADA(113, "Observada"),
    APROBADA(114, "Aprobada"),
    RECHAZADA(115, "Rechazada");

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

    public static AutorizacionEstadoEnum getByValor(Integer valor){
        return Arrays.stream(AutorizacionEstadoEnum.values())
                .filter(tipo -> tipo.getValor().equals(valor))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Valor no válido"));
    }
}
