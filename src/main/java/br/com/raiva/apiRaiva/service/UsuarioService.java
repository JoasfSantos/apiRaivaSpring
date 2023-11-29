package br.com.raiva.apiRaiva.service;

import java.util.Optional;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.raiva.apiRaiva.model.Endereco;
import br.com.raiva.apiRaiva.model.Usuario;
import br.com.raiva.apiRaiva.repository.EnderecoRepository;
import br.com.raiva.apiRaiva.repository.UsuarioRepository;
import jakarta.persistence.EntityExistsException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final EnderecoRepository enderecoRepository;

    public Optional<Usuario> autenticacao(Long cpf) {
        return Optional.ofNullable(usuarioRepository.findByCpf(cpf));
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario registrarUsuario(Usuario usuario) {
        Endereco endereco = usuario.getEndereco();
        if (endereco != null) {
            endereco = enderecoRepository.save(endereco);
            usuario.setEndereco(endereco);
        }
        try {
            return usuarioRepository.save(usuario);
        } catch (DataIntegrityViolationException e) {
            throw new EntityExistsException("Usuário já existe com o mesmo CPF");
        }
    }

}
