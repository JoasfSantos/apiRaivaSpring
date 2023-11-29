package br.com.raiva.apiRaiva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raiva.apiRaiva.model.UnidadeSaude;

public interface UnidadeSaudeRepository extends JpaRepository<UnidadeSaude, Long> {

    List<UnidadeSaude> findByDistrito(String distrito);

}
