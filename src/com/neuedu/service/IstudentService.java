package com.neuedu.service;

import com.neuedu.poji.Student;

import java.util.List;

public interface IstudentService {
    List<Student> quert();
    int add(Student student);
    int update(Student student);
    int del(int id);
    Student queryOne(int id);
}
