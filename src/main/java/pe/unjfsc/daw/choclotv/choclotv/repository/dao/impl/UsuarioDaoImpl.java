package pe.unjfsc.daw.choclotv.choclotv.repository.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.unjfsc.daw.choclotv.choclotv.model.entity.Usuario;
import pe.unjfsc.daw.choclotv.choclotv.repository.dao.UsuarioDao;

@Repository
public class UsuarioDaoImpl implements UsuarioDao{

	private static final Logger LOG = LoggerFactory.getLogger(UsuarioDaoImpl.class);
    
    @PersistenceContext
    private EntityManager em;

    @Override
    @SuppressWarnings("unchecked")
    public List<Usuario> listarUsuarios() {
        return em.createQuery("SELECT * FROM usuarios").getResultList();
    }

    // Corregir transaccion
    @Override
    @Transactional(readOnly = false)
    public void guardarUsuarios(List<Usuario> usuarios) {
        usuarios.forEach(em::persist); 
        em.flush();
        em.clear();      
    }

}
