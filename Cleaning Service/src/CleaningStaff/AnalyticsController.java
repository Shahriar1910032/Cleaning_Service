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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class AnalyticsController implements Initializable {

    @FXML
    private DatePicker fromDatePicker;
    @FXML
    private DatePicker toDatePicker;
    @FXML
    private TableView<String> taskCompletedTC;
    @FXML
    private TableColumn<TableColumn, String> overViewTV;
    @FXML
    private TableColumn<TableColumn, String> earningsToDateTc;
    @FXML
    private TableColumn<TableColumn, String> ratingsTc;

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

    public AnalyticsController(DatePicker fromDatePicker, DatePicker toDatePicker, TableView<String> taskCompletedTC, TableColumn<TableColumn, String> overViewTV, TableColumn<TableColumn, String> earningsToDateTc, TableColumn<TableColumn, String> ratingsTc) {
        this.fromDatePicker = fromDatePicker;
        this.toDatePicker = toDatePicker;
        this.taskCompletedTC = taskCompletedTC;
        this.overViewTV = overViewTV;
        this.earningsToDateTc = earningsToDateTc;
        this.ratingsTc = ratingsTc;
    }

    public DatePicker getFromDatePicker() {
        return fromDatePicker;
    }

    public void setFromDatePicker(DatePicker fromDatePicker) {
        this.fromDatePicker = fromDatePicker;
    }

    public DatePicker getToDatePicker() {
        return toDatePicker;
    }

    public void setToDatePicker(DatePicker toDatePicker) {
        this.toDatePicker = toDatePicker;
    }

    public TableView<String> getTaskCompletedTC() {
        return taskCompletedTC;
    }

    public void setTaskCompletedTC(TableView<String> taskCompletedTC) {
        this.taskCompletedTC = taskCompletedTC;
    }

    public TableColumn<TableColumn, String> getOverViewTV() {
        return overViewTV;
    }

    public void setOverViewTV(TableColumn<TableColumn, String> overViewTV) {
        this.overViewTV = overViewTV;
    }

    public TableColumn<TableColumn, String> getEarningsToDateTc() {
        return earningsToDateTc;
    }

    public void setEarningsToDateTc(TableColumn<TableColumn, String> earningsToDateTc) {
        this.earningsToDateTc = earningsToDateTc;
    }

    public TableColumn<TableColumn, String> getRatingsTc() {
        return ratingsTc;
    }

    public void setRatingsTc(TableColumn<TableColumn, String> ratingsTc) {
        this.ratingsTc = ratingsTc;
    }

    @Override
    public String toString() {
        return "AnalyticsController{" + "fromDatePicker=" + fromDatePicker + ", toDatePicker=" + toDatePicker + ", taskCompletedTC=" + taskCompletedTC + ", overViewTV=" + overViewTV + ", earningsToDateTc=" + earningsToDateTc + ", ratingsTc=" + ratingsTc + '}';
    }
    
}
