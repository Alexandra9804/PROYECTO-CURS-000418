package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.repository;

import org.springframework.stereotype.Repository;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.entity.AutorizacionEntity;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.repository.base.GenericRepository;

@Repository
public interface AutorizacionRepository extends GenericRepository<AutorizacionEntity, Long> {
}
