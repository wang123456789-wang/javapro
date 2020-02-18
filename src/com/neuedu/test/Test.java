package com.neuedu.test;

import com.neuedu.dao.StudentDao;
import com.neuedu.poji.Student;
import com.neuedu.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        StudentDao studentDao = new StudentDao();
        List<Student> list1 = new ArrayList<>();
        StudentService studentService = new StudentService();
        list1 = studentService.quert();
        for(Student student:list1){
            System.out.println(student);
        }
    }
}
