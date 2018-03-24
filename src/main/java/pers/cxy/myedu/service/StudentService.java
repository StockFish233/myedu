package pers.cxy.myedu.service;

import pers.cxy.myedu.entity.Student;

import java.util.List;

public interface StudentService {
    public void saveStudent(Student student);

    public void updateStudent(Student student);

    public Student findStudentById(int id);

    public void deleteStudent(Student student);

    public List<Student> findAllList();

    public Student findStudentByNameAndPassword(Student student);
}
