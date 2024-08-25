package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.controller;

import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.controller.service.ISalaSistemasControllerServices;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.mapping.dto.CitasDto;

import java.util.List;

public class SalaSistemasControllerController implements ISalaSistemasControllerServices {
    ModelFactoryController modelFactoryController;

    public SalaSistemasControllerController() {
        modelFactoryController = ModelFactoryController.getInstance();
    }

    @Override
    public List<CitasDto> obtenerCitas() {
        return modelFactoryController.obtenerCitas();
    }

    @Override
    public boolean agregarCita(CitasDto citaDto) {
        return modelFactoryController.agregarCita(citaDto);
    }

    @Override
    public boolean eliminarCita(String idCita) {
        return modelFactoryController.eliminarCita(idCita);
    }

    @Override
    public boolean actualizarCita(String idCitaActual, CitasDto citaDto) {
        return modelFactoryController.actualizarCita(idCitaActual, citaDto);
    }
}
