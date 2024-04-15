/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CleaningStaff;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class ResourcesController implements Initializable {

    @FXML
    private ChoiceBox<Integer> faqCB;
    @FXML
    private TextField detailsTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToDashboardOnButtonClicked(ActionEvent event) {
    }

    public ResourcesController(ChoiceBox<Integer> faqCB, TextField detailsTF) {
        this.faqCB = faqCB;
        this.detailsTF = detailsTF;
    }

    public ChoiceBox<Integer> getFaqCB() {
        return faqCB;
    }

    public void setFaqCB(ChoiceBox<Integer> faqCB) {
        this.faqCB = faqCB;
    }

    public TextField getDetailsTF() {
        return detailsTF;
    }

    public void setDetailsTF(TextField detailsTF) {
        this.detailsTF = detailsTF;
    }

    @Override
    public String toString() {
        return "ResourcesController{" + "faqCB=" + faqCB + ", detailsTF=" + detailsTF + '}';
    }
    
}
