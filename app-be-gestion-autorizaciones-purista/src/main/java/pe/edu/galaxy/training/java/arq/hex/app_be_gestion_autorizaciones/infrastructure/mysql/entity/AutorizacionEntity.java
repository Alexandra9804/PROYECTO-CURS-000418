package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.infrastructure.mysql.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "tbl_autorizacion")
@Entity
public class AutorizacionEntity extends GenericEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autorizacion_id", nullable = false)
    private Long id;

    @NotNull(message = "El id del usuario es requerido")
    @Column(name = "usuario_solicitante_id", nullable = false)
    private Long idUsuarioSolicitante;

    @Column(name = "monto_pago", nullable = false)
    private BigDecimal montoPago;

    @Column(name = "fecha_solicitud", nullable = false)
    private LocalDateTime fechaSolicitud;

    @Column(name = "fecha_finalizacion", nullable = false)
    private LocalDateTime fechaFinalizacion;

    @Column(name = "estado_autorizacion", nullable = false)
    private Integer estadoAutorizacion;
}
