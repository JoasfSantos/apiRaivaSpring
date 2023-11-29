package br.com.raiva.apiRaiva.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String cidade;

    @Column(nullable = false, length = 200)
    private String bairro;

    @Column(nullable = false, length = 200)
    private String logradouro;

    @Column(length = 8)
    private Long cep;

    @Column
    private Long numero;

    @Column(length = 300)
    private String complemento;

    public Endereco(String cidade, String bairro, String logradouro, Long cep, Long numero, String complemento) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Endereco(String logradouro, Long numero, String bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }

}