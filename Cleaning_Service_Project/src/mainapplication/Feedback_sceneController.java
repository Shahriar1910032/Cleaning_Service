
package mainapplication;

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Akash
 */
public class Feedback_sceneController implements Initializable {

    @FXML
    private TextField Feedback_textfield;
    @FXML
    private Button feedback_submit_button;
    @FXML
    private TextField feedback_phonenumber_textfield;
    @FXML
    private TextField feedback_username_textfield;
    @FXML
    private TextField feedback_yourname_textfield;
    @FXML
    private ComboBox<String> feedback_bookedServie_Combobox;
    @FXML
    private Button approve_leave_submit_button1;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<String> feedback_bookedServie_List = FXCollections.observableArrayList("Iron","Wash","Dry Wash","Iron and Wash");
        feedback_bookedServie_Combobox.setItems(feedback_bookedServie_List);
        
    }    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
   
    @FXML
    public void HR_dashboard_scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("HR_dashboard_scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
