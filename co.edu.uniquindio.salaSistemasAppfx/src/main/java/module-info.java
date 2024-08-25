module co.edu.uniquindio.salasistemasappfx.salssistemaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.management;
    requires org.mapstruct;


    opens co.edu.uniquindio.salasistemasappfx.salssistemaapp to javafx.fxml;
    exports co.edu.uniquindio.salasistemasappfx.salssistemaapp;
    opens co.edu.uniquindio.salasistemasappfx.salssistemaapp.viewController to javafx.fxml;
    exports co.edu.uniquindio.salasistemasappfx.salssistemaapp.viewController;
}