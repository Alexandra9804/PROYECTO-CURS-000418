package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base.constant.BaseMessageConstant;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;

public abstract class GenericDomain implements IsValid  {

    protected Long id;

    public GenericDomain(Long id) throws DomainException {
        validateId(id);
        this.id = id;
    }

    protected void validateId(Long id) throws DomainException {
        if(id == null) return;

        if(id <= 0){
            throw new DomainException(String.format(BaseMessageConstant.ERROR_ID_INVALIDO, id));
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) throws DomainException {
        validateId(id);
        this.id = id;
    }
}

