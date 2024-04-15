/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapplication;

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
import javafx.stage.Stage;


public class HR_dashboard_SceneController implements Initializable {

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
   
    @FXML
    public void switch_to_Arrange_training_programs_scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Arrange_training_programs_scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
   
    public void switch_to_Approval_of_leave_of_absence_Scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Approval_of_leave_of_absence_Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void switch_to_Distribute_salaries_Scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Distribute_salaries_Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void switch_to_Evaluate_employee_performance(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Evaluate_employee_performance.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void switch_to_Recruit_Members_scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Recruit_Members_scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void switch_to_Sign_in_Scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sign_in_Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void Customer_And_Customer_Service_dashboard_scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Customer_And_Customer_Service_dashboard_scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
