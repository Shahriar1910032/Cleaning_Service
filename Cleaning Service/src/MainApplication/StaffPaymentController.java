/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package MainApplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class StaffPaymentController implements Initializable {

    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField staffIdTF;
    @FXML
    private TableView<Integer> staffIDTC;
    @FXML
    private TableColumn<TableColumn, String> workDetailsTV;
    @FXML
    private TableColumn<TableColumn, String> workingTimeTC;
    @FXML
    private TableColumn<TableColumn, Float> rateTC;
    @FXML
    private TableColumn<TableColumn, Float> totalTC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void payButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void goToDashboardOnClicked(ActionEvent event) {
    }
        public void switchToScene12(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DashboardManager.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
}
