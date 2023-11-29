package br.com.raiva.apiRaiva.service;

import org.springframework.stereotype.Service;

import br.com.raiva.apiRaiva.model.Endereco;
import br.com.raiva.apiRaiva.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public Endereco registrarEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }

}
