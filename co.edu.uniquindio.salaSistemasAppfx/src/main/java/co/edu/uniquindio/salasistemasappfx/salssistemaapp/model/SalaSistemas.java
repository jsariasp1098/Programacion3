package co.edu.uniquindio.salasistemasappfx.salssistemaapp.model;

import co.edu.uniquindio.salasistemasappfx.salssistemaapp.exceptions.CitasException;

import java.util.ArrayList;

public class SalaSistemas {
    private String idNegocio;
    private String nombrenegocio;
    private String direccion;

    ArrayList<Cliente> listUsuarios = new ArrayList<>();
    static ArrayList<Cita> listCitas = new ArrayList<>();
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

    public ArrayList<Cliente> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(ArrayList<Cliente> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    public static ArrayList<Cita> getListCitas() {
        return listCitas;
    }

    public void setListCitas(ArrayList<Cita> listCitas) {
        SalaSistemas.listCitas = listCitas;
    }

    public ArrayList<Empleado> getListEmpleados() {
        return listEmpleados;
    }

    public void setListEmpleados(ArrayList<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }

    public void agregarCitas(Cita nuevaCita) throws CitasException {
        getListCitas().add(nuevaCita);
    }

    public static boolean verificarCitaExistente(String idCita) throws CitasException {
        if(citaExiste(idCita)){
            return true;
           // throw new CitasException("La Cita con ID: "+idCita+" ya existe");
        }else{
            return false;
        }
    }

    private static boolean citaExiste(String idCita) {
        boolean citaEncontrada = false;
        for (Cita cita : getListCitas()) {
            if(cita.getIdCita().equalsIgnoreCase(idCita)){
                citaEncontrada = true;
                break;
            }
        }
        return citaEncontrada;
    }
}
