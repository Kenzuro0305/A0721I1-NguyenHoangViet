package thi_ket_thuc_module2.model;

public class Students extends Class {
    private String name;
    private int id;
    private String nameStudent;
    private int birthDay;
    private String sex;
    private int numPhone;

    public Students() {
    }

    public Students(String idClass, String nameClass, String name, int id, String nameStudent, int birthDay, String sex, int numPhone) {
        super(idClass, nameClass);
        this.name = name;
        this.id = id;
        this.nameStudent = nameStudent;
        this.birthDay = birthDay;
        this.sex = sex;
        this.numPhone = numPhone;
    }

    public Students(int parseInt, String s, int parseInt1, String s1, int parseInt2, int parseInt3) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(int numPhone) {
        this.numPhone = numPhone;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", nameStudent='" + nameStudent + '\'' +
                ", birthDay=" + birthDay +
                ", sex='" + sex + '\'' +
                ", numPhone=" + numPhone +
                '}';
    }
}

