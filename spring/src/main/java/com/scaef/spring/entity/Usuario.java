package com.scaef.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "CPF", nullable = false, unique = true)
    private String cpf;

    @Column(name = "RG", nullable = false, unique = true)
    private String rg;
    
    @Column(nullable = true, unique = true)
    private String email;

    @Column(nullable = true)
    private int celular;

    @Column(name = "Fone Fixo", nullable = false)
    private int fone;

    @Column(name = "função", nullable = false)
    private String funcao;

    @Column(name = "CRF", nullable = false, unique = true)
    private int crf;
}