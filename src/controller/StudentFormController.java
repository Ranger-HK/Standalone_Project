package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

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
    public TableView tblContext;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colContact;
    public TableColumn colAddress;
    public TableColumn colOperator;

    public void btnSaveOnAction(ActionEvent actionEvent) {
    }

    public void btnAddStudentOnAction(ActionEvent actionEvent) {
    }

    public void btnHomeOnAction(ActionEvent actionEvent) {
    }
}
