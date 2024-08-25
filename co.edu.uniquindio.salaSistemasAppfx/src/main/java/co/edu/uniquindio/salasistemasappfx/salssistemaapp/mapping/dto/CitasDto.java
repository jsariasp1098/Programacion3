package co.edu.uniquindio.salasistemasappfx.salssistemaapp.mapping.dto;

import java.util.Date;

public record CitasDto(
        String idUsuario,
        String nombreUsuario,
        String salonAsigando,
        String computador,
        String fechaCita,
        String hora) {
}
