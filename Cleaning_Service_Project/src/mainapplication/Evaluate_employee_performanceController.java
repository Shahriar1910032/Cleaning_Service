
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


public class Evaluate_employee_performanceController implements Initializable {

    @FXML
    private ComboBox<String> employeePerfomence_selectEmployee_Combobox;
    @FXML
    private TextField employee_perfomence_report_textfield;
    @FXML
    private ComboBox<String> employee_review_combobox;
    @FXML
    private TextField provied_employee_feedback_textfield;
    @FXML
    private Button Submit_employeeFeedback_button;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<String> employeePerfomence_selectEmployee_List = FXCollections.observableArrayList("Elon Reeve Musk","William Henry Gates","Adam D'Angelo","Samuel Harris Altman");
        employeePerfomence_selectEmployee_Combobox.setItems(employeePerfomence_selectEmployee_List);
        
        ObservableList<String> employee_review_List = FXCollections.observableArrayList("Best","Doing Better","Good","Not Bad","You Can do Better");
        employee_review_combobox.setItems(employee_review_List);
        
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
