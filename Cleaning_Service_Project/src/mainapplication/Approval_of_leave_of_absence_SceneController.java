
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


public class Approval_of_leave_of_absence_SceneController implements Initializable {

    @FXML
    private TextField pending_leave_application_text_field;
    @FXML
    private ComboBox<String> approve_leave_combobox;
    @FXML
    private Button approve_leave_submit_button;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList <String> approveList = FXCollections.observableArrayList("Yes","No");
        approve_leave_combobox.setItems(approveList);
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
