package co.edu.uniquindio.salasistemasappfx.salssistemaapp.viewController;

import co.edu.uniquindio.salasistemasappfx.salssistemaapp.controller.CitaController;
import co.edu.uniquindio.salasistemasappfx.salssistemaapp.mapping.dto.CitasDto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.Date;

public class GestorCitasViewController {
    CitaController citaControllerService;
    ObservableList<CitasDto> listaCitasDto = FXCollections.observableArrayList();
    CitasDto citaSeleccionada;

    @FXML
    private Button btnAsignarCita;

    @FXML
    private Button btnBorarCita;

    @FXML
    private Button btnCancelarCita;

    @FXML
    private TableColumn<CitasDto, String> ctbComputadorasignado;

    @FXML
    private TableColumn<CitasDto, String> ctbFechaCita;

    @FXML
    private TableColumn<CitasDto, String> ctbHoraCita;

    @FXML
    private TableColumn<CitasDto, String> ctbIdUsario;

    @FXML
    private TableColumn<CitasDto, String> ctbNombreUsuario;

    @FXML
    private TableColumn<CitasDto, String> ctbSalonAsignado;

    @FXML
    private Label labelComputador;

    @FXML
    private Label labelFecha;

    @FXML
    private Label labelHora;

    @FXML
    private Label labelIdUsuario;

    @FXML
    private Label labelNombreUsuario;

    @FXML
    private Label labelSalon;

    @FXML
    private SplitMenuButton splitComputador;

    @FXML
    private SplitMenuButton splitSalon;

    @FXML
    private TableView<CitasDto> tableCitas;

    @FXML
    private Label tittleSalonSistemas;

    @FXML
    private Label tittleServiciosSalaSistemas;

    @FXML
    private TextField txtFechaCita;

    @FXML
    private TextField txtHora;

    @FXML
    private TextField txtIdUsuario;

    @FXML
    private TextField txtNOmbreUsuario;

    @FXML
    void onAsignarCita(ActionEvent event) {

    }
    @FXML
    void initialize() {
        citaControllerService = new CitaController();
        intiView();
    }

    private void intiView() {
        initDataBinding();
        obtenerCitas();
        tableCitas.getItems().clear();
        tableCitas.setItems(listaCitasDto);
        listerSelection();
    }

    private void listerSelection() {
        tableCitas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            citaSeleccionada = newSelection;
            mostrarInformacionCita(citaSeleccionada);
        });
    }

    private void mostrarInformacionCita(CitasDto citaSeleccionada) {
        if (citaSeleccionada != null) {
            txtFechaCita.setText(citaSeleccionada.fechaCita());
            txtHora.setText(citaSeleccionada.hora());
            txtIdUsuario.setText(citaSeleccionada.idUsuario());
            txtNOmbreUsuario.setText(citaSeleccionada.nombreUsuario());
        }
    }

    private void obtenerCitas() {
        listaCitasDto.addAll(citaControllerService.obtenerCitas());
    }

    private void initDataBinding() {
        ctbIdUsario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().idUsuario()));
        ctbNombreUsuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombreUsuario()));
        ctbSalonAsignado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().salonAsigando()));
        ctbComputadorasignado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().computador()));
        ctbFechaCita.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().fechaCita()));
        ctbHoraCita.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().hora()));
    }

    @FXML
    void onBorrarCita(ActionEvent event) {

    }

    @FXML
    void onCancelarCita(ActionEvent event) {

    }


}
