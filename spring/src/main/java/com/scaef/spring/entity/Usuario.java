package com.scaef.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false)
    private String Nome;

    @Column(nullable = false,unique = true)
    private int Cpf;

    @Column()
    private int Rg;
    
    @Column()
    private int Cns;

    @Column()
    private String email;

    
}