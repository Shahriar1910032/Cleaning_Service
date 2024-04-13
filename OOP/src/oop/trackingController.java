package oop;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

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
        if (selectedPickup == "123 Maple Street") {
            
        }
    }

    @FXML
    public void checkDropoffStatus(ActionEvent event) {
    }
    
}