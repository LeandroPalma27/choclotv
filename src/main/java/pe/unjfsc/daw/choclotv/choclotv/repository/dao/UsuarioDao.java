package pe.unjfsc.daw.choclotv.choclotv.repository.dao;

import java.util.List;

import pe.unjfsc.daw.choclotv.choclotv.model.entity.Usuario;

public interface UsuarioDao {

    public List<Usuario> listarUsuarios();

    public void guardarUsuarios(List<Usuario> usuarios);

}
