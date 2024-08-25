package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.viewController;

import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.controller.SalaSistemasControllerController;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.mapping.dto.CitasDto;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.utils.SalaSistemasUtils;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class SalaSistemasViewController {
    SalaSistemasControllerController salaSistemasController;
    ObservableList<CitasDto> listCitasDto = FXCollections.observableArrayList();
    CitasDto citaSeleccionada;

    @FXML
    private Button btnActualizarCita;

    @FXML
    private Button btnAsignarCita;

    @FXML
    private Button btnBorarCita;

    @FXML
    private Button btnCancelarCita;

    @FXML
    private ComboBox<String> combComputador;

    @FXML
    private ComboBox<String> combHora;

    @FXML
    private ComboBox<String> combSalon;

    @FXML
    private TableColumn<CitasDto, String> ctbComputadorasignado;

    @FXML
    private TableColumn<CitasDto, String> ctbIdCita;

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
    private TextField txtHora;

    @FXML
    private TextField txtIdUsuario;

    @FXML
    private TextField txtNOmbreUsuario;

    @FXML
    private DatePicker txtfexhaCita;

    @FXML
    void initialize() {
        salaSistemasController = new SalaSistemasControllerController();
        intiView();
    }

    private void intiView() {
        initDataBinding();
        obtenerItemComb();
        obetenerCitas();
        tableCitas.getItems().clear();
        tableCitas.setItems(listCitasDto);
        listenerSelection();
    }

    private void obtenerItemComb() {
        combComputador.setValue("Seleccione Computador");
        combComputador.setItems(SalaSistemasUtils.agregarComputadores());
        combSalon.setValue("Seleccione Salon");
        combSalon.setItems(SalaSistemasUtils.agregarsalones());
        combHora.setValue("Selecciones Hora");
        combHora.setItems(SalaSistemasUtils.agregarHoras());
    }

    private void initDataBinding() {
        ctbIdCita.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().idCita()));
        ctbIdUsario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().idUsuario()));
        ctbNombreUsuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombreUsuario()));
        ctbSalonAsignado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().salonAsigando()));
        ctbComputadorasignado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().computador()));
        ctbFechaCita.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().fechaCita())));
        ctbHoraCita.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().horaInicio()));
    }

    private void obetenerCitas() {
        listCitasDto.addAll(salaSistemasController.obtenerCitas());
    }

    private void listenerSelection() {
        tableCitas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            citaSeleccionada = newSelection;
            mostrarInformacionCita(citaSeleccionada);
        });
    }

    private void mostrarInformacionCita(CitasDto citaSeleccionada) {
        if(citaSeleccionada != null){
            combHora.setValue(citaSeleccionada.horaInicio());
            txtIdUsuario.setText(citaSeleccionada.idUsuario());
            txtNOmbreUsuario.setText(citaSeleccionada.nombreUsuario());
            txtfexhaCita.setValue(citaSeleccionada.fechaCita());
            combSalon.setValue(citaSeleccionada.salonAsigando());
            combComputador.setValue(citaSeleccionada.computador());
        }
    }

    @FXML
    void onAsignarCita(ActionEvent event) {

        CitasDto citasDto = contruirCitaDto();
        if(datosValidos(citasDto)){
            if(salaSistemasController.agregarCita(citasDto)){
                listCitasDto.add(citasDto);
                mostrarMensaje("Notificación Sala Sistemas", "Cita Asignada", "La cita fue asignada con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposCita();
            }else{
                mostrarMensaje("Notificación Sala Sistemas", "Cita NO Asignada", "La cita no fue asignada con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Sala Sistemas", "Cita No Asignada", "La cita no fue asignada con éxito", Alert.AlertType.ERROR);
        }

    }

    private void limpiarCamposCita() {
        txtfexhaCita.setValue(null);
        txtIdUsuario.setText("");
        combHora.setValue("Seleccione Hora");
        txtNOmbreUsuario.setText("");
        combComputador.setValue("Seleccione Comptador");
        combSalon.setValue("Selecciones Computador");
    }

    private boolean datosValidos(CitasDto citasDto) {
        String mensaje= "";
        if(citasDto.idUsuario() == null || citasDto.idUsuario().equals(""))
            mensaje += "El Id Usuario es invalido\n";
        if(citasDto.nombreUsuario() == null || citasDto.nombreUsuario().equals(""))
        mensaje += "El mombre es invalido\n";
        if(citasDto.salonAsigando() == null || citasDto.salonAsigando().equals(""))
            mensaje += "El Salon es invalido\n";
        if(citasDto.computador() == null || citasDto.computador().equals(""))
            mensaje += "El Computador es invalido\n";
        if(citasDto.fechaCita() == null || citasDto.fechaCita().equals(""))
            mensaje += "La Fecha es invalido\n";
        if(citasDto.horaInicio() == null || citasDto.horaInicio().equals(""))
            mensaje += "La Hora es invalido\n";
        if(mensaje.equals("")){
            return true;
        }else{
            mostrarMensaje("Notificación Sala Sistemas","Datos invalidos",mensaje, Alert.AlertType.WARNING);
            return false;
        }
    }

    private boolean mostrarMensaje(String notificaciónSalaSistemas, String datosInvalidos, String mensaje, Alert.AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setHeaderText(null);
        aler.setTitle("Confirmación");
        aler.setContentText(mensaje);
        Optional<ButtonType> action = aler.showAndWait();
        if (action.get() == ButtonType.OK) {
            return true;
        } else {
            return false;
        }

    }

    private CitasDto contruirCitaDto() {
        int IdCita = listCitasDto.size();
        String idCita = IdCita +"";

        return new CitasDto(
                idCita,
                txtIdUsuario.getText(),
                txtNOmbreUsuario.getText(),
                combSalon.getValue(),
                combComputador.getValue(),
                txtfexhaCita.getValue(),
                combHora.getValue()
        );
    }

    @FXML
    void onBorrarCita(ActionEvent event) {
        limpiarCamposCita();
    }

    @FXML
    void onCancelarCita(ActionEvent event) {
        boolean citaEliminado = false;
        if(citaSeleccionada != null){
            if(mostrarMensajeConfirmacion("¿Estas seguro de elmininar la cita?")){
                citaEliminado = salaSistemasController.eliminarCita(citaSeleccionada.idCita());
                if(citaEliminado == true){
                    listCitasDto.remove(citaSeleccionada);
                    citaSeleccionada = null;
                    tableCitas.getSelectionModel().clearSelection();
                    limpiarCamposCita();
                    mostrarMensaje("Notificación citas", "Cita eliminado", "La citase ha eliminado con éxito", Alert.AlertType.INFORMATION);
                }else{
                    mostrarMensaje("Notificación citas", "Cita no eliminado", "La citase no se ha eliminado con éxito", Alert.AlertType.ERROR);
                }

            }
        }
    }

    private boolean mostrarMensajeConfirmacion(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmación");
        alert.setContentText(mensaje);
        Optional<ButtonType> action = alert.showAndWait();
        if (action.get() == ButtonType.OK) {
            return true;
        } else {
            return false;
        }
    }

    @FXML
    void onActualzarCita(ActionEvent event) {
        boolean citaActualizada = false;

        String idCitaActual = citaSeleccionada.idCita();
        CitasDto citasDto = contruirCitaDto();

        if(citaSeleccionada != null){
            if(datosValidos(citaSeleccionada)){
                citaActualizada = salaSistemasController.actualizarCita(idCitaActual, citasDto);
                if(citaActualizada){
                    listCitasDto.remove(citaSeleccionada);
                    listCitasDto.add(citasDto);
                    tableCitas.refresh();
                    mostrarMensaje("Notificación cita", "Cita actualizado", "La cita se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                }else{
                    mostrarMensaje("Notificación cita", "Cita no actualizado", "La cita no se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                }
            }else{
                mostrarMensaje("Notificación cita", "Cita no actualizado", "La cita no se ha actualizado con éxito", Alert.AlertType.ERROR);
            }
        }
    }
}
