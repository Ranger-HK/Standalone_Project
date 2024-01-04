package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * @Created By Ravindu Prathibha
 * @created 1/4/2024 - 4:05 PM
 * @project JFX_Project
 */
public class DashBoardFormController {
    public AnchorPane dashboardContext;
    public JFXButton btnStudent;
    public JFXButton btnSubjects;
    public JFXButton btnStudentDetails;

    public void btnStudentOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/StudentForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) dashboardContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }


    public void btnSubjectsOnAction(ActionEvent actionEvent) {


    }

    public void btnStudentDetailsOnAction(ActionEvent actionEvent) {


    }
}
