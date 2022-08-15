package model.bean;

public class Student {
    private int id;
    private int idMSV;
    private String name;
    private boolean gender;
    private int idKhoa;

    public Student() {
    }

    public Student(int id, int idMSV, String name, boolean gender, int idKhoa) {
        this.id = id;
        this.idMSV = idMSV;
        this.name = name;
        this.gender = gender;
        this.idKhoa = idKhoa;
    }

    public Student(int idMSV, String name, boolean gender, int idKhoa) {
        this.idMSV = idMSV;
        this.name = name;
        this.gender = gender;
        this.idKhoa = idKhoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMSV() {
        return idMSV;
    }

    public void setIdMSV(int idMSV) {
        this.idMSV = idMSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getIdKhoa() {
        return idKhoa;
    }

    public void setIdKhoa(int idKhoa) {
        this.idKhoa = idKhoa;
    }
}
