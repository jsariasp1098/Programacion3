package co.edu.uniquindio.salasistemasappfx.salssistemaapp.model;

import javax.management.remote.SubjectDelegationPermission;

public class Empleado extends Usuarios {
    private String idEmpleado;

    public Empleado() {
    }

    public Empleado(String tipoIdentificacion, String numeroIdentificacion, String nombre, String apellido, String email, String numeroTelefono, String idEmpleado) {
        super(tipoIdentificacion, numeroIdentificacion, nombre, apellido, email, numeroTelefono);
        this.idEmpleado = idEmpleado;
    }

    public Empleado(String idEmpleado) {

        this.idEmpleado = idEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
