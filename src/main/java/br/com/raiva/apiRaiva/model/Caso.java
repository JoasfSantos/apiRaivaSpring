package br.com.raiva.apiRaiva.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Caso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String nomeVitima;

    @Column(nullable = false)
    private Integer idadeVitima;

    @Column(nullable = false)
    private LocalDate dataOcorrido;

    @Column(nullable = false, length = 200)
    private String bairroOcorrido;

    @Column(length = 200)
    private String ruaOcorrido;

    @Column(nullable = false)
    private String localMordida;

    @Column(nullable = false)
    private String tipoAnimal;

    @Column(nullable = false)
    private boolean domestico;

    @Column(nullable = false)
    private boolean vacinado;

    @ManyToOne
    private Usuario usuario;

    public Caso(String nomeVitima, Integer idadeVitima, LocalDate dataOcorrido, String bairroOcorrido, String ruaOcorrido,
            String localMordida, String tipoAnimal, boolean domestico, boolean vacinado) {
        this.nomeVitima = nomeVitima;
        this.idadeVitima = idadeVitima;
        this.dataOcorrido = dataOcorrido;
        this.bairroOcorrido = bairroOcorrido;
        this.ruaOcorrido = ruaOcorrido;
        this.localMordida = localMordida;
        this.tipoAnimal = tipoAnimal;
        this.domestico = domestico;
        this.vacinado = vacinado;
    }

}