package br.com.raiva.apiRaiva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raiva.apiRaiva.model.Caso;

import java.util.List;


public interface CasoRepository extends JpaRepository<Caso, Long>{
    
    List<Caso> findByUsuario_Id(Long usuarioId);

}
