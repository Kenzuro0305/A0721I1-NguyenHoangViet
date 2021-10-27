package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Viet");
        student.setClasses("A0721I1");
        System.out.println(student.getName()+" - "+student.getClasses());
    }
}
