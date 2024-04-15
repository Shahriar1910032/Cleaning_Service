
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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Book_Cleaning_servicesController implements Initializable {

    @FXML
    private ComboBox<String> cloths_type_combobox;
    @FXML
    private TextField cloths_quantity_text_field;
    @FXML
    private ComboBox<String> Service_type_combobox;
    @FXML
    private Button Add_to_cart_button;
    @FXML
    private TableView<?> item_added_to_cart_table_view;
    @FXML
    private Button Confirn_order_button;
    @FXML
    private Button approve_leave_submit_button1;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<String> cloths_type_List = FXCollections.observableArrayList("Shirt","Pant","Tshirt","Sharee","Punjabi");
        cloths_type_combobox.setItems(cloths_type_List);
        
        ObservableList<String> Service_type_List = FXCollections.observableArrayList("Iron","Wash","Dry Wash","Iron and Wash");
        Service_type_combobox.setItems(Service_type_List);
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
