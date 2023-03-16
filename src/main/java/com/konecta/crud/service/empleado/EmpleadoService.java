package com.konecta.crud.service.empleado;

import java.util.List;

import com.konecta.crud.model.Empleado;

public interface EmpleadoService {
    public List<Empleado> ListarEmpleados();
    public Empleado guardarEmpleado(Empleado empleado);
}
