package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;

@FunctionalInterface
public interface IsValid {
    boolean valid() throws DomainException;
}
