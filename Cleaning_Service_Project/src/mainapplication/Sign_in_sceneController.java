
package mainapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Akash
 */
public class Sign_in_sceneController implements Initializable {

    @FXML
    private TextField sign_up_fullname_text_field;
    @FXML
    private TextField sign_up_username_text_field;
    @FXML
    private TextField sign_up_email_address_text_field;
    @FXML
    private TextField sign_up_phone_number_text_field;
    @FXML
    private TextField current_address_text_field;
    @FXML
    private PasswordField sign_up_password_password_field;
    @FXML
    private Button sign_up_button;
    @FXML
    private TextField sign_in_email_address_username_text_field1;
    @FXML
    private PasswordField sign_in_password_password_field;
    @FXML
    private Button sign_in_button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
