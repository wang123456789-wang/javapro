package com.neuedu.test;

import com.neuedu.poji.Student;
import com.neuedu.poji.dept;
import com.neuedu.unti.JdbcUtil;
import com.neuedu.web.StudentWeb;

import java.util.List;

public class MyTest1 {
    public static void main(String[] args) {
        StudentWeb studentWeb = new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();
//        List<dept> list = JdbcUtil.eexecuteQuery("select Cno,Cname,Period,Ceredit from Course", dept.class);
//        System.out.println(list);
    }
}
