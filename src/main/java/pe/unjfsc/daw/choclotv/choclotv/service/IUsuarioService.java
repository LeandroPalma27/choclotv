package pe.unjfsc.daw.choclotv.choclotv.service;

import java.util.List;

import pe.unjfsc.daw.choclotv.choclotv.model.entity.Usuario;

public interface IUsuarioService {
    
    public Iterable<Usuario> listarUsuarios();

    public void guardarUsuarios(List<Usuario> usuarios);

}
