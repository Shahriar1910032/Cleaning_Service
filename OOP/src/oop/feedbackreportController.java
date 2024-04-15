package oop;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class feedbackreportController implements Initializable{

    @FXML
    private Button AssignPickup;
    @FXML
    private Hyperlink formLink;
    @FXML
    private ComboBox<String> feedbackReportComboBox;
    
    String optionSelection;
    
    List feedbackList;
    List reportList;
    @FXML
    private Label displayLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList optionsList = FXCollections.observableArrayList("Feedback", "Report");
        
        feedbackReportComboBox.setItems(optionsList);
        
    }

    @FXML
    public void submitForm(ActionEvent event) {
        feedbackList = new ArrayList<>();
        
        reportList = new ArrayList<>();
        
        optionSelection = feedbackReportComboBox.getValue();
        
        if (optionSelection == "Feedback") {
            feedbackList.add("https://forms.gle/4CkpyQhC8SunetXV9");
            
        
        } else if (optionSelection == "Report") {
            reportList.add("https://forms.gle/4CkpyQhC8SunetXV9");
        }
        
        displayLabel.setText(optionSelection + " form submitted");
        
    }

    @FXML
    public void handleFillOutFormLink(ActionEvent event) {
        optionSelection = feedbackReportComboBox.getValue();
        
        if (optionSelection == "Feedback") {
            
            String url = "https://forms.gle/4CkpyQhC8SunetXV9";
            openGoogleDocs(url);
        
        } else if (optionSelection == "Report") {
            String url = "https://forms.gle/4CkpyQhC8SunetXV9";
            openGoogleDocs(url);
        }
    }
    
    public void openGoogleDocs(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
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