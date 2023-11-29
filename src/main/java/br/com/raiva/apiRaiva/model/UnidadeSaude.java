package br.com.raiva.apiRaiva.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class UnidadeSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(nullable = false, length = 200)
    private String distrito;

    @OneToOne
    private Endereco endereco;

    @Column(nullable = false)
    private List<String> telefones;

    public UnidadeSaude(String distrito, String nome, Endereco endereco, List<String> telefones) {
        this.distrito = distrito;
        this.nome = nome;
        this.endereco = endereco;
        this.telefones = telefones;
    }

}