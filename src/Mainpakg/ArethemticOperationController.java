/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Mainpakg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class ArethemticOperationController implements Initializable {

    @FXML
    private TextField xTextField;
    @FXML
    private TextField yTextField;
    @FXML
    private Label resultlabel;
    @FXML
    private Button SubtractButton;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addButtonOnClick(MouseEvent event) {
        
        String xStr, yStr,resultStr;
        xStr=xTextField.getText();
        yStr=yTextField.getText();
        int xVal,yVal,resultVal;
        xVal = Integer.parseInt(xStr);
        yVal = Integer.parseInt(yStr);
        resultVal= xVal+ yVal ;
        resultStr = Integer.toString(resultVal);
        resultlabel.setText(resultStr);
                
    }

    @FXML
    private void SubtractButtonOnMouseEntered(MouseEvent event) {
            SubtractButton.setText("Click to Subtract");

        
        
        
    }

    @FXML
    private void subtractButtonOnClick(ActionEvent event) {
        resultlabel.setText
        ("X-Y=");
    }

    @FXML
    private void modulasButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void SubtractButtonOnMouseExit(MouseEvent event) {
        
        SubtractButton.setText("Subtract");
    }
    
}
