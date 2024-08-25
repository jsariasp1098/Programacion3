package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.controller;

import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.controller.service.ICitaControllerService;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.mapping.dto.CitasDto;

import java.util.List;

public class CitaController implements ICitaControllerService {

    @Override
    public List<CitasDto> obtenerCitas() {
        return List.of();
    }

    @Override
    public boolean agregarCita(CitasDto citaDto) {
        return false;
    }

    @Override
    public boolean eliminarCita(String idCita) {
        return false;
    }

    @Override
    public boolean actualizarCita(String idCita, CitasDto citaDto) {
        return false;
    }
}
