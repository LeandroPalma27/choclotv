package pe.unjfsc.daw.choclotv.choclotv.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import pe.unjfsc.daw.choclotv.choclotv.model.entity.Titulo;

@Repository
public interface TituloRepository extends PagingAndSortingRepository<Titulo, Long>{
    
}
