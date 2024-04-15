
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
public class Evaluate_employee_performanceController implements Initializable {

    @FXML
    private ComboBox<?> employeePerfomence_selectEmployee_Combobox;
    @FXML
    private TextField employee_perfomence_report_textfield;
    @FXML
    private ComboBox<?> employee_review_combobox;
    @FXML
    private TextField provied_employee_feedback_textfield;
    @FXML
    private Button Submit_employeeFeedback_button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
