/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CleaningManager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class AssignTaskController implements Initializable {

    @FXML
    private TextField availableWorkTF;
    @FXML
    private TextField availablestaffTF;
    @FXML
    private Button assignTaskButtonOnClick;
    @FXML
    private TableView<String> staffNameTC;
    @FXML
    private TableColumn<TableColumn, String> assigntaskTable;
    @FXML
    private TableColumn<TableColumn, String> taskDetailsTc;

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

    public AssignTaskController(TextField availableWorkTF, TextField availablestaffTF, Button assignTaskButtonOnClick, TableView<String> staffNameTC, TableColumn<TableColumn, String> assigntaskTable, TableColumn<TableColumn, String> taskDetailsTc) {
        this.availableWorkTF = availableWorkTF;
        this.availablestaffTF = availablestaffTF;
        this.assignTaskButtonOnClick = assignTaskButtonOnClick;
        this.staffNameTC = staffNameTC;
        this.assigntaskTable = assigntaskTable;
        this.taskDetailsTc = taskDetailsTc;
    }

    public TextField getAvailableWorkTF() {
        return availableWorkTF;
    }

    public void setAvailableWorkTF(TextField availableWorkTF) {
        this.availableWorkTF = availableWorkTF;
    }

    public TextField getAvailablestaffTF() {
        return availablestaffTF;
    }

    public void setAvailablestaffTF(TextField availablestaffTF) {
        this.availablestaffTF = availablestaffTF;
    }

    public Button getAssignTaskButtonOnClick() {
        return assignTaskButtonOnClick;
    }

    public void setAssignTaskButtonOnClick(Button assignTaskButtonOnClick) {
        this.assignTaskButtonOnClick = assignTaskButtonOnClick;
    }

    public TableView<String> getStaffNameTC() {
        return staffNameTC;
    }

    public void setStaffNameTC(TableView<String> staffNameTC) {
        this.staffNameTC = staffNameTC;
    }

    public TableColumn<TableColumn, String> getAssigntaskTable() {
        return assigntaskTable;
    }

    public void setAssigntaskTable(TableColumn<TableColumn, String> assigntaskTable) {
        this.assigntaskTable = assigntaskTable;
    }

    public TableColumn<TableColumn, String> getTaskDetailsTc() {
        return taskDetailsTc;
    }

    public void setTaskDetailsTc(TableColumn<TableColumn, String> taskDetailsTc) {
        this.taskDetailsTc = taskDetailsTc;
    }

    @Override
    public String toString() {
        return "AssignTaskController{" + "availableWorkTF=" + availableWorkTF + ", availablestaffTF=" + availablestaffTF + ", assignTaskButtonOnClick=" + assignTaskButtonOnClick + ", staffNameTC=" + staffNameTC + ", assigntaskTable=" + assigntaskTable + ", taskDetailsTc=" + taskDetailsTc + '}';
    }
    
}
