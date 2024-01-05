package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Student;
import view.tm.StudentTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

/**
 * @Created By Ravindu Prathibha
 * @created 1/4/2024 - 5:07 PM
 * @project JFX_Project
 */
public class StudentFormController {
    public AnchorPane studentFormContext;
    public JFXButton btnHome;
    public JFXButton btnAddStudent;
    public JFXTextField txtId;
    public JFXTextField txtName;
    public JFXTextField txtContact;
    public JFXTextField txtAddress;
    public JFXButton btnSave;
    public TableView <StudentTM> tblContext;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colContact;
    public TableColumn colAddress;
    public TableColumn colOperator;
    public TextField txtSearch;

   static ArrayList<Student> studentArrayList = new ArrayList();

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) studentFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }


    public void btnSaveOnAction(ActionEvent actionEvent) {

        if (btnSave.getText().equalsIgnoreCase("Save")){
            Student student = new Student(txtId.getText(),txtName.getText(),txtContact.getText(),txtAddress.getText());
            txtId.clear();
            txtName.clear();
            txtContact.clear();
            txtAddress.clear();

            if(isExits(student)) {
                if (studentArrayList.add(student)) {
                    loadAllStudents();
                    new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();

                } else {
                    new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
                }
            }else {
                new Alert(Alert.AlertType.WARNING, "Already Exists ", ButtonType.CLOSE).show();

            }


        }else {

        }

    }


    public void btnAddStudentOnAction(ActionEvent actionEvent) {

    }


    private void loadAllStudents(){
        ObservableList<StudentTM> tmObservableList = FXCollections.observableArrayList();
        for (Student temp : studentArrayList
             ) {
            Button btn = new Button("Delete");
            tmObservableList.add(
                    new StudentTM(temp.getId(), temp.getName(), temp.getContact(), temp.getAddress(),btn)
            );

            btn.setOnAction((event )-> {

                ButtonType yes = new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are You Sure Want To Delete ? ",yes,no);
                alert.setTitle("Confirmation Alert");
                Optional<ButtonType> result = alert.showAndWait();

                if (result.orElse(no)==yes){
                    studentArrayList.remove(temp);
                    loadAllStudents();
                }else {

                }
            });
        }
        tblContext.setItems(tmObservableList);
    }

    
    public boolean isExits(Student student){
        for (Student temp:studentArrayList
             ) {
            if (temp.getId().equalsIgnoreCase(student.getId())) {
                return false;
            }
        }
        return true;
    }

    
    public void initialize(){
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colOperator.setCellValueFactory(new PropertyValueFactory<>("btn"));

        txtSearch.textProperty().addListener(((observable, oldValue, txt) -> {
            for (Student s :studentArrayList
                 ) {
                if (s.getId().contains(txt) || s.getName().contains(txt) || s.getContact().contains(txt) || s.getAddress().contains(txt)){
                    System.out.println(s);
                }
            }
        }));

        tblContext.getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) -> {
            loadStudentData(newValue);

        }));
    }

    public void loadStudentData(StudentTM tm){
        txtId.setText(tm.getId());
        txtName.setText(tm.getName());
        txtContact.setText(tm.getContact());
        txtAddress.setText(tm.getAddress());
    }

    public void moveToNextNameOnAction(ActionEvent actionEvent) {
        txtName.requestFocus();
    }

    public void moveToNextContactOnAction(ActionEvent actionEvent) {
        txtContact.requestFocus();
    }

    public void moveToNexAddressOnAction(ActionEvent actionEvent) {
        txtAddress.requestFocus();
    }
}
