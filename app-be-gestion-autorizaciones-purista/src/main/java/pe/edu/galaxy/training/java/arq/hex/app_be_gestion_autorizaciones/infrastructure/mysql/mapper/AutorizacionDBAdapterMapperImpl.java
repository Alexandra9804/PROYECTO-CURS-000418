package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.mapper;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.autorizacion.Autorizacion;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.entity.AutorizacionEntity;

@Component
public class AutorizacionDBAdapterMapperImpl implements AutorizacionDBAdapterMapper{
    @Override
    public AutorizacionEntity toEntity(Autorizacion autorizacion) {
        return (AutorizacionEntity) AutorizacionEntity
                .builder()
                .id(autorizacion.getId())
                .idUsuarioSolicitante(autorizacion.getIdUsuarioSolicitante())
                .montoPago(autorizacion.getMontoPago())
                .fechaSolicitud(autorizacion.getFechaSolicitud())
                .fechaFinalizacion(autorizacion.getFechaFinalizacion())
                .estadoAutorizacion(autorizacion.getEstadoAutorizacion().getValor())
                .estadoRegistro(autorizacion.getEstado().getValor())
                .build();
    }
}
