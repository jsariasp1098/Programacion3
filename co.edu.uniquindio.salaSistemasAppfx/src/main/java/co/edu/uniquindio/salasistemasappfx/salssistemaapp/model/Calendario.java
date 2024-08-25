package co.edu.uniquindio.salasistemasappfx.salssistemaapp.model;

import java.util.ArrayList;

public class Calendario {
    ArrayList<Cliente> listaClienteAsociados = new ArrayList<>();
    ArrayList<Cita> listaCitasAsociadas = new ArrayList<>();
    String horarioDisponible;

    public Calendario() {
    }

    public Calendario(ArrayList<Cliente> listaClienteAsociados, ArrayList<Cita> listaCitasAsociadas, String horarioDisponible) {
        this.listaClienteAsociados = listaClienteAsociados;
        this.listaCitasAsociadas = listaCitasAsociadas;
        this.horarioDisponible = horarioDisponible;
    }

    public ArrayList<Cliente> getListaClienteAsociados() {
        return listaClienteAsociados;
    }

    public void setListaClienteAsociados(ArrayList<Cliente> listaClienteAsociados) {
        this.listaClienteAsociados = listaClienteAsociados;
    }

    public ArrayList<Cita> getListaCitasAsociadas() {
        return listaCitasAsociadas;
    }

    public void setListaCitasAsociadas(ArrayList<Cita> listaCitasAsociadas) {
        this.listaCitasAsociadas = listaCitasAsociadas;
    }

    public String getHorarioDisponible() {
        return horarioDisponible;
    }

    public void setHorarioDisponible(String horarioDisponible) {
        this.horarioDisponible = horarioDisponible;
    }
}
