package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.evaluacion;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base.Domain;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;

public class Evaluacion extends Domain {
    @Override
    public boolean valid() throws DomainException {
        return false;
    }
}
