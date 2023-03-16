package com.konecta.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.konecta.crud.model.Empleado;
import com.konecta.crud.model.Solicitud;
import com.konecta.crud.service.empleado.EmpleadoService;
import com.konecta.crud.service.solicitud.SolicitudService;


@Controller
public class EmpleadoController {
    @Autowired
    private EmpleadoService servicio;

    @GetMapping("/konecta")
    public String index(){
        return "index";
    }

    //MOSTRAR EMPLEADOS

    @GetMapping("/konecta/empleados")
    public String registroEmpleado(Model model){
        model.addAttribute("empleados", servicio.ListarEmpleados());
        return "empleados";
    }

    //AÑADIR EMPLEADOS

    @GetMapping("/konecta/nuevo/empleado")
    public String registro(Model model){
        Empleado empleado = new Empleado();
        model.addAttribute("empleado", empleado);
        return "registro";
    }

    @PostMapping("/empleados")
    public String guardar(@ModelAttribute("empleado") Empleado empleado){
        servicio.guardarEmpleado(empleado);
        return "redirect:konecta/empleados";
    }

    //MOSTRAR SOLICITUDES

    @Autowired
    private SolicitudService servicioo;

    @GetMapping("/konecta/solicitud")
    public String indexx(Model model){
        model.addAttribute("solicitudes", servicioo. listarSolicitudes());
        return "solicitudes";
    }

    //AÑADIR SOLICITUDES

    @GetMapping("/konecta/nueva/solicitud")
    public String nuevaSolicitud(Model model){
        Solicitud solicitud = new Solicitud();
        model.addAttribute("solicitud", solicitud);
        return "añadir_solicitud";
    }

    @PostMapping("/solicitudes")
    public String guardarSolicitudNueva(@ModelAttribute("solicitud") Solicitud solicitud){
        servicioo.guardarSolicitud(solicitud);
        return "redirect:konecta/solicitudes";
    }
}   
