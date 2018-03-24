package pers.cxy.myedu.service;
import pers.cxy.myedu.entity.Teacher;

import java.util.List;

public interface TeacherService {
    public void saveTeacher(Teacher teacher);

    public void updateTeacher(Teacher teacher);

    public Teacher findTeacherById(int id);

    public void deleteTeacher(Teacher teacher);

    public List<Teacher> findAllList();

    public Teacher findTeacherByNameAndPassword(Teacher teacher);
}
