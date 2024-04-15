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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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