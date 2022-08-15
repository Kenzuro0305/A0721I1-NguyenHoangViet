package model.service.impl;

import model.bean.Student;
import model.repository.IStudentRepository;
import model.repository.impl.StudentRepository;
import model.service.IStudentService;
import util.Validation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService implements IStudentService {
    // gọi repository
    IStudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> getAllStudent() {

        return studentRepository.getAllStudent();
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Map<String, String> save(Student student) {
        Map<String, String> map = new HashMap<>();
       return map;

    }

    @Override
    public Boolean delete(int id) {
        return studentRepository.delete(id);
    }

    @Override
    public void edit(Student student) {

    }

}
