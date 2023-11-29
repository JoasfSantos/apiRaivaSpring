package br.com.raiva.apiRaiva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raiva.apiRaiva.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
