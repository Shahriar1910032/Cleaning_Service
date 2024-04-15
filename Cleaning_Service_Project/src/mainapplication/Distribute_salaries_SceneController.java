
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


public class Distribute_salaries_SceneController implements Initializable {

    @FXML
    private ComboBox<String> salaryscene_employeeName_combobox;
    @FXML
    private ComboBox<String> salaryscene_designation_combobox;
    @FXML
    private TextField salary_amount_textfield;
    @FXML
    private Button submit_salary_button;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> salaryscene_employeeName_List = FXCollections.observableArrayList("Elon Reeve Musk","William Henry Gates","Adam D'Angelo","Samuel Harris Altman");
        salaryscene_employeeName_combobox.setItems(salaryscene_employeeName_List);
        
        ObservableList<String> salaryscene_designation_List = FXCollections.observableArrayList("CEO","CTO","MD","Marketting Officer");
        salaryscene_designation_combobox.setItems(salaryscene_designation_List);
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
