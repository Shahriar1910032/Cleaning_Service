package oop;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class analyticsController implements Initializable {

    @FXML
    private Button AssignPickup;
    @FXML
    private Hyperlink analyticsFormLink;
    @FXML
    private TextField analyticsFormDateField;
    @FXML
    private Label attendenceSheetDateLabel;
    @FXML
    private Hyperlink attendenceSheetLink;
    @FXML
    private Label analyticsLabel;
    @FXML
    private Label AttendenceLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        attendenceSheetDateLabel.setText("23/5/24"); //example date, otherwise date will be fetched
        
        
        analyticsFormLink.setOnAction(event -> {
            try {
                openGoogleDoc1();
            } catch (IOException ex) {
                Logger.getLogger(analyticsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        attendenceSheetLink.setOnAction(event -> {
            try {
                openGoogleDoc2();
            } catch (IOException ex) {
                Logger.getLogger(analyticsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    private void openGoogleDoc1() throws IOException {
        String googleDocUrl = "https://docs.google.com/document/d/your-document-id/edit";

        java.awt.Desktop.getDesktop().browse(java.net.URI.create(googleDocUrl));
        
    }
    
    private void openGoogleDoc2() throws IOException {
        String googleDocUrl = "https://docs.google.com/document/d/your-document-id/edit";

        java.awt.Desktop.getDesktop().browse(java.net.URI.create(googleDocUrl));
        
    }
    
    
    

    @FXML
    public void analyticsSubmit(ActionEvent event) {
        String date = analyticsFormDateField.getText();
        
        List<String> analyticsList = new ArrayList<>();
        
        analyticsList.add(date);
        analyticsList.add("https://docs.google.com/document/d/your-document-id/edit");
        
        analyticsLabel.setText("Analytics Form submitted for " + date);
    }

    @FXML
    public void attendenceSubmit(ActionEvent event) {
        List<String> attendenceList = new ArrayList<>();
        
        attendenceList.add("\"https://docs.google.com/document/d/your-document-id/edit\"");
        
        String date = attendenceSheetDateLabel.getText();
        
        AttendenceLabel.setText("Attendence Sheet submitted for " + date);
    }
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pickup.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("dropoff.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("schedule.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("maintenance.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tracking.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene6(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("notifications.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene7(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("analytics.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene8(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
