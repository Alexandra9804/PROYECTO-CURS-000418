package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.out.autorizacion;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.Autorizacion;

public interface AutorizacionSavePort {
    Long save(Autorizacion autorizacion);
}
