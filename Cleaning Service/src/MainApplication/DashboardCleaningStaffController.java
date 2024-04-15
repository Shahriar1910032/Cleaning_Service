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
public class DashboardCleaningStaffController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void analyticsOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void leaveApplicationOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void payrollAndAttendanceOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void reportsOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void tasksOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void meetingOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void resourcesOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void cleaningStaffFeedbackOnButtonClicked(ActionEvent event) {
    }
public void switchToScene17(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Tasks.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();    
}
public void switchToScene19(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Analytics.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
public void switchToScene21(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Meeting.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
public void switchToScene23(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Reports.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
public void switchToScene25(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Resources.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
public void switchToScene27(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Leave Application.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
public void switchToScene29(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CleaningStaffFeed.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
public void switchToScene31(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PayrollAndAttendance.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
}