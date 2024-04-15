package oop;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class dropoffController implements Initializable{
    
    @FXML
    private Button AssignDropoff;
            
    @FXML
    private ListView<String> pendingDropoffsListView;
    
    private ObservableList<String> dropoffList;
    
    @FXML 
    private ListView<String> deliveryDriversListView;
    
    private ObservableList<String> driverList;
    
    @FXML
    private ComboBox<String> dropoffComboBox;
    
    private String selectedDropOff;
    
    @FXML
    private ComboBox<String> driverComboBox;
    
    private String selectedDriver;
    
    @FXML
    private Label assignedToLabel;
    @FXML
    private Button AssignPickup;

    @Override 
    public void initialize(URL location, ResourceBundle resources) {
        //example list, dropofflist will be updated from customers end and then displayed here
        ObservableList<String> dropoffList = FXCollections.observableArrayList("76 Lake Avenue", "451 Plainsview", "101 Pine Lane");
        pendingDropoffsListView.setItems(dropoffList);
        
        //example list, driverList will be updated from drivers end
        ObservableList<String> driverList = FXCollections.observableArrayList("Jose Gonzales", "Mike Arias", "Zachary Edwards", "Max Fielders");
        deliveryDriversListView.setItems(driverList); 
        
        dropoffComboBox.setItems(dropoffList);
        driverComboBox.setItems(driverList); 
        
        dropoffComboBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectedDropOff = newValue;
    });
        
        driverComboBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectedDriver = newValue;
    });
        
    }
    
    @FXML
    public void AssignDelivery(ActionEvent event) {
        if (selectedDropOff != null && selectedDriver != null) {  
            assignedToLabel.setText(selectedDropOff + " assigned to " + selectedDriver);
        } else {
            assignedToLabel.setText("Please select a Dropoff location and a Driver");
            
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