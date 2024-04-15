/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CleaningManager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class MonitorAndTrackingController implements Initializable {

    @FXML
    private DatePicker datePicker;
    @FXML
    private TableView<String> cleaningStatusTV;
    @FXML
    private TableColumn<TableColumn, Integer> staffIdTC;
    @FXML
    private TableColumn<TableColumn, String> workStatusTC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToDashboardOnClick(ActionEvent event) {
    }

    public MonitorAndTrackingController(DatePicker datePicker, TableView<String> cleaningStatusTV, TableColumn<TableColumn, Integer> staffIdTC, TableColumn<TableColumn, String> workStatusTC) {
        this.datePicker = datePicker;
        this.cleaningStatusTV = cleaningStatusTV;
        this.staffIdTC = staffIdTC;
        this.workStatusTC = workStatusTC;
    }

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }

    public TableView<String> getCleaningStatusTV() {
        return cleaningStatusTV;
    }

    public void setCleaningStatusTV(TableView<String> cleaningStatusTV) {
        this.cleaningStatusTV = cleaningStatusTV;
    }

    public TableColumn<TableColumn, Integer> getStaffIdTC() {
        return staffIdTC;
    }

    public void setStaffIdTC(TableColumn<TableColumn, Integer> staffIdTC) {
        this.staffIdTC = staffIdTC;
    }

    public TableColumn<TableColumn, String> getWorkStatusTC() {
        return workStatusTC;
    }

    public void setWorkStatusTC(TableColumn<TableColumn, String> workStatusTC) {
        this.workStatusTC = workStatusTC;
    }

    @Override
    public String toString() {
        return "MonitorAndTrackingController{" + "datePicker=" + datePicker + ", cleaningStatusTV=" + cleaningStatusTV + ", staffIdTC=" + staffIdTC + ", workStatusTC=" + workStatusTC + '}';
    }
    
}
