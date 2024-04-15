package oop;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
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
import javafx.stage.Stage;

public class navigationController implements Initializable {

    @FXML
    private Button AssignPickup;
    @FXML
    private ComboBox<String> activePickupsComboBox;
    @FXML
    private ComboBox<String> activeDropoffsComboBox;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //example pickuplist, otherwise will be fetcched from a database
        ObservableList pickupsList = FXCollections.observableArrayList("45th Lane Pine", "17th Street Ave");
        
        activePickupsComboBox.setItems(pickupsList);
        
        ObservableList dropoffsList = FXCollections.observableArrayList("Nakatomi Plaza", "King Street");
        
        activeDropoffsComboBox.setItems(dropoffsList);
    }

    @FXML
    public void viewPickupRoute(ActionEvent event) {
        String pickupsComboBoxValue = activePickupsComboBox.getValue();
        
        //clicking button will redirect to google maps
        openGoogleMaps("https://maps.google.com/");
        
    }

    @FXML
    public void viewDropoffRoute(ActionEvent event) {
        String dropoffsComboBoxValue = activeDropoffsComboBox.getValue();
        
        //clicking button will redirect to google maps
        openGoogleMaps("https://maps.google.com/");
    }
    
    public static void openGoogleMaps(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
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
    
}

