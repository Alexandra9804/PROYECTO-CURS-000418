package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.mapper;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.Autorizacion;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.entity.AutorizacionEntity;

public interface AutorizacionDBAdapterMapper {
    AutorizacionEntity toEntity(Autorizacion autorizacion);
}
