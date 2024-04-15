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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class ComplaintController implements Initializable {

    @FXML
    private Button submitButtonOnClick;
    @FXML
    private TextField feedbackTF;
    @FXML
    private TextField availableComplaintTF;
    @FXML
    private TextField staffIdTF;
    @FXML
    private TextField statusTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToDashboardOnButtonClicked(ActionEvent event) {
    }

    public ComplaintController(Button submitButtonOnClick, TextField feedbackTF, TextField availableComplaintTF, TextField staffIdTF, TextField statusTF) {
        this.submitButtonOnClick = submitButtonOnClick;
        this.feedbackTF = feedbackTF;
        this.availableComplaintTF = availableComplaintTF;
        this.staffIdTF = staffIdTF;
        this.statusTF = statusTF;
    }

    public Button getSubmitButtonOnClick() {
        return submitButtonOnClick;
    }

    public void setSubmitButtonOnClick(Button submitButtonOnClick) {
        this.submitButtonOnClick = submitButtonOnClick;
    }

    public TextField getFeedbackTF() {
        return feedbackTF;
    }

    public void setFeedbackTF(TextField feedbackTF) {
        this.feedbackTF = feedbackTF;
    }

    public TextField getAvailableComplaintTF() {
        return availableComplaintTF;
    }

    public void setAvailableComplaintTF(TextField availableComplaintTF) {
        this.availableComplaintTF = availableComplaintTF;
    }

    public TextField getStaffIdTF() {
        return staffIdTF;
    }

    public void setStaffIdTF(TextField staffIdTF) {
        this.staffIdTF = staffIdTF;
    }

    public TextField getStatusTF() {
        return statusTF;
    }

    public void setStatusTF(TextField statusTF) {
        this.statusTF = statusTF;
    }

    @Override
    public String toString() {
        return "ComplaintController{" + "submitButtonOnClick=" + submitButtonOnClick + ", feedbackTF=" + feedbackTF + ", availableComplaintTF=" + availableComplaintTF + ", staffIdTF=" + staffIdTF + ", statusTF=" + statusTF + '}';
    }
    
}
