package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.controller.service;

import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.mapping.dto.CitasDto;

import java.util.List;

public interface ICitaControllerService {
    List<CitasDto> obtenerCitas();

    boolean agregarCita(CitasDto citaDto);

    boolean eliminarCita(String idCita);

    boolean actualizarCita(String idCita, CitasDto citaDto);
}
