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
public class ReminderController implements Initializable {

    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField notificationTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendNotificationOnClick(ActionEvent event) {
    }

    @FXML
    private void goToDashboardOnClick(ActionEvent event) {
    }

    public ReminderController(DatePicker datePicker, TextField notificationTF) {
        this.datePicker = datePicker;
        this.notificationTF = notificationTF;
    }

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }

    public TextField getNotificationTF() {
        return notificationTF;
    }

    public void setNotificationTF(TextField notificationTF) {
        this.notificationTF = notificationTF;
    }

    @Override
    public String toString() {
        return "ReminderController{" + "datePicker=" + datePicker + ", notificationTF=" + notificationTF + '}';
    }
    
}
