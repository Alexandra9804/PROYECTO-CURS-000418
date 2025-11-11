package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.usuario;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base.Domain;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;

public class Usuario extends Domain {

    private Long personaId;
    private String username;
    private RolEnum rol;
    private boolean flgHabilitado;

    public Usuario(Long personaId, String username, RolEnum rol, boolean flgHabilitado) {
        this.personaId = personaId;
        this.username = username;
        this.rol = rol;
        this.flgHabilitado = flgHabilitado;
    }

    public Long getPersonaId() {
        return personaId;
    }

    public String getUsername() {
        return username;
    }

    public RolEnum getRol() {
        return rol;
    }

    public boolean isFlgHabilitado() {
        return flgHabilitado;
    }

    @Override
    public boolean valid() throws DomainException {
        return false;
    }
}
