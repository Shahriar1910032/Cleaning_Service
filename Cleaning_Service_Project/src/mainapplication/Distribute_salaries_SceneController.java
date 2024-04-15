
package mainapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Akash
 */
public class Distribute_salaries_SceneController implements Initializable {

    @FXML
    private ComboBox<?> salaryscene_employeeName_combobox;
    @FXML
    private ComboBox<?> salaryscene_designation_combobox;
    @FXML
    private TextField salary_amount_textfield;
    @FXML
    private Button submit_salary_button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
