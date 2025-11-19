package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base;

public abstract class GenericDomain implements IsValid  {
    protected Long id;
    protected EstadoEnum estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnum estado) {
        this.estado = estado;
    }
}
