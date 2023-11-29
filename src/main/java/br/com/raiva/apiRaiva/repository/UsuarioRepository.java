package br.com.raiva.apiRaiva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raiva.apiRaiva.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByCpf(Long cpf);

}
