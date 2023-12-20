package br.com.raiva.apiRaiva.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.raiva.apiRaiva.model.Caso;
import br.com.raiva.apiRaiva.model.Usuario;
import br.com.raiva.apiRaiva.service.CasoService;
import br.com.raiva.apiRaiva.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/casos")
public class CasoController {

    private final UsuarioService usuarioService;
    private final CasoService casoService;

    @GetMapping("")
    public ResponseEntity<List<Caso>> todosOsCasos() {
        List<Caso> casos = casoService.buscarTodosOsCasos();
        if (casos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(casos, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Caso>> casosPorUsuario(@PathVariable String userId) {
        List<Caso> casos = casoService.buscarPorUsuario(Long.parseLong(userId));
        if (casos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(casos, HttpStatus.OK);
    }

    @PostMapping("/registrar/{userId}")
    public ResponseEntity<Caso> registrarCaso(@RequestBody Caso caso, @PathVariable String userId) {
        Optional<Usuario> usuarioOptional = usuarioService.buscarPorId(Long.parseLong(userId));
        if (!usuarioOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Usuario usuario = usuarioOptional.get();
        caso.setUsuario(usuario);
        Caso casoSalvo = casoService.registrarCaso(caso);
        return new ResponseEntity<>(casoSalvo, HttpStatus.CREATED);
    }

}
