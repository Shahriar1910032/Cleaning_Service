package oop;

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class notificationsController implements Initializable{

    @FXML
    private Button AssignPickup;
    @FXML
    private TabPane tabpane;
    @FXML
    private VBox notificationArea;
    @FXML
    private VBox policyArea;
    @FXML
    private VBox announcementArea;
    
    
     @Override
    public void initialize(URL location, ResourceBundle resources) {
        addNotification(" - Manager Dashboard has been updated\n"
                + "New features implemented including the ability to track deliveries\n"
                + "and their status\n");
        addNotification("- New policies implemented regarding staff worktime\n"
                + "Please check the policies tab for further details");
        
        addPolicy("- Staff worktime update\n");
        addPolicy("- CEO and upper management change\n");
        
        addAnnouncement("- Upcoming Holiday Schedule\n");
        addAnnouncement("- Company Retreat\n");
        
    }
    
    
    public void addNotification(String message) {
        Label notificationLabel = new Label(message);
        
        notificationArea.getChildren().add(notificationLabel);
        
    }
    
    public void addPolicy(String message) {
        Label policyLabel = new Label(message);
        
        policyArea.getChildren().add(policyLabel);
    }
    
    public void addAnnouncement(String message) {
        Label announcementLabel = new Label(message);
        
        announcementArea.getChildren().add(announcementLabel);
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
}