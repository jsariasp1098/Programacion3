package co.edu.uniquindio.salasistemasappfx.salssistemaapp.model;

import co.edu.uniquindio.salasistemasappfx.salssistemaapp.exceptions.CitasException;

import java.util.ArrayList;
import java.util.Date;

public class Cita {
    private Date fecha;
    private String horaInicio;
    private String horaTerminacion;
    private String estado;
    private String observaciones;
    private String sala;
    private String ubicacion;
    private String idCita;




    public Cita() {
    }

    public Cita(Date fecha, String horaInicio, String horaTerminacion, String estado, String observaciones, String sala, String ubicacion, String idCita) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaTerminacion = horaTerminacion;
        this.estado = estado;
        this.observaciones = observaciones;
        this.sala = sala;
        this.ubicacion = ubicacion;
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTerminacion() {
        return horaTerminacion;
    }

    public void setHoraTerminacion(String horaTerminacion) {
        this.horaTerminacion = horaTerminacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }


}
