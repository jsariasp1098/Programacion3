package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.service;

import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.Cita;

public interface ISalaSistemasService {

    boolean agregarCita(Cita cita);

    boolean eliminarCita(String idCita);

    boolean actualizarCita(String idCita, Cita cita);
}
