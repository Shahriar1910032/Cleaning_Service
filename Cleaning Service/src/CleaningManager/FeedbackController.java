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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class FeedbackController implements Initializable {

    @FXML
    private TextField performanceTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void chooseStaffIdTF(ActionEvent event) {
    }

    @FXML
    private void sendFeedbackOnClick(ActionEvent event) {
    }

    @FXML
    private void goToDashboardButtonOnClick(ActionEvent event) {
    }

    public FeedbackController(TextField performanceTF) {
        this.performanceTF = performanceTF;
    }

    public TextField getPerformanceTF() {
        return performanceTF;
    }

    public void setPerformanceTF(TextField performanceTF) {
        this.performanceTF = performanceTF;
    }

    @Override
    public String toString() {
        return "FeedbackController{" + "performanceTF=" + performanceTF + '}';
    }
    
}
