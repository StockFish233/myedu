package pers.cxy.myedu.service.impl;

import org.springframework.stereotype.Service;
import pers.cxy.myedu.dao.BaseDao;
import pers.cxy.myedu.entity.Student;
import pers.cxy.myedu.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Resource
    private BaseDao<Student> baseDao;

    @Override
    public void saveStudent(Student student) {
        // TODO Auto-generated method stub
        baseDao.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        // TODO Auto-generated method stub
        baseDao.update(student);
    }

    @Override
    public Student findStudentById(int id) {
        return baseDao.get("from Student s where s.stu_id=?", new Object[]{id});
    }

    @Override
    public void deleteStudent(Student student) {
        baseDao.delete(student);
    }

    @Override
    public List<Student> findAllList() {
        return baseDao.find("from Student");
    }

    @Override
    public Student findStudentByNameAndPassword(Student student) {
        return baseDao.get("from Student s where s.stu_name=? and s.stu_pwd=?", new Object[]{student.getStu_name(),student.getStu_pwd()});
    }
}
