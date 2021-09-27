package com.scaef.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(name = "CNS", nullable = false, unique = true)
    private String cns;

    @Column(name = "CPF", nullable = false, unique = true)
    private String cpf;
    
    @Column(name = "d. nascimento", nullable = false)
    private String dNasc;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "município", nullable = false)
    private String mun;
    
    @Column(name = "endereço", nullable = false)
    private String endr;
    
    @Column(name = "complemento", nullable = false)
    private String comp;
    
    @Column(name = "CEP", nullable = false)
    private int cep;
    
    @Column(nullable = false)
    private int num;
    
    @Column(nullable = false)
    private int celular;
    
    @Column(name = "Fone Fixo", nullable = false)
    private int fone;
}