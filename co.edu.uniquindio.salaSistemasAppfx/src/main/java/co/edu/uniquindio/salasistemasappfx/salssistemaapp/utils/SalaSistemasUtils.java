package co.edu.uniquindio.salasistemasappfx.salssistemaapp.utils;

import co.edu.uniquindio.salasistemasappfx.salssistemaapp.model.Cita;
import co.edu.uniquindio.salasistemasappfx.salssistemaapp.model.Cliente;
import co.edu.uniquindio.salasistemasappfx.salssistemaapp.model.SalaSistemas;

public class SalaSistemasUtils {
    public static SalaSistemas inicializarDatos() {
        SalaSistemas salaSistemas = new SalaSistemas();

        Cliente cliente = new Cliente();
        cliente.setIdCliente("1234563");
        cliente.setNombre("Juan");
        cliente.setApellido("Arias");
        cliente.setEmail("juan@gmail.com");
        cliente.setTipoIdentificacion("Cedula");
        cliente.setNumeroIdentificacion("22252122");
        cliente.setNumeroTelefono("555555");
        salaSistemas.getListUsuarios().add(cliente);







        return salaSistemas;
    }
}
