package br.com.raiva.apiRaiva.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.raiva.apiRaiva.model.UnidadeSaude;
import br.com.raiva.apiRaiva.repository.UnidadeSaudeRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UnidadeSaudeService {

    private final UnidadeSaudeRepository unidadeSaudeRepository;

    public List<UnidadeSaude> buscarPorDistrito(String distrito) {
        return unidadeSaudeRepository.findByDistrito(distrito);
    }

    public List<UnidadeSaude> buscarTodosAsUnidades() {
        return unidadeSaudeRepository.findAll();
    }

}
