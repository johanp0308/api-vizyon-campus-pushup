package com.vizyon.api.appz.persistence.entities;

import org.apache.naming.java.javaURLContextFactory;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_orden")
public class DetalleOrdenEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int prendaId;
    private int cantidadProducir;
    private int cantidaProducida;

    @ManyToOne
    @JoinColumn(name = "IdOrdenFk")
    private OrdenEntity orden;

    @ManyToOne
    @JoinColumn(name = "IdColorFk")
    private ColorEntity color;

    @ManyToOne
    @JoinColumn(name = "IdEstadoFk")
    private EstadoEntity estado;
    
}
