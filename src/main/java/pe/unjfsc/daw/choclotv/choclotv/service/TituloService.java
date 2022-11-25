package pe.unjfsc.daw.choclotv.choclotv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.unjfsc.daw.choclotv.choclotv.model.entity.Titulo;
import pe.unjfsc.daw.choclotv.choclotv.repository.TituloRepository;
import pe.unjfsc.daw.choclotv.choclotv.service.impl.ITituloService;

@Service
public class TituloService implements ITituloService{

    @Autowired
    TituloRepository tituloRepository;

    @Override
    public Iterable<Titulo> listarTitulos() {
        return tituloRepository.findAll();
    }
    
}
