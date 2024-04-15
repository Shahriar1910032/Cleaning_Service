
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


public class Customer_And_Customer_Service_dashboard_sceneController implements Initializable {

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
   
    @FXML
    public void switch_to_Book_Cleaning_services(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Book_Cleaning_services.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
   
    @FXML
    public void switch_to_Contact_customer_support_scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Contact_customer_support_scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void switch_to_Feedback_scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Feedback_scene.fxml"));
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
    
}
