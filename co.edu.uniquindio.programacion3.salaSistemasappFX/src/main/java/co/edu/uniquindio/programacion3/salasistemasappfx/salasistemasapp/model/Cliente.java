package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model;

public class Cliente extends Persona{
    private String idCliente;

    public Cliente() {

    }

    public Cliente(String tipoIdentificacion, String numeroIdentificacion, String nombre, String apellido, String email, String numeroTelefono, String idCliente) {
        super(tipoIdentificacion, numeroIdentificacion, nombre, apellido, email, numeroTelefono);
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
}
