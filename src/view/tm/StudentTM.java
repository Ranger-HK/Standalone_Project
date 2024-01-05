package view.tm;

import javafx.scene.control.Button;

/**
 * @Created By Ravindu Prathibha
 * @created 1/5/2024 - 11:44 AM
 * @project JFX_Project
 */
public class StudentTM {
     private String id;
     private String name;
     private String contact;
     private String Address;
     private Button btn;

    public StudentTM() {
    }

    public StudentTM(String id, String name, String contact, String address, Button btn) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        Address = address;
        this.btn = btn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "StudentTM{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", Address='" + Address + '\'' +
                ", btn=" + btn +
                '}';
    }
}
