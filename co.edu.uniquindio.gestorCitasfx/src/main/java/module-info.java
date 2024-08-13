module co.edu.uniquindio.controlcitas.controlcitasapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.gestorCitas.gestorCitasapp to javafx.fxml;
    exports co.edu.uniquindio.gestorCitas.gestorCitasapp;
}