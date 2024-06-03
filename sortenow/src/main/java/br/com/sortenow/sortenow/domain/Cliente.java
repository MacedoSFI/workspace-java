package br.com.sortenow.sortenow.domain;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Getter
public class Cliente {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID idCliente;

    @NotBlank
    private String nomeCompleto;

    @Email
    @Column
    private String email;

    private String celular;

    @NotNull
    private LocalDate dataNascimento;

    @CPF
    @Column(unique = true)
    private String cpf;

    
}
