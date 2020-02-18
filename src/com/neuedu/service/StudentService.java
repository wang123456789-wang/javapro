package com.neuedu.service;

import com.neuedu.dao.IstudentDao;
import com.neuedu.dao.StudentDao;
import com.neuedu.poji.Student;

import java.util.List;

public class StudentService implements IstudentService{
    IstudentDao studentDao = new StudentDao();
    @Override
    public List<Student> quert() {
        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int del(int id) {
        return studentDao.del(id);
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
