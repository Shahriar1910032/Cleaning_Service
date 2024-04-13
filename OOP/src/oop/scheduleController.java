package oop;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class scheduleController {

    @FXML
    private Button AssignPickup;
    @FXML
    private TextField meetingTitle;
    @FXML
    private TextField meetingDate;
    @FXML
    private TextField meetingTime;
    @FXML
    private TextField meetingLocation;
    @FXML
    private TextField trainingTitle;
    @FXML
    private TextField trainingDate;
    @FXML
    private TextField trainingTime;
    @FXML
    private TextField trainingLocation;
    @FXML
    private Label ScheduleMeetLabel;
    @FXML
    private Label ScheduleTrainingLabel;
    
    @FXML
    public void ScheduleMeet(ActionEvent event) {
        String mtitle = meetingTitle.getText();
        String mdate = meetingDate.getText();
        String mtime = meetingTime.getText();
        String mlocation = meetingLocation.getText();
        
        if (mtitle != null && mdate != null && mtime != null && mlocation != null) {
            ScheduleMeetLabel.setText(mtitle + " scheduled for " + mdate + " " + mtime + " at " + mlocation);
            
            MeetSchedule a = new MeetSchedule(mtitle, mdate, mtime, mlocation);
        
            //store the MeetSchedule instances in a list to access later
        } else {
            ScheduleMeetLabel.setText("Please fill up all of the information");
        }
        
    }
   
    @FXML
    public void ScheduleTraining(ActionEvent event) {
        String ttitle = trainingTitle.getText();
        String tdate = trainingDate.getText();
        String ttime = trainingTime.getText();
        String tlocation = trainingLocation.getText();
        
        if (ttitle != null && tdate != null && ttime != null && tlocation != null) {
            ScheduleTrainingLabel.setText(ttitle + " scheduled for " + tdate + " " + ttime + " at " + tlocation);
        
            TrainingSchedule b = new TrainingSchedule(ttitle, tdate, ttime, tlocation);
        
            //Store the Training Schedule instances in a list to access later
        } else {
            ScheduleTrainingLabel.setText("Please fill up all of the information");
        }
        
    }
}

class MeetSchedule {
    String title;
    String date;
    String time;
    String location;
    
    public MeetSchedule(String title, String date, String time, String location) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.location = location;
    }
}

class TrainingSchedule {
    String title;
    String date;
    String time;
    String location;
    
    public TrainingSchedule(String title, String date, String time, String location) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.location = location;
    }
}