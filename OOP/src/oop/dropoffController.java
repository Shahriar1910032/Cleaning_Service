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
    
    public void AssignDelivery(ActionEvent event) {
        if (selectedDropOff != null && selectedDriver != null) {  
            assignedToLabel.setText(selectedDropOff + " assigned to " + selectedDriver);
        } else {
            assignedToLabel.setText("Please select a Dropoff location and a Driver");
            
        }
    }
    
}