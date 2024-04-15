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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class FeedbackController implements Initializable {

    @FXML
    private TextField taskIdTF;
    @FXML
    private TextField feedbackToCustomerTF;
    @FXML
    private TextField customerGivenFeedbackTF;

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

    @FXML
    private void feebackToCustomerOnButtonClicked(ActionEvent event) {
    }

    public FeedbackController(TextField taskIdTF, TextField feedbackToCustomerTF, TextField customerGivenFeedbackTF) {
        this.taskIdTF = taskIdTF;
        this.feedbackToCustomerTF = feedbackToCustomerTF;
        this.customerGivenFeedbackTF = customerGivenFeedbackTF;
    }

    public TextField getTaskIdTF() {
        return taskIdTF;
    }

    public void setTaskIdTF(TextField taskIdTF) {
        this.taskIdTF = taskIdTF;
    }

    public TextField getFeedbackToCustomerTF() {
        return feedbackToCustomerTF;
    }

    public void setFeedbackToCustomerTF(TextField feedbackToCustomerTF) {
        this.feedbackToCustomerTF = feedbackToCustomerTF;
    }

    public TextField getCustomerGivenFeedbackTF() {
        return customerGivenFeedbackTF;
    }

    public void setCustomerGivenFeedbackTF(TextField customerGivenFeedbackTF) {
        this.customerGivenFeedbackTF = customerGivenFeedbackTF;
    }

    @Override
    public String toString() {
        return "FeedbackController{" + "taskIdTF=" + taskIdTF + ", feedbackToCustomerTF=" + feedbackToCustomerTF + ", customerGivenFeedbackTF=" + customerGivenFeedbackTF + '}';
    }
    
}
