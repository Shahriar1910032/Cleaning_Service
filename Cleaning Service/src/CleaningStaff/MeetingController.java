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
public class MeetingController implements Initializable {

    @FXML
    private TextField meetingDetailsTF;
    @FXML
    private DatePicker chooseDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToDashboardButtonOnClicked(ActionEvent event) {
    }

    public MeetingController(TextField meetingDetailsTF, DatePicker chooseDatePicker) {
        this.meetingDetailsTF = meetingDetailsTF;
        this.chooseDatePicker = chooseDatePicker;
    }

    public TextField getMeetingDetailsTF() {
        return meetingDetailsTF;
    }

    public void setMeetingDetailsTF(TextField meetingDetailsTF) {
        this.meetingDetailsTF = meetingDetailsTF;
    }

    public DatePicker getChooseDatePicker() {
        return chooseDatePicker;
    }

    public void setChooseDatePicker(DatePicker chooseDatePicker) {
        this.chooseDatePicker = chooseDatePicker;
    }

    @Override
    public String toString() {
        return "MeetingController{" + "meetingDetailsTF=" + meetingDetailsTF + ", chooseDatePicker=" + chooseDatePicker + '}';
    }
    
}
