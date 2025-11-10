package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.persona;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base.Domain;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;

public class Persona extends Domain {
    @Override
    public boolean valid() throws DomainException {
        return false;
    }
}
