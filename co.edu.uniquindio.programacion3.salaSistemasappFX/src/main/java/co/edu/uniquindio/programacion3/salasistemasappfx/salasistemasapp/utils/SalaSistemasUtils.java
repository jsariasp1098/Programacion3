package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.utils;

import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.Cita;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.Cliente;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.Empleado;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.SalaSistemas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class SalaSistemasUtils {
    public static SalaSistemas inicializarDatos() {
        SalaSistemas salaSistemas = new SalaSistemas();

        Cliente cliente = new Cliente();
        cliente.setIdCliente("0");
        cliente.setNombre("Juan");
        cliente.setApellido("Arias");
        cliente.setEmail("juan@gmail.com");
        cliente.setTipoIdentificacion("Cedula");
        cliente.setNumeroIdentificacion("22252122");
        cliente.setNumeroTelefono("555555");
        salaSistemas.getListCliente().add(cliente);

        cliente = new Cliente();
        cliente.setIdCliente("1");
        cliente.setNombre("Lina");
        cliente.setApellido("Espinosa");
        cliente.setEmail("lina@gmail.com");
        cliente.setTipoIdentificacion("Cedula");
        cliente.setNumeroIdentificacion("665242223");
        cliente.setNumeroTelefono("66666");
        salaSistemas.getListCliente().add(cliente);

        cliente = new Cliente();
        cliente.setIdCliente("2");
        cliente.setNombre("Emiliana");
        cliente.setApellido("Arias");
        cliente.setEmail("emiliana@gmail.com");
        cliente.setTipoIdentificacion("T.I");
        cliente.setNumeroIdentificacion("1111112222");
        cliente.setNumeroTelefono("777777");
        salaSistemas.getListCliente().add(cliente);

        cliente = new Cliente();
        cliente.setIdCliente("3");
        cliente.setNombre("Andres");
        cliente.setApellido("Ruiz");
        cliente.setEmail("andres@gmail.com");
        cliente.setTipoIdentificacion("Cedula");
        cliente.setNumeroIdentificacion("6566666");
        cliente.setNumeroTelefono("6666666");
        salaSistemas.getListCliente().add(cliente);

        Empleado empleado = new Empleado();
        empleado.setIdEmpleado("0");
        empleado.setNombre("Carlos");
        empleado.setApellido("Arias");
        empleado.setTipoIdentificacion("Cedula");
        empleado.setNumeroIdentificacion("888888");
        empleado.setNumeroTelefono("9996558");
        salaSistemas.getListEmpleados().add(empleado);

        Cita cita = new Cita();
        cita.setIdCita("0");
        LocalDate fecha = LocalDate.of(2024,05,20);
        cita.setFecha(fecha);
        cita.setHoraInicio("10:00-11:00");
        cita.setSala("Sala Computadores");
        cita.setComputador("Computador 1");
        cita.setEmpleado(salaSistemas.getListEmpleados().get(0));
        cita.setCliente(salaSistemas.getListCliente().get(0));
        salaSistemas.getListCitas().add(cita);

        cita = new Cita();
        cita.setIdCita("1");
        fecha = LocalDate.of(2024,10,20);
        cita.setFecha(fecha);
        cita.setHoraInicio("09:00-10:00");
        cita.setSala("Sala Computadores");
        cita.setComputador("Computador 2");
        cita.setEmpleado(salaSistemas.getListEmpleados().get(0));
        cita.setCliente(salaSistemas.getListCliente().get(1));
        salaSistemas.getListCitas().add(cita);

        cita = new Cita();
        cita.setIdCita("2");
        fecha = LocalDate.of(2024,10,20);
        cita.setFecha(fecha);
        cita.setHoraInicio("10:00-11:00");
        cita.setSala("Sala Computadores");
        cita.setComputador("Computador 3");
        cita.setEmpleado(salaSistemas.getListEmpleados().get(0));
        cita.setCliente(salaSistemas.getListCliente().get(2));
        salaSistemas.getListCitas().add(cita);

        cita = new Cita();
        cita.setIdCita("3");
        fecha = LocalDate.of(2024,10,20);
        cita.setFecha(fecha);
        cita.setHoraInicio("11:00-12:00");
        cita.setSala("Sala Computadores");
        cita.setComputador("Computador 4");
        cita.setEmpleado(salaSistemas.getListEmpleados().get(0));
        cita.setCliente(salaSistemas.getListCliente().get(3));
        salaSistemas.getListCitas().add(cita);

        return salaSistemas;
    }

    public static ObservableList<String> agregarComputadores() {
        ObservableList<String> computadpres = FXCollections.observableArrayList("Computador 1","Computador 2", "Computador 3", "Computador 4");
        return  computadpres;
    }

    public static ObservableList<String> agregarsalones() {
        ObservableList<String> salones = FXCollections.observableArrayList("Sala Computadores","Sala Conferencia", "Sala Fotografia");
        return  salones;
    }

    public static ObservableList<String> agregarHoras() {
        ObservableList<String>  horario = FXCollections.observableArrayList("07:00-08:00", "08:00-09:00", "09:00-10:00", "10:00-11:00", "11:00-12:00", "14:00-15:00", "15:00-16:00", "16:00-17:00");
        return horario;
    }
}
