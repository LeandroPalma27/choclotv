package pe.unjfsc.daw.choclotv.choclotv.repository.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import pe.unjfsc.daw.choclotv.choclotv.repository.dao.UsuarioDao;

@Repository
public class UsuarioDaoImpl implements UsuarioDao{

	//private static final Logger LOG = LoggerFactory.getLogger(UsuarioDaoImpl.class);
    
    @PersistenceContext
    private EntityManager em;

    /* @Override
    @SuppressWarnings("unchecked")
    public List<Usuario> listarUsuarios() {
        return em.createQuery("SELECT * FROM usuarios").getResultList();
    } */

    /* @Override
    @Transactional(readOnly = false)
    public void guardarUsuarios(List<Usuario> usuarios) {
        usuarios.forEach(em::persist); 
        em.flush();
        em.clear();      
    } */

}
