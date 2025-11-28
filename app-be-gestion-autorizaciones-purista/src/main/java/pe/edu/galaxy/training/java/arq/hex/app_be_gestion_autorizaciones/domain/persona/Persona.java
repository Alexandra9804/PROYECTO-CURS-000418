package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.persona;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base.GenericDomain;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;

public class Persona extends GenericDomain {

    private String nombres;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String nroDocumentoIdentidad;

    public Persona(Long id, String nombres, String apellidoMaterno, String apellidoPaterno, String nroDocumentoIdentidad) throws DomainException {
        super(id);
        this.nombres = nombres;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.nroDocumentoIdentidad = nroDocumentoIdentidad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNroDocumentoIdentidad() {
        return nroDocumentoIdentidad;
    }

    @Override
    public boolean valid() throws DomainException {
        return false;
    }
}
