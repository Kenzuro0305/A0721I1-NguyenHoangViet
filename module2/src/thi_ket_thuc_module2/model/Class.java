package thi_ket_thuc_module2.model;

public class Class {
    private String idClass ;
    private String nameClass;

    public Class() {
    }

    public Class(String idClass, String nameClass) {
        this.idClass = idClass;
        this.nameClass = nameClass;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Class{" +
                "idClass='" + idClass + '\'' +
                ", nameClass='" + nameClass + '\'' +
                '}';
    }
}
