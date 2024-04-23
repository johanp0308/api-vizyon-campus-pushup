package com.vizyon.api.appz.persistence.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class EmpleadoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Date fechaIngreso;
    
    @ManyToOne
    @JoinColumn(name = "IdMunicipioFk")
    private MunicipioEntity municipio;

    @ManyToOne
    @JoinColumn(name = "IdCargoFk")
    private CargosEntity cargo;

    @OneToMany(mappedBy = "empleado")
    private List<VentasEntity> ventas;

    @OneToMany(mappedBy = "empleado")
    private List<OrdenEntity> empleados;




}
