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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class ReportsController implements Initializable {

    @FXML
    private TextField taskDetailsTF;
    @FXML
    private TextField commentTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendReportOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void goToDashboardOnButtonClicked(ActionEvent event) {
    }

    public ReportsController(TextField taskDetailsTF, TextField commentTF) {
        this.taskDetailsTF = taskDetailsTF;
        this.commentTF = commentTF;
    }

    public TextField getTaskDetailsTF() {
        return taskDetailsTF;
    }

    public void setTaskDetailsTF(TextField taskDetailsTF) {
        this.taskDetailsTF = taskDetailsTF;
    }

    public TextField getCommentTF() {
        return commentTF;
    }

    public void setCommentTF(TextField commentTF) {
        this.commentTF = commentTF;
    }

    @Override
    public String toString() {
        return "ReportsController{" + "taskDetailsTF=" + taskDetailsTF + ", commentTF=" + commentTF + '}';
    }
    
}
