package com.konecta.crud.model;

import jakarta.persistence.*;
@Entity
@Table(name="solicitudes")
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_solicitud;

    @Column(name = "codigo", length = 50)
    private String codigo;

    @Column(name = "descripcion", length = 50)
    private String descripcion;

    @Column(name = "resumen", length = 50)
    private String resumen;
    

    public Solicitud(){

    }

    public Solicitud(int id_solicitud, String codigo, String descripcion, String resumen){
        super();
        this.id_solicitud = id_solicitud;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.resumen = resumen;
    }

    public int getId() {
        return id_solicitud;
    }

    public void setId(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    
}
