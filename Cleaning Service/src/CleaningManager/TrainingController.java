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
public class TrainingController implements Initializable {

    @FXML
    private TextField createMeetingTimeTF;
    @FXML
    private TextField createMeetingLocationOrLinkTF;
    @FXML
    private TextField joinMeetingTimeTF;
    @FXML
    private TextField joinMeetingLocationOrLinkTF;
    @FXML
    private DatePicker createMeetingDatePicker;
    @FXML
    private DatePicker joinMeetingDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createMeetingModeOnClickedOnline(ActionEvent event) {
    }

    @FXML
    private void createMeetingModeOnClickedOffline(ActionEvent event) {
    }

    @FXML
    private void goToDashboardOnButtonClicked(ActionEvent event) {
    }

    public TrainingController(TextField createMeetingTimeTF, TextField createMeetingLocationOrLinkTF, TextField joinMeetingTimeTF, TextField joinMeetingLocationOrLinkTF, DatePicker createMeetingDatePicker, DatePicker joinMeetingDatePicker) {
        this.createMeetingTimeTF = createMeetingTimeTF;
        this.createMeetingLocationOrLinkTF = createMeetingLocationOrLinkTF;
        this.joinMeetingTimeTF = joinMeetingTimeTF;
        this.joinMeetingLocationOrLinkTF = joinMeetingLocationOrLinkTF;
        this.createMeetingDatePicker = createMeetingDatePicker;
        this.joinMeetingDatePicker = joinMeetingDatePicker;
    }

    public TextField getCreateMeetingTimeTF() {
        return createMeetingTimeTF;
    }

    public void setCreateMeetingTimeTF(TextField createMeetingTimeTF) {
        this.createMeetingTimeTF = createMeetingTimeTF;
    }

    public TextField getCreateMeetingLocationOrLinkTF() {
        return createMeetingLocationOrLinkTF;
    }

    public void setCreateMeetingLocationOrLinkTF(TextField createMeetingLocationOrLinkTF) {
        this.createMeetingLocationOrLinkTF = createMeetingLocationOrLinkTF;
    }

    public TextField getJoinMeetingTimeTF() {
        return joinMeetingTimeTF;
    }

    public void setJoinMeetingTimeTF(TextField joinMeetingTimeTF) {
        this.joinMeetingTimeTF = joinMeetingTimeTF;
    }

    public TextField getJoinMeetingLocationOrLinkTF() {
        return joinMeetingLocationOrLinkTF;
    }

    public void setJoinMeetingLocationOrLinkTF(TextField joinMeetingLocationOrLinkTF) {
        this.joinMeetingLocationOrLinkTF = joinMeetingLocationOrLinkTF;
    }

    public DatePicker getCreateMeetingDatePicker() {
        return createMeetingDatePicker;
    }

    public void setCreateMeetingDatePicker(DatePicker createMeetingDatePicker) {
        this.createMeetingDatePicker = createMeetingDatePicker;
    }

    public DatePicker getJoinMeetingDatePicker() {
        return joinMeetingDatePicker;
    }

    public void setJoinMeetingDatePicker(DatePicker joinMeetingDatePicker) {
        this.joinMeetingDatePicker = joinMeetingDatePicker;
    }

    @Override
    public String toString() {
        return "TrainingController{" + "createMeetingTimeTF=" + createMeetingTimeTF + ", createMeetingLocationOrLinkTF=" + createMeetingLocationOrLinkTF + ", joinMeetingTimeTF=" + joinMeetingTimeTF + ", joinMeetingLocationOrLinkTF=" + joinMeetingLocationOrLinkTF + ", createMeetingDatePicker=" + createMeetingDatePicker + ", joinMeetingDatePicker=" + joinMeetingDatePicker + '}';
    }
    
}
