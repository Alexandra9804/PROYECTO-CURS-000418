package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.adapter;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.exceptions.AutorizacionApplicationException;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.out.autorizacion.AutorizacionSavePort;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.Autorizacion;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.entity.AutorizacionEntity;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.mapper.AutorizacionDBAdapterMapper;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.repository.AutorizacionRepository;

public class AutorizacionDBMySQLAdapter implements AutorizacionSavePort {

    private final AutorizacionRepository autorizacionRepository;
    private final AutorizacionDBAdapterMapper autorizacionDBAdapterMapper;

    public AutorizacionDBMySQLAdapter(AutorizacionRepository autorizacionRepository, AutorizacionDBAdapterMapper autorizacionDBAdapterMapper) {
        this.autorizacionRepository = autorizacionRepository;
        this.autorizacionDBAdapterMapper = autorizacionDBAdapterMapper;
    }

    @Override
    public Long save(Autorizacion autorizacion) throws AutorizacionApplicationException {
        try {
            AutorizacionEntity prmAutorizacionEntity = autorizacionDBAdapterMapper.toEntity(autorizacion);
            AutorizacionEntity autorizacionEntity = autorizacionRepository.save(prmAutorizacionEntity);
            return autorizacionEntity.getId();
        } catch (Exception e) {
            throw new AutorizacionApplicationException(e);
        }
    }
}
