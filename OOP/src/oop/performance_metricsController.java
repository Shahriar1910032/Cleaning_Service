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
import javafx.stage.Stage;

public class performance_metricsController implements Initializable {

    @FXML
    private Button AssignPickup;
    @FXML
    private Label deliveryTimeLabel;
    @FXML
    private Label customerNameLabel;
    @FXML
    private Label customerIdLabel;
    @FXML
    private Label customerRatingLabel;
    @FXML
    private Label hoursWorkedLabel;
    @FXML
    private ComboBox<String> deliveryComboBox;
    @FXML
    private ComboBox<String> ratingsComboBox;
    @FXML
    private ComboBox<String> hoursWorkedComboBox;
    
    String deliverySelection;
    String dateSelection;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //example list of deliveries
        ObservableList deliveryList = FXCollections.observableArrayList("71 Pine Lane", "51st Ave");
        
        //example list of dates keeping track of hours worked
        ObservableList datesList = FXCollections.observableArrayList("11/10/24", "12/10/24", "13/10/24");
        
        deliveryComboBox.setItems(deliveryList);
        
        ratingsComboBox.setItems(deliveryList);
        
        hoursWorkedComboBox.setItems(datesList);
        
    }

    @FXML
    public void deliveryCheck(ActionEvent event) {
        deliverySelection = deliveryComboBox.getValue();
        
        if (deliverySelection == "71 Pine Lane") {
            deliveryTimeLabel.setText("01:02:03");
        } else if (deliverySelection == "51st Ave") {
            deliveryTimeLabel.setText("02:10:56");
        }
    }

    @FXML
    public void ratingsCheck(ActionEvent event) {
        if (deliverySelection == "71 Pine Lane") {
            customerNameLabel.setText("Jack Walters");
            customerIdLabel.setText("2047");
            customerRatingLabel.setText("4/5");
        } else if (deliverySelection == "51st Ave") {
            customerNameLabel.setText("Sarah Connors");
            customerIdLabel.setText("2056");
            customerRatingLabel.setText("5/5");
        }
        
    }

    @FXML
    private void hoursWorkedCheck(ActionEvent event) {
        dateSelection = hoursWorkedComboBox.getValue();
        
        if (dateSelection == "11/10/24") {
            hoursWorkedLabel.setText("8 hours 3 mins/8 hours 3 mins");
        } else if (dateSelection == "12/10/24") {
            hoursWorkedLabel.setText("7 hours 54 mins/15 hours 57 mins");
        } else if (dateSelection == "13/10/24") {
            hoursWorkedLabel.setText("8 hours 2 mins/23 hours 59 mins");
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