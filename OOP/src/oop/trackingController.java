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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class trackingController implements Initializable {

    @FXML
    private Button AssignPickup;
    @FXML
    private ComboBox<String> pickupStatusComboBox;
    @FXML
    private ComboBox<String> dropoffStatusComboBox;
    
    private String selectedPickup;
    private String selectedDropoff;
    @FXML
    private Label pickupRouteLabel;
    @FXML
    private Label pickupStatusLabel;
    @FXML
    private Label pickupTimeLabel;
    @FXML
    private Label pickupDateLabel;
    @FXML
    private Label pickupDriverLabel;
    @FXML
    private Label dropoffRouteLabel;
    @FXML
    private Label dropoffStatusLabel;
    @FXML
    private Label dropoffTimeLabel;
    @FXML
    private Label dropoffDateLabel;
    @FXML
    private Label dropoffDriverLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //combobox will pickup the location of delivery and its tracking details from a central databse
        pickupStatusComboBox.getItems().addAll("123 Maple Street", "721 Oak Avenue", "101 Pine Lane");
        dropoffStatusComboBox.getItems().addAll("76 Lake Avenue", "451 Plainsview", "101 Pine Lane");
    }

    @FXML
    public void handlePickupStatus(ActionEvent event) {
        selectedPickup = pickupStatusComboBox.getValue();
    }

    @FXML
    public void handleDropoffStatus(ActionEvent event) {
        selectedDropoff = dropoffStatusComboBox.getValue();
    }

    @FXML
    public void checkPickupStatus(ActionEvent event) {
        if ("123 Maple Street".equals(selectedPickup)) { // example tracking, data will be fetched from a central database in real implementation 
            pickupRouteLabel.setText("East Desert Route");
            pickupStatusLabel.setText("Laundry Picked Up");
            pickupTimeLabel.setText("12:03 PM");
            pickupDateLabel.setText("13/07/24");
            pickupDriverLabel.setText("Joze Gonzales");
        }
    }

    @FXML
    public void checkDropoffStatus(ActionEvent event) {
        if ("76 Lake Avenue".equals(selectedDropoff)) {
            dropoffRouteLabel.setText("13th Street Overpass");
            dropoffStatusLabel.setText("On route");
            dropoffTimeLabel.setText("03:56 PM");
            dropoffDateLabel.setText("08/12/24");
            dropoffDriverLabel.setText("Max Walters");
        }
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
    







    

    
