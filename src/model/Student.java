package model;

/**
 * @Created By Ravindu Prathibha
 * @created 1/5/2024 - 11:32 AM
 * @project JFX_Project
 */
public class Student {
    private String id;
    private String name;
    private String contact;
    private String Address;

    public Student() {
    }

    public Student(String id, String name, String contact, String address) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        Address = address;
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

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
