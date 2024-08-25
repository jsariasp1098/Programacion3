package co.edu.uniquindio.salasistemasappfx.salssistemaapp.model;

public class Cliente extends Usuarios{
    private String idCliente;

    public Cliente() {

    }

    public Cliente(String tipoIdentificacion, String numeroIdentificacion, String nombre, String apellido, String email, String numeroTelefono, String idCliente) {
        super(tipoIdentificacion, numeroIdentificacion, nombre, apellido, email, numeroTelefono);
        this.idCliente = idCliente;
    }

    public String getIdCliente(String number) {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
}
