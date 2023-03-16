package com.konecta.crud.model;

import java.sql.Date;


import jakarta.persistence.*;

@Entity
@Table(name="empleados")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fechaIngreso", nullable = false)
    private Date fechaIngreso;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "salario", nullable = false)
    private double salario;

    public Empleado(){

    }

    public Empleado(int id, Date fechaIngreso, String nombre, double salario ){
        super();
        this.id = id;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
