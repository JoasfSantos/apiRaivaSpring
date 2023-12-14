package br.com.raiva.apiRaiva.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @OneToOne
    private Endereco endereco;

    @Column(nullable = false, unique = true)
    private String telefone;

    @Column(nullable = false, unique = true)
    public String cpf;

    @Column(nullable = false)
    private boolean agenteSaude;

    @OneToMany(mappedBy = "usuario")
    @JsonManagedReference
    private List<Caso> casos;

    public Usuario(String nome, LocalDate dataNascimento, Endereco endereco, String telefone, String cpf,
            boolean agenteSaude) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.agenteSaude = agenteSaude;
    }

}