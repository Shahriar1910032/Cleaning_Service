package oop;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class deliveriesController implements Initializable {

    @FXML
    private Button AssignPickup;
    @FXML
    private ComboBox<String> activePickupsComboBox;
    @FXML
    private ComboBox<String> activeDropoffsComboBox;
    @FXML
    private CheckBox pickupCompleteCB;
    @FXML
    private CheckBox dropoffCompleteCB;
    
    boolean pickupCompleteCBValue;
    boolean dropoffCompleteCBValue;
    @FXML
    private Label pickupDisplayLabel;
    @FXML
    private Label dropoffDisplayLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //auto retrieving and displaying active pickups (3 max)
        //using an exmple list, data would otherwise be retrieved from a database
        ObservableList activePickupsList = FXCollections.observableArrayList("71 Avenue", "41st Square Plaze");
        
        activePickupsComboBox.setItems(activePickupsList);
        
        
        //auto retrieving and displaying active dropoffs(3 max)
        ObservableList activeDropoffsList = FXCollections.observableArrayList("Nakatomi Plaza", "King Road");
        
        activeDropoffsComboBox.setItems(activeDropoffsList);
        
    }




    @FXML
    public void handlePickupCompleteCB(ActionEvent event) {
        pickupCompleteCBValue = pickupCompleteCB.isSelected();
    }

    @FXML
    public void pickupUpdate(ActionEvent event) {
        String pickupComboBoxValue = activePickupsComboBox.getValue();
        
        //example list to store update status of selected delivery, would be stored in a database otherwise
        List pickupsUpdateList = new ArrayList<>();
        
        pickupsUpdateList.add(pickupComboBoxValue);
        pickupsUpdateList.add(pickupCompleteCBValue);
        
        if (pickupCompleteCBValue == true) {
            pickupDisplayLabel.setText("Status of " + pickupComboBoxValue + " has been updated: Complete");
        }
    }

    @FXML
    public void handleDropoffCompleteCB(ActionEvent event) {
        dropoffCompleteCBValue = dropoffCompleteCB.isSelected();
    }

    @FXML
    public void dropoffUpdate(ActionEvent event) {
        String dropoffComboBoxValue = activeDropoffsComboBox.getValue();
        
        //example list to store update status of selected delivery, would be stored in a database otherwise
        List dropoffsUpdateList = new ArrayList<>();
        
        dropoffsUpdateList.add(dropoffComboBoxValue);
        dropoffsUpdateList.add(dropoffCompleteCBValue);
        
        if (dropoffCompleteCBValue == true) {
            dropoffDisplayLabel.setText("Status of " + dropoffComboBoxValue + "has been updated: Complete");
            
        }
    }
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("deliveries.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("navigation.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("driver_notifications.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("performance_metrics.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("feedbackreport.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToScene6(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

