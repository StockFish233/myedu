package pers.cxy.myedu.service.impl;

import pers.cxy.myedu.entity.Teacher;
import pers.cxy.myedu.service.TeacherService;

import org.springframework.stereotype.Service;
import pers.cxy.myedu.dao.BaseDao;

import javax.annotation.Resource;
import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private BaseDao<Teacher> baseDao;

    @Override
    public void saveTeacher(Teacher teacher) {
        baseDao.save(teacher);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        baseDao.update(teacher);
    }

    @Override
    public Teacher findTeacherById(int id) {
        return baseDao.get("from Teacher s where s.tch_id=?", new Object[]{id});
    }

    @Override
    public void deleteTeacher(Teacher teacher) {
        baseDao.delete(teacher);
    }

    @Override
    public List<Teacher> findAllList() {
        return baseDao.find("from Teacher");
    }

    @Override
    public Teacher findTeacherByNameAndPassword(Teacher teacher) {
        return baseDao.get("from Teacher t where t.tch_name=? and t.tch_pwd=?", new Object[]{teacher.getTch_name(),teacher.getTch_pwd()});
    }
}
