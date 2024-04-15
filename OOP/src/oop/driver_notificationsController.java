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
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class driver_notificationsController implements Initializable {

    @FXML
    private Button AssignPickup;
    @FXML
    private ListView<String> deliveryNotificationsListView;
    @FXML
    private ListView<String> generalNotificationsListView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //example list to store and retrieve dekivery notifications, otherwise will be retreated from database
        ObservableList deliveryNotificationsList = FXCollections.observableArrayList();
        
        deliveryNotificationsList.add("New Pickup Assignment 10/11/24\n"
                + "Time: 03:56 PM\n"
                + "Location: 51st Avenue Street\n"
                + "Address: House-54, Road-19, 51st Avenue Street, NY\n"
                + "Customer Name: Jack Walters\n");
        
        
        deliveryNotificationsList.add("New Pickup Assignment 10/11/24\n"
                + "Time: 12:01 PM\n"
                + "Location: 71 Pine Lane\n"
                + "Address: Apartment-17, Road-13, 71 Pine Lane, NY\n"
                + "Customer Name: Jessica Drew\n");
        
        //example list to store and retrieve general notifications, otherwise will be retreated from database
        ObservableList generalNotificationsList = FXCollections.observableArrayList();
        
        generalNotificationsList.add("Staff Meeting\n"
                + "Date: 10/11/24\n"
                + "Time: 12:00 PM\n"
                + "Location: Employee Lounge\n");
        
        deliveryNotificationsListView.setItems(deliveryNotificationsList);
        generalNotificationsListView.setItems(generalNotificationsList);
                
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