package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.mapping.dto;

import lombok.Builder;

import java.time.LocalDate;
import java.util.Date;
@Builder
public record CitasDto(
        String idCita,
        String idUsuario,
        String nombreUsuario,
        String salonAsigando,
        String computador,
        LocalDate fechaCita,
        String horaInicio) {
}
