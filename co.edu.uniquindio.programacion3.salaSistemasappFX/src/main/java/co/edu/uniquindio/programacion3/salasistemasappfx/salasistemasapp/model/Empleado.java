package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model;

public class Empleado extends Persona{
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
