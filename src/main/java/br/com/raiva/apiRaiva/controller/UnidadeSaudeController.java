package br.com.raiva.apiRaiva.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.raiva.apiRaiva.model.UnidadeSaude;
import br.com.raiva.apiRaiva.service.UnidadeSaudeService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/unidades-por-distrito")
public class UnidadeSaudeController {

    private final UnidadeSaudeService unidadeSaudeService;

    @GetMapping
    public ResponseEntity<List<UnidadeSaude>> unidadesPorDistrito(@RequestParam String distrito) {
        List<UnidadeSaude> unidades = unidadeSaudeService.buscarPorDistrito(distrito);
        if (unidades.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(unidades, HttpStatus.OK);
    }

}
