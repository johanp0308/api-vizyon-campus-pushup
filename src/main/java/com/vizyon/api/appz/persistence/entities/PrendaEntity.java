package com.vizyon.api.appz.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "")
public class PrendaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double valorUnitCop;
    private double valorUnitUsd;
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "IdGeneroFk")
    private GeneroEntity genero;

    @ManyToOne
    @JoinColumn(name = "IdTIpoProteccion")
    private TipoProteccionEntity proteccionEntity;

    @ManyToOne
    @JoinColumn(name = "IdEstadoFk")
    private EstadoEntity estado;
}
