package thi_ket_thuc_module2.service;

import thi_ket_thuc_module2.model.Students;

import thi_modul2.util.CSVHelper;

import java.util.*;

public class StudentsService  {
    private static List<Students> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private CSVHelper<Students> studentsCSVHelper
            = new CSVHelper<>();
    private final String path ="src/thi_ket_thuc_module2/data/students.csv";

    public StudentsService() {
        studentList = getAll();
    }

    public List<Students> getAll(){
        studentList.clear();
        List<String> lines = studentsCSVHelper.read(path);
        for (String line:lines) {
            String[]arr = line.split(",");
            Students student1 = new Students(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),arr[3],Integer.parseInt(arr[4]),Integer.parseInt(arr[5]));
            studentList.add(student1);
        }
        return studentList;
    }

    public void save(Students student){
        if (student.getId()>0){
            //edit
            int index = studentList.indexOf(student);
            studentList.set(index, student);
        } else {
            //add
            student.setId(studentList.size()+1);
            studentList.add(student);
        }
        studentsCSVHelper.write(studentList,path);
    }

    public void inputAndSave(int id){
        boolean check;
        String name;
        do {
            System.out.println("Nhập tên sinh viên (viết hoa chữ cái đầu) ");
            name = scanner.nextLine();
            check = name.matches("^[A-Z][a-z4-50]+$");
        }while (!check);
        System.out.println("Nhập ngày sinh:");
        int birthDay = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        int numPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã lớp học:");
        int idClass = Integer.parseInt(scanner.nextLine());
        Students student = new Students(id,name,birthDay,sex,numPhone,idClass);
        save(student);
    }
    public void create(){
        inputAndSave(0);
        System.out.println("Đã tạo thành công");

    }
    public void edit(){
        show();
        System.out.println("Nhập id bạn muốn edit");
        int id = Integer.parseInt(scanner.nextLine());
        inputAndSave(id);
        System.out.println("Chỉnh sửa thành công");

    }

    public void delete(int id){
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()){
                studentList.remove(i);
            }
        }
        studentsCSVHelper.write(studentList, path);
    }
    public void delete(){
        show();
        System.out.println("Nhập ID bạn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        delete(id);
        System.out.println("Bạn đã xóa thành công");
    }

    public void show(List<Students> studentList){
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s%n", "ID", "NAME", "DATE", "SEX", "PHONE", "IDCLASS");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (Students student:studentList) {
            System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s%n", student.getId(), student.getName(), student.getBirthDay(), student.getSex(), student.getNumPhone(), student.getIdClass());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");

    }
    public void show(){
        show(studentList);
    }

    public void sort(){
        Collections.sort(studentList, Comparator.comparing(Students::getName));
        show();
        System.out.println("Đã sắp xếp theo tên thành công");
    }
}

