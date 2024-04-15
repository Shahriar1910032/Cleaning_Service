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
public class LeaveApplicationController implements Initializable {

    @FXML
    private TextField reasonTF;
    @FXML
    private DatePicker fromDatePicker;
    @FXML
    private DatePicker toDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void goToDashboardButtonOnClicked(ActionEvent event) {
    }

    public LeaveApplicationController(TextField reasonTF, DatePicker fromDatePicker, DatePicker toDatePicker) {
        this.reasonTF = reasonTF;
        this.fromDatePicker = fromDatePicker;
        this.toDatePicker = toDatePicker;
    }

    public TextField getReasonTF() {
        return reasonTF;
    }

    public void setReasonTF(TextField reasonTF) {
        this.reasonTF = reasonTF;
    }

    public DatePicker getFromDatePicker() {
        return fromDatePicker;
    }

    public void setFromDatePicker(DatePicker fromDatePicker) {
        this.fromDatePicker = fromDatePicker;
    }

    public DatePicker getToDatePicker() {
        return toDatePicker;
    }

    public void setToDatePicker(DatePicker toDatePicker) {
        this.toDatePicker = toDatePicker;
    }

    @Override
    public String toString() {
        return "LeaveApplicationController{" + "reasonTF=" + reasonTF + ", fromDatePicker=" + fromDatePicker + ", toDatePicker=" + toDatePicker + '}';
    }
    
}
