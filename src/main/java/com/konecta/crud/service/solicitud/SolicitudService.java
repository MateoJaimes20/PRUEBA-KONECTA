package com.konecta.crud.service.solicitud;
import java.util.List;

import com.konecta.crud.model.Solicitud;

public interface SolicitudService {
    public List<Solicitud> listarSolicitudes();
    public Solicitud guardarSolicitud(Solicitud solicitud);
}
