module co.edu.uniquindio.controlcitas.controlcitasapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.controlcitas.controlcitasapp to javafx.fxml;
    exports co.edu.uniquindio.controlcitas.controlcitasapp;
}