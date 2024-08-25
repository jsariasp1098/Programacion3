package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class Cita {
    private LocalDate fecha;
    private String horaInicio;
    private String sala;
    private String computador;
    private String idCita;
    Empleado empleado;
    Cliente cliente;

    public Cita() {
    }

    public Cita(LocalDate fecha, String horaInicio, String sala, String computador, String idCita,
                Empleado empleado, Cliente cliente) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.sala = sala;
        this.computador = computador;
        this.idCita = idCita;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getComputador() {
        return computador;
    }

    public void setComputador(String computador) {
        this.computador = computador;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }
}
