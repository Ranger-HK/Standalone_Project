package controller;

import com.jfoenix.controls.JFXTextField;
import view.tm.StudentTM;

/**
 * @Created By Ravindu Prathibha
 * @created 1/5/2024 - 5:30 PM
 * @project JFX_Project
 */
public class StudentDataFormController {

    public JFXTextField txtStudentFormName;

    public void setData(StudentTM tm){
        txtStudentFormName.setText(tm.getName());
        System.out.println(tm);
    }

}
