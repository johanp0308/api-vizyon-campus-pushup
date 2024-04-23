package com.vizyon.api.appz.persistence.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orden")
public class OrdenEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name = "IdEmpleadoFk")
    private EmpleadoEntity empleado;

    @ManyToOne
    @JoinColumn(name = "IdClienteFk") 
    private ClienteEntity cliente;


}
