package model.repository.impl;

import model.bean.Student;
import model.repository.BaseRepository;
import model.repository.IStudentRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    // tạo 1 list giả để dùng tạm
    private final String FIND_ALL ="SELECT * FROM student";
    private final String DELETE_STUDENT_BY_ID ="DELETE FROM STUDENT WHERE ID = ?";
    private final String ADD_NEW ="insert into student(idSV,`name`, gender,id_khoa)"
            + "values (?,?,?,?);";
    @Override
    public List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<>();

        // kết nội dB=> lấy list
        Connection connection = BaseRepository.getConnect();
        try {
            PreparedStatement ps = connection.prepareStatement(FIND_ALL);
           ResultSet resultSet = ps.executeQuery();
           while (resultSet.next()){
               int id = resultSet.getInt("id"); // colummLable : tên  thuocj tính của bảng
               int idMSV = resultSet.getInt("idSV"); // colummLable : tên  thuocj tính của bảng
               String name  = resultSet.getString("name");
               Boolean gender = resultSet.getBoolean("gender");
               int idKhoa = resultSet.getInt("id_khoa");
               Student student = new Student(id,idMSV,name,gender,idKhoa);
               studentList.add(student);
           }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return studentList;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Boolean delete(int id) {
        Connection connection = BaseRepository.getConnect();
        try {
            CallableStatement callableStatement = connection.prepareCall(DELETE_STUDENT_BY_ID);
            callableStatement.setInt(1,id);
            return callableStatement.executeUpdate()>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean save(Student student) {
        return null;
    }

//    @Override
//    public Boolean save(Student student) {
//        // kết nối DB
//        Connection connection = BaseRepository.getConnect();
//        try {
//            PreparedStatement ps = connection.prepareStatement(ADD_NEW);
//            ps.setString(1,student.getName());
//            ps.setDate(2, Date.valueOf(student.getBirthday()));
//            ps.setBoolean(3,student.isGender());
//            ps.setInt(4,student.getPoint());
//            ps.setInt(5,student.getClassId());
//            ps.setString(6,student.getEmail());// account là email
//            ps.setString(7,student.getEmail());// email
//            int check =ps.executeUpdate(); // trả về số lượng record bị ảnh hưởng
//            if (check!=0){
//                // thêm mới thành công
//                return true;
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return false;
//
////       studentList.add(student);
//    }

    @Override
    public void edit(Student student) {

    }
}
