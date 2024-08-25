package co.edu.uniquindio.salasistemasappfx.salssistemaapp.controller.service;

import co.edu.uniquindio.salasistemasappfx.salssistemaapp.mapping.dto.CitasDto;
import co.edu.uniquindio.salasistemasappfx.salssistemaapp.model.Cita;

import java.util.List;

public interface ICItasControllerService {
    List<CitasDto> obtenerCitas();

    boolean agregarCita(CitasDto citaDto);

    boolean eliminarCita(String idCita);

    boolean actualizarCita(String idCita, CitasDto citaDto);

}
