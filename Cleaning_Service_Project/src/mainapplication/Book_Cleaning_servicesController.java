
package mainapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Akash
 */
public class Book_Cleaning_servicesController implements Initializable {

    @FXML
    private ComboBox<?> cloths_type_combobox;
    @FXML
    private TextField cloths_quantity_text_field;
    @FXML
    private ComboBox<?> Service_type_combobox;
    @FXML
    private Button Add_to_cart_button;
    @FXML
    private TableView<?> item_added_to_cart_table_view;
    @FXML
    private Button Confirn_order_button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
