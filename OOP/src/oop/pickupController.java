package oop;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class pickupController implements Initializable{
    @FXML
    private Button AssignPickup;
            
    @FXML
    private ListView<String> pickupRequestsListView;
    
    private ObservableList<String> pickupList;
    
    @FXML 
    private ListView<String> deliveryDriversListView;
    
    private ObservableList<String> driverList;
    
    @FXML
    private ComboBox<String> pickupComboBox;
    
    private String selectedPickUp;
    
    @FXML
    private ComboBox<String> driverComboBox;
    
    private String selectedDriver;
    
    @FXML
    private Label assignedToLabel;
    
    
    @Override 
    public void initialize(URL location, ResourceBundle resources) {
        //example list, pickuplist will be updated from customers end and then displayed here
        ObservableList<String> pickupList = FXCollections.observableArrayList("123 Maple Street", "721 Oak Avenue", "101 Pine Lane");
        pickupRequestsListView.setItems(pickupList);
        
        //example list, driverList will be updated from drivers end
        ObservableList<String> driverList = FXCollections.observableArrayList("Jose Gonzales", "Mike Arias", "Zachary Edwards", "Max Fielders");
        deliveryDriversListView.setItems(driverList); 
        
        pickupComboBox.setItems(pickupList);
        driverComboBox.setItems(driverList); 
        
        pickupComboBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectedPickUp = newValue;
    });
        
        driverComboBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectedDriver = newValue;
    });
        
    }
    
    public void AssignDelivery(ActionEvent event) {
        if (selectedPickUp != null && selectedDriver != null) {  
            assignedToLabel.setText(selectedPickUp + " assigned to " + selectedDriver);
        } else {
            assignedToLabel.setText("Please select a Pickup location and a Driver");
            
        }
    }
    
}

