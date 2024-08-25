package co.edu.uniquindio.salasistemasappfx.salssistemaapp;

import co.edu.uniquindio.salasistemasappfx.salssistemaapp.viewController.GestorCitasViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;
    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        this.primaryStage.setTitle("Gestor Citas");
        mostrarVentanaPrincipal();

       /* FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gestor_citas-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/
    }

    private void mostrarVentanaPrincipal() throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(HelloApplication.class.getResource("gestor_citas_view.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            GestorCitasViewController citasViewController = loader.getController();
            // citasViewController.setAplicacion(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}