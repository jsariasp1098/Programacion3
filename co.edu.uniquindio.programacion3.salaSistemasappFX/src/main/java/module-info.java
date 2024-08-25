module co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mapstruct;
    requires static lombok;


    opens co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp to javafx.fxml;
    exports co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp;
    opens co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.viewController to javafx.fxml;
    exports co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.viewController;
}