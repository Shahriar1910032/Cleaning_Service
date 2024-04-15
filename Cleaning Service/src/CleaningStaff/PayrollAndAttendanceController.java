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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sahar
 */
public class PayrollAndAttendanceController implements Initializable {

    @FXML
    private TextField enterAttendanceTimeTF;
    @FXML
    private TableView<String> payrollTV;
    @FXML
    private TableColumn<TableColumn, Integer> totalWorkDayTC;
    @FXML
    private TableColumn<TableColumn, Float> dailyPaymentTC;
    @FXML
    private TableColumn<TableColumn, Float> totalPaymentTc;

    /**s
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToDashboardButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void submitButtonOnClicked(ActionEvent event) {
    }

    public PayrollAndAttendanceController(TextField enterAttendanceTimeTF, TableView<String> payrollTV, TableColumn<TableColumn, Integer> totalWorkDayTC, TableColumn<TableColumn, Float> dailyPaymentTC, TableColumn<TableColumn, Float> totalPaymentTc) {
        this.enterAttendanceTimeTF = enterAttendanceTimeTF;
        this.payrollTV = payrollTV;
        this.totalWorkDayTC = totalWorkDayTC;
        this.dailyPaymentTC = dailyPaymentTC;
        this.totalPaymentTc = totalPaymentTc;
    }

    public TextField getEnterAttendanceTimeTF() {
        return enterAttendanceTimeTF;
    }

    public void setEnterAttendanceTimeTF(TextField enterAttendanceTimeTF) {
        this.enterAttendanceTimeTF = enterAttendanceTimeTF;
    }

    public TableView<String> getPayrollTV() {
        return payrollTV;
    }

    public void setPayrollTV(TableView<String> payrollTV) {
        this.payrollTV = payrollTV;
    }

    public TableColumn<TableColumn, Integer> getTotalWorkDayTC() {
        return totalWorkDayTC;
    }

    public void setTotalWorkDayTC(TableColumn<TableColumn, Integer> totalWorkDayTC) {
        this.totalWorkDayTC = totalWorkDayTC;
    }

    public TableColumn<TableColumn, Float> getDailyPaymentTC() {
        return dailyPaymentTC;
    }

    public void setDailyPaymentTC(TableColumn<TableColumn, Float> dailyPaymentTC) {
        this.dailyPaymentTC = dailyPaymentTC;
    }

    public TableColumn<TableColumn, Float> getTotalPaymentTc() {
        return totalPaymentTc;
    }

    public void setTotalPaymentTc(TableColumn<TableColumn, Float> totalPaymentTc) {
        this.totalPaymentTc = totalPaymentTc;
    }

    @Override
    public String toString() {
        return "PayrollAndAttendanceController{" + "enterAttendanceTimeTF=" + enterAttendanceTimeTF + ", payrollTV=" + payrollTV + ", totalWorkDayTC=" + totalWorkDayTC + ", dailyPaymentTC=" + dailyPaymentTC + ", totalPaymentTc=" + totalPaymentTc + '}';
    }
    
}
