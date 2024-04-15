
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
public class Feedback_sceneController implements Initializable {

    @FXML
    private TextField Feedback_textfield;
    @FXML
    private Button feedback_submit_button;
    @FXML
    private ComboBox<?> feedback_bookedServie_Combobod;
    @FXML
    private TextField feedback_phonenumber_textfield;
    @FXML
    private TextField feedback_username_textfield;
    @FXML
    private TextField feedback_yourname_textfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
