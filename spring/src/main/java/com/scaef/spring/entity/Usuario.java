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

    @Column()
    private String Nome;

    @Column()
    private int Cpf;

    @Column()
    private int Rg;
    
    @Column()
    private int Cns;

    @Column()
    private S

    
}