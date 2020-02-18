package com.neuedu.web;

import com.neuedu.poji.Student;
import com.neuedu.service.IstudentService;
import com.neuedu.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentWeb {
    IstudentService studentService =  new StudentService();
    public void showmain(){
        System.out.println("1-----------------查询");
        System.out.println("2-----------------增加");
        System.out.println("3-----------------修改");
        System.out.println("4-----------------删除");
        System.out.println("其它---------------退出");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
            switch (i) {
                case 1:
                    query();
                    break;
                case 2:
                    add(scanner);
                    break;
                case 3:
                    update(scanner);
                    break;
                case 4:
                    del(scanner);
                    break;
                case 5:
                   System.exit(0);
                    break;
            }
    }



    private void query(){
        //调用服务程提供的方法来访问数据库
        List<Student> list = studentService.quert();
        for(Student student:list){
            System.out.println(student);
        }
    }

    private void add(Scanner scanner){
        System.out.println("请输入要添加的名字");
        String name = scanner.next();
        System.out.println("请输入要添加的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入性别 1-男 0-女");
        int gender = scanner.nextInt();
        Student student = new Student(name,age,gender);
        // 调用服务层 添加该数据
        studentService.add(student);
        // 显示列表
        query();
    }
    private void update(Scanner scanner){
        System.out.println("请输入要修改的id");
        int id = scanner.nextInt();
        System.out.println("请输入要修改的名字");
        String name = scanner.next();
        System.out.println("请输入要修改的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入要修改的性别 1-男 0-女");
        int gender = scanner.nextInt();
        Student student = new Student(id,name,age,gender);
        // 调用服务层 修改方法
        studentService.update(student);
        // 显示列表
        query();
    }
    private void del(Scanner scanner){
        System.out.println("请输入要删除的id");
        int id = scanner.nextInt();
        // 调用服务层删除方法
        studentService.del(id);
        // 显示列表
        query();
    }
}
