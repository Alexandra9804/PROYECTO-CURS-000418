package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.evaluacion;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.base.Domain;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.exceptions.DomainException;

import java.time.LocalDateTime;

public class Evaluacion extends Domain {

    private Long autorizacionId;
    private Long evaluadorId;
    private EvaluacionEstadoEnum estadoEvaluacion;
    private LocalDateTime fechaEvaluacion;

    @Override
    public boolean valid() throws DomainException {
        return false;
    }
}
