package com.konecta.crud.service.empleado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konecta.crud.model.Empleado;
import com.konecta.crud.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepository repositorio;


    @Override
    public List<Empleado> ListarEmpleados() {
        return repositorio.findAll();
    }


    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return repositorio.save(empleado);
    }


   

}
