package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model;

import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.service.ISalaSistemasService;

import java.time.LocalDate;
import java.util.ArrayList;

public class SalaSistemas implements ISalaSistemasService {
    private String idNegocio;
    private String nombrenegocio;
    private String direccion;

    ArrayList<Cliente> listCliente = new ArrayList<>();
    ArrayList<Cita> listCitas = new ArrayList<>();
    ArrayList<Empleado> listEmpleados = new ArrayList<>();

    public SalaSistemas() {

    }

    public SalaSistemas(String idNegocio, String nombrenegocio, String direccion) {
        this.idNegocio = idNegocio;
        this.nombrenegocio = nombrenegocio;
        this.direccion = direccion;
    }

    public String getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(String idNegocio) {
        this.idNegocio = idNegocio;
    }

    public String getNombrenegocio() {
        return nombrenegocio;
    }

    public void setNombrenegocio(String nombrenegocio) {
        this.nombrenegocio = nombrenegocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Cliente> getListCliente() {
        return listCliente;
    }

    public void setListCliente(ArrayList<Cliente> listCliente) {
        this.listCliente = listCliente;
    }

    public ArrayList<Cita> getListCitas() {
        return listCitas;
    }

    public void setListCitas(ArrayList<Cita> listCitas) {
        this.listCitas = listCitas;
    }

    public ArrayList<Empleado> getListEmpleados() {
        return listEmpleados;
    }

    public void setListEmpleados(ArrayList<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }

    public boolean verificarCita(LocalDate fechaVerifcar, String horaVerificar, String salonAsignado, String computador) {
        boolean resultConsulta = false;
       for(Cita cita : listCitas){
            if(cita.getFecha().equals(fechaVerifcar) && cita.getHoraInicio().equals(horaVerificar)
            && cita.getSala().equals(salonAsignado) && cita.getComputador().equals(computador)){
                resultConsulta = true;
                break;
            }else
                resultConsulta = false;
        }
       return resultConsulta;
    }

    @Override
    public boolean agregarCita(Cita cita) {
        boolean resultConsulta = false;
        for(Cliente cliente1 : listCliente){
            if(cliente1.getIdCliente().equals(cita.cliente.getIdCliente())){
                listCitas.add(cita);
                resultConsulta=true;
                break;
            }else{
                resultConsulta = false;
            }
        }
        return resultConsulta;
    }

    @Override
    public boolean eliminarCita(String idCita) {
        Cita cita = null;
        cita= obtenerCita(idCita);

        if(cita == null){
            return false;
        }else{
            getListCitas().remove(cita);
            return true;
        }
    }

    private Cita obtenerCita(String idCita) {
        Cita citaEncontrada = null;
        for(Cita cita : getListCitas()){
            if(cita.getIdCita().equalsIgnoreCase(idCita)){
                citaEncontrada = cita;
                break;
            }
        }
        return citaEncontrada;
    }

    @Override
    public boolean actualizarCita(String idCita, Cita cita) {
        Cita citaActual = obtenerCita(idCita);
        if(citaActual == null){
            return false;
        }else {
            citaActual.setFecha(cita.getFecha());
            citaActual.setHoraInicio(cita.getHoraInicio());
            citaActual.setSala(cita.getSala());
            citaActual.setComputador(cita.getComputador());
            citaActual.setCliente(cita.getCliente());
            citaActual.setEmpleado(cita.getEmpleado());
            return true;
        }
    }

    public Cliente obtenerCliente(String idCliente) {
        Cliente clienteEncontrado = null;
        for(Cliente cliente : listCliente ){
            if(cliente.getIdCliente().equalsIgnoreCase(idCliente)){
                clienteEncontrado = cliente;
                break;
            }
        }
        return clienteEncontrado;
    }
}
