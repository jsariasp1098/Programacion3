package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.controller;

import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.controller.service.IModelFactoryService;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.mapping.dto.CitasDto;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.Cita;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.Cliente;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.Empleado;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.SalaSistemas;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.utils.SalaSistemasUtils;

import java.util.ArrayList;
import java.util.List;

public class ModelFactoryController implements IModelFactoryService {
    SalaSistemas salaSistemas;
   //  CitasMapper mapper = CitasMapper.INSTANCE;

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

    public SalaSistemas getSalaSistemas() {
        return salaSistemas;
    }

    public void setSalaSistemas(SalaSistemas salaSistemas) {
        this.salaSistemas = salaSistemas;
    }

    @Override
    public List<CitasDto> obtenerCitas() {
        List<Cita> listCita = salaSistemas.getListCitas();
        List<CitasDto> listCitasDto = new ArrayList<>();

        for(Cita cita: listCita){
            listCitasDto.add(buildCitaDto(cita));
        }

        return listCitasDto;
    }

    private CitasDto buildCitaDto(Cita cita) {
        return  new CitasDto(
                cita.getIdCita(),
                cita.getCliente().getIdCliente(),
                cita.getCliente().getNombre(),
                cita.getSala(),
                cita.getComputador(),
                cita.getFecha(),
                cita.getHoraInicio()
        );

    }

    @Override
    public boolean agregarCita(CitasDto citaDto) {
        boolean resulAgregarCita = false;
        if(!salaSistemas.verificarCita(citaDto.fechaCita(), citaDto.horaInicio(), citaDto.salonAsigando(), citaDto.computador())){
               Cita cita = buildCita(citaDto);
               if(cita.getIdCita() != null) {
                    resulAgregarCita = getSalaSistemas().agregarCita(cita);
               }
        }else {
            resulAgregarCita = false;
        }
        return resulAgregarCita;
    }

    private Cita buildCita(CitasDto citaDto) {
        List<Cita> listCita = salaSistemas.getListCitas();
        Cita cita = new Cita();
        for(Cita cita1: listCita){
            if(cita1.getCliente().getIdCliente().equals(citaDto.idUsuario())){
                cita.setIdCita(obtenerIdCita());
                cita.setFecha(citaDto.fechaCita());
                cita.setHoraInicio(citaDto.horaInicio());
                cita.setSala(citaDto.salonAsigando());
                cita.setComputador(citaDto.computador());
                cita.setEmpleado(obtenerEmpleado());
                cita.setCliente(obtenerCliente(citaDto.idUsuario()));
            }
        }
        return cita;
    }

    private Cliente obtenerCliente(String idCliente) {
        Cliente cliente = salaSistemas.obtenerCliente(idCliente);
        return cliente;
    }

    private Empleado obtenerEmpleado() {
        Empleado empleado = salaSistemas.getListEmpleados().get(0);
        return empleado;
    }

    private String obtenerIdCita() {
        int IdCita = salaSistemas.getListCitas().size();
        String idCita = IdCita +"";
        return idCita;
    }


    @Override
    public boolean eliminarCita(String idCita) {
        return getSalaSistemas().eliminarCita(idCita);
    }

    @Override
    public boolean actualizarCita(String idCita, CitasDto citaDto) {
        Cita cita = buildCita(citaDto);
        return getSalaSistemas().actualizarCita(idCita, cita);
    }
}
