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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class ReportAndAnalyticsController implements Initializable {

    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField reportTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendReportOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void goToDashboardOnButtonClicked(ActionEvent event) {
    }

    public ReportAndAnalyticsController(DatePicker datePicker, TextField reportTF) {
        this.datePicker = datePicker;
        this.reportTF = reportTF;
    }

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }

    public TextField getReportTF() {
        return reportTF;
    }

    public void setReportTF(TextField reportTF) {
        this.reportTF = reportTF;
    }

    @Override
    public String toString() {
        return "ReportAndAnalyticsController{" + "datePicker=" + datePicker + ", reportTF=" + reportTF + '}';
    }
    
}
