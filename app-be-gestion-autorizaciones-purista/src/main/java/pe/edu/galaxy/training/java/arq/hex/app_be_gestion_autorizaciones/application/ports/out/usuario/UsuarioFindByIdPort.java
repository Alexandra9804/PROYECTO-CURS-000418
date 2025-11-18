package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.ports.out.usuario;

import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.exceptions.UsuarioApplicationException;
import pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.domain.usuario.Usuario;

import java.util.Optional;

public interface UsuarioFindByIdPort {
    Optional<Usuario> findById(Long id) throws UsuarioApplicationException;
}
