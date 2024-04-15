/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package MainApplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
        public void switchToScene18(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DashboardCleaningStaff.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
}