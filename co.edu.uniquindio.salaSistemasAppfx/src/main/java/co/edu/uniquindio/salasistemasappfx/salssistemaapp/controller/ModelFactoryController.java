package co.edu.uniquindio.salasistemasappfx.salssistemaapp.controller;

import co.edu.uniquindio.salasistemasappfx.salssistemaapp.controller.service.IModelFactoryService;
import co.edu.uniquindio.salasistemasappfx.salssistemaapp.exceptions.CitasException;
import co.edu.uniquindio.salasistemasappfx.salssistemaapp.mapping.dto.CitasDto;
import co.edu.uniquindio.salasistemasappfx.salssistemaapp.model.Cita;
import co.edu.uniquindio.salasistemasappfx.salssistemaapp.model.SalaSistemas;
import co.edu.uniquindio.salasistemasappfx.salssistemaapp.utils.SalaSistemasUtils;

import java.util.List;

public class ModelFactoryController implements IModelFactoryService {

    SalaSistemas salaSistemas;
    CitasMapper mapper = CitasMapper.INSTANCE;

    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        cargarDatosBase();
    }

    private void cargarDatosBase() {
        salaSistemas = SalaSistemasUtils.inicializarDatos();
    }

    public SalaSistemas getSalaSistemas(){
        return salaSistemas;
    }
    @Override
    public List<CitasDto> obtenerCitas() {
        return mapper.getCitasDto(SalaSistemas.getListCitas());
    }

    public boolean agregarCita(CitasDto citaDto) {
        try{
            if(!SalaSistemas.verificarCitaExistente(citaDto.idUsuario())) {
                Cita cita = mapper.citasDtoToCita(citaDto);
                getSalaSistemas().agregarCitas(cita);
            }
            return true;
        }catch (CitasException e){
            e.getMessage();
            return false;
        }
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
