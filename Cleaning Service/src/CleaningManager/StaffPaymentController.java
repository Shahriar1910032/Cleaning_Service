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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class StaffPaymentController implements Initializable {

    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField staffIdTF;
    @FXML
    private TableView<String> staffIDTC;
    @FXML
    private TableColumn<TableColumn, String> workDetailsTv;
    @FXML
    private TableColumn<TableColumn, String> workingTimeTC;
    @FXML
    private TableColumn<TableColumn, Float> rateTC;
    @FXML
    private TableColumn<TableColumn, Float> totalTC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void payButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void goToDashboardOnClicked(ActionEvent event) {
    }

    public StaffPaymentController(DatePicker datePicker, TextField staffIdTF, TableView<String> staffIDTC, TableColumn<TableColumn, String> workDetailsTv, TableColumn<TableColumn, String> workingTimeTC, TableColumn<TableColumn, Float> rateTC, TableColumn<TableColumn, Float> totalTC) {
        this.datePicker = datePicker;
        this.staffIdTF = staffIdTF;
        this.staffIDTC = staffIDTC;
        this.workDetailsTv = workDetailsTv;
        this.workingTimeTC = workingTimeTC;
        this.rateTC = rateTC;
        this.totalTC = totalTC;
    }

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }

    public TextField getStaffIdTF() {
        return staffIdTF;
    }

    public void setStaffIdTF(TextField staffIdTF) {
        this.staffIdTF = staffIdTF;
    }

    public TableView<String> getStaffIDTC() {
        return staffIDTC;
    }

    public void setStaffIDTC(TableView<String> staffIDTC) {
        this.staffIDTC = staffIDTC;
    }

    public TableColumn<TableColumn, String> getWorkDetailsTv() {
        return workDetailsTv;
    }

    public void setWorkDetailsTv(TableColumn<TableColumn, String> workDetailsTv) {
        this.workDetailsTv = workDetailsTv;
    }

    public TableColumn<TableColumn, String> getWorkingTimeTC() {
        return workingTimeTC;
    }

    public void setWorkingTimeTC(TableColumn<TableColumn, String> workingTimeTC) {
        this.workingTimeTC = workingTimeTC;
    }

    public TableColumn<TableColumn, Float> getRateTC() {
        return rateTC;
    }

    public void setRateTC(TableColumn<TableColumn, Float> rateTC) {
        this.rateTC = rateTC;
    }

    public TableColumn<TableColumn, Float> getTotalTC() {
        return totalTC;
    }

    public void setTotalTC(TableColumn<TableColumn, Float> totalTC) {
        this.totalTC = totalTC;
    }

    @Override
    public String toString() {
        return "StaffPaymentController{" + "datePicker=" + datePicker + ", staffIdTF=" + staffIdTF + ", staffIDTC=" + staffIDTC + ", workDetailsTv=" + workDetailsTv + ", workingTimeTC=" + workingTimeTC + ", rateTC=" + rateTC + ", totalTC=" + totalTC + '}';
    }
    
}
