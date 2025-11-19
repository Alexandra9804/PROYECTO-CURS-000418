package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@MappedSuperclass
public class GenericEntity {

    @Column(name = "estado_registro", nullable = false)
    protected Integer estadoRegistro; //0: Inactivo 1:Activo
}
