package br.com.raiva.apiRaiva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.raiva.apiRaiva.model.Caso;
import br.com.raiva.apiRaiva.repository.CasoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CasoService {

    private final CasoRepository casoRepository;

    public Caso registrarCaso(Caso caso) {
        return casoRepository.save(caso);
    }

    public Optional<Caso> buscarPorId(Long id) {
        return casoRepository.findById(id);
    }

    public List<Caso> buscarPorUsuario(Long id) {
        return casoRepository.findByUsuario_Id(id);
    }

    public List<Caso> buscarTodosOsCasos() {
        return casoRepository.findAll();
    }

}
