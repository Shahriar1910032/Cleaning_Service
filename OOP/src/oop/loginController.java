package oop;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {

    @FXML
    private TextField userNameTextField;
    @FXML
    private TextField passwordTextField;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private void loginButton(ActionEvent event) throws IOException {
        String username = userNameTextField.getText();
        String password = passwordTextField.getText();
        
        if ("ashrafmanager".equals(username) && "1234".equals(password)) {
            Parent root = FXMLLoader.load(getClass().getResource("pickup.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        } else if ("ashrafdriver".equals(username) && "1234".equals(password)) {
            Parent root = FXMLLoader.load(getClass().getResource("deliveries.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        } else if ("nafizul".equals(username) && "1234".equals(password)) {
            Parent root = FXMLLoader.load(getClass().getResource("pickup.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        } else if ("shahriar".equals(username) && "1234".equals(password)) {
            Parent root = FXMLLoader.load(getClass().getResource("pickup.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        
        }
    }
}