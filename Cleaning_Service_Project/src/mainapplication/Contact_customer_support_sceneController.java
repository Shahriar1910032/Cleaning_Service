
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
public class Contact_customer_support_sceneController implements Initializable {

    @FXML
    private TextField complainscene_name_textfield;
    @FXML
    private TextField complainscene_phone_number_textfield;
    @FXML
    private ComboBox<?> complainscene_service_you_booked_combobox;
    @FXML
    private TextField register_complain_textfield;
    @FXML
    private Button submit_complain_button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
