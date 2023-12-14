package br.com.raiva.apiRaiva.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.raiva.apiRaiva.model.Usuario;
import br.com.raiva.apiRaiva.service.UsuarioService;
import jakarta.persistence.EntityExistsException;
import lombok.RequiredArgsConstructor;

import br.com.raiva.apiRaiva.utils.CPFValidator;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping("/autenticacao")
    public ResponseEntity<Object> autenticacao(@RequestBody Usuario data) {
        try {
            boolean isCPFValid = CPFValidator.isValidCPF(data.cpf);
            if (!isCPFValid) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

            Optional<Usuario> usuarioOptional = usuarioService.autenticacao(data.cpf);
            if (!usuarioOptional.isPresent()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            Usuario usuario = usuarioOptional.get();
            return new ResponseEntity<>(usuario, HttpStatus.OK);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            return null;
        }
    }

    @PostMapping("/registrar-usuario")
    public ResponseEntity<?> criarUsuario(@RequestBody Usuario usuario) {
        try {
            Usuario usuarioSalvo = usuarioService.registrarUsuario(usuario);
            return new ResponseEntity<>(usuarioSalvo, HttpStatus.CREATED);
        } catch (EntityExistsException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

}
