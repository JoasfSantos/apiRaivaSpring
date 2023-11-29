package br.com.raiva.apiRaiva.controller;

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

import br.com.raiva.apiRaiva.model.Caso;
import br.com.raiva.apiRaiva.model.Usuario;
import br.com.raiva.apiRaiva.service.CasoService;
import br.com.raiva.apiRaiva.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/caso")
public class CasoController {

    private final UsuarioService usuarioService;
    private final CasoService casoService;

    @GetMapping("/casos-por-usuario")
    public ResponseEntity<List<Caso>> casosPorUsuario(@RequestParam Long usuarioId) {
        List<Caso> casos = casoService.buscarPorUsuario(usuarioId);
        if (casos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(casos, HttpStatus.OK);
    }

    @PostMapping("/registrar-caso")
    public ResponseEntity<Caso> registrarCaso(@RequestBody Caso caso, @RequestParam Long usuarioId) {
        Optional<Usuario> usuarioOptional = usuarioService.buscarPorId(usuarioId);
        if (!usuarioOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Usuario usuario = usuarioOptional.get();
        caso.setUsuario(usuario);
        Caso casoSalvo = casoService.registrarCaso(caso);
        return new ResponseEntity<>(casoSalvo, HttpStatus.CREATED);
    }

}
