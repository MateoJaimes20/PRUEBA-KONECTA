package com.konecta.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konecta.crud.model.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{
    
}
