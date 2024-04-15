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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class DashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void assignCleaningTaskOnButtonClicked(ActionEvent event) {
    }


    @FXML
    private void feedbackOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void monitorAndTrackingOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void reportAndAnalyticsOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void staffPaymentOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void trainingOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void reminderOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void signOutOnButtonClicked(ActionEvent event) {
    }

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AssignCleaningTask.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
    public void switchToScene3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Complaint.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
   public void switchToScene5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FeedbackManagerM.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
}
   public void switchToScene7(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MonitorAndTracking.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
   }
public void switchToScene9(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReportAndAnalytics.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
public void switchToScene11(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Staff payment.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
public void switchToScene13(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Reminder.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
public void switchToScene15(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Training.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
}
