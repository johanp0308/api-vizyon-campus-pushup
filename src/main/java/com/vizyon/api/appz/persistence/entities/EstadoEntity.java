package com.vizyon.api.appz.persistence.entities;

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
@Table(name = "estado")
public class EstadoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    
    @OneToMany(mappedBy = "estado")
    private List<PrendaEntity> prendas;

    @OneToMany(mappedBy = "estado")
    private List<DetalleOrdenEntity> detalles;

    @OneToMany(mappedBy = "estado")
    private List<OrdenEntity> ordenes;

    @ManyToOne
    @JoinColumn(name = "IdTipoEstadoFK")
    private TipoEstadoEntity tipoEstado;

    
}
