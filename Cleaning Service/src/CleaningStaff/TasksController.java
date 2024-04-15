/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CleaningStaff;

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
public class TasksController implements Initializable {

    @FXML
    private TextField workDetailsTF;
    @FXML
    private DatePicker datePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pendingRB(ActionEvent event) {
    }

    @FXML
    private void processingRB(ActionEvent event) {
    }

    @FXML
    private void readyToDeliverRB(ActionEvent event) {
    }

    @FXML
    private void updateStatusOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void goToDashboardOnButtonClicked(ActionEvent event) {
    }

    public TasksController(TextField workDetailsTF, DatePicker datePicker) {
        this.workDetailsTF = workDetailsTF;
        this.datePicker = datePicker;
    }

    public TextField getWorkDetailsTF() {
        return workDetailsTF;
    }

    public void setWorkDetailsTF(TextField workDetailsTF) {
        this.workDetailsTF = workDetailsTF;
    }

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }

    @Override
    public String toString() {
        return "TasksController{" + "workDetailsTF=" + workDetailsTF + ", datePicker=" + datePicker + '}';
    }
    
}
