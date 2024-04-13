package oop;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class maintenanceController implements Initializable {

    @FXML
    private Button AssignPickup;
    @FXML
    private ComboBox<String> SelectVehicleComboBox;
    @FXML
    private ComboBox<String> SelectPersonnelComboBox;
    @FXML
    private Label ScheduleMaintenanceLabel;
    
    private String selectedVehicle;
    private String selectedPersonnel;
    private boolean routineSelected;
    private boolean oilSelected;
    private boolean tireSelected;
    
    @FXML
    private CheckBox routineInspectionCheckBox;
    @FXML
    private CheckBox oilChangeCheckBox;
    @FXML
    private CheckBox tireRotationCheckBox;
    @FXML
    private Label routineLabel;
    @FXML
    private Label oilLabel;
    @FXML
    private Label tireLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SelectVehicleComboBox.getItems().addAll("Ford Transit Connect", "VolksWagen Caddy");
        SelectPersonnelComboBox.getItems().addAll("Sarah Bell", "Mike Axlot", "Jose Gonzalez");
    }

    @FXML
    public void handleSelectVehicle(ActionEvent event) {
        selectedVehicle = SelectVehicleComboBox.getValue();
    }
    
    @FXML 
    public void handleSelectPersonnel(ActionEvent event) {
        selectedPersonnel = SelectPersonnelComboBox.getValue();
    }

    @FXML
    public void handleRoutineCheckBox(ActionEvent event) {
        routineSelected = routineInspectionCheckBox.isSelected();
    }

    @FXML
    public void handleOilChangeCheckBox(ActionEvent event) {
        oilSelected = oilChangeCheckBox.isSelected();
    }

    @FXML
    public void handleTireRotationCheckBox(ActionEvent event) {
        tireSelected = tireRotationCheckBox.isSelected();
    }
    
    @FXML
    public void ScheduleMaintenance(ActionEvent event) {
        ScheduleMaintenanceLabel.setText("Vehicle: " + selectedVehicle + " " + "Personnel: " + selectedPersonnel);
        if (routineSelected == true) {
            routineLabel.setText("Routine Inspection ✓");
        } 
        if (oilSelected == true) {
            oilLabel.setText("Oil Change ✓");
        }
        if (tireSelected == true) {
            tireLabel.setText("Tire Change ✓");
        }
        
        Maintenance schedule = new Maintenance(selectedVehicle, selectedPersonnel, routineSelected, oilSelected, tireSelected);
        //store schedule instance in a list to access it later
    }
  
}

class Maintenance {
    String vehicle;
    String personnel;
    boolean routineInspection;
    boolean oilChange;
    boolean tireRotation;
    
    public Maintenance(String vehicle, String personnel, boolean routineInspection, boolean oilChange, boolean tireRotation) {
        this.vehicle = vehicle;
        this.personnel = personnel;
        this.routineInspection = routineInspection;
        this.oilChange = oilChange;
        this.tireRotation = tireRotation;
    }
}