package pe.unjfsc.daw.choclotv.choclotv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.unjfsc.daw.choclotv.choclotv.model.entity.Usuario;
import pe.unjfsc.daw.choclotv.choclotv.repository.UsuarioRepository;
import pe.unjfsc.daw.choclotv.choclotv.repository.dao.UsuarioDao;
import pe.unjfsc.daw.choclotv.choclotv.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Iterable<Usuario> listarUsuarios() {
        return usuarioDao.listarUsuarios();
    }

    @Override
    public void guardarUsuarios(List<Usuario> usuarios) {
        usuarioDao.guardarUsuarios(usuarios);
    }
    
}
