package co.edu.uniquindio.salasistemasappfx.salssistemaapp.controller;

import co.edu.uniquindio.salasistemasappfx.salssistemaapp.controller.service.ICItasControllerService;
import co.edu.uniquindio.salasistemasappfx.salssistemaapp.mapping.dto.CitasDto;

import java.util.List;

public class CitaController implements ICItasControllerService {
    ModelFactoryController modelFactoryController;

    public CitaController() {
        modelFactoryController = ModelFactoryController.getInstance();
    }

    public List<CitasDto> obtenerCitas() {
        return modelFactoryController.obtenerCitas();
    }

    @Override
    public boolean agregarCita(CitasDto citaDto) {
        return modelFactoryController.agregarCita(citaDto);
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
