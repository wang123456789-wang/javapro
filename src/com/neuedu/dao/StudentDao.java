package com.neuedu.dao;

import com.mysql.jdbc.Driver;
import com.neuedu.poji.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IstudentDao {
    @Override
    public List<Student> query() {
        List<Student> list = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password = "123123";
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            connection = DriverManager.getConnection(url,username,password);
            //执行sql语句  看结果
            //                //如果是增删改  则用 PreparedStatement对象调用executeUpdate方法  返回行数int(受影响的行数)
            //                //如果是查询  则用 PreparedStatement对象调用executQuery方法  返回ResultSet对象(结果集)
            preparedStatement = connection.prepareStatement("select id,name,age,gender from Student");
           resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getNString("name"));
                student.setAge(resultSet.getInt("age"));
                student.setGender(resultSet.getInt("gender"));
                list.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
                try {
                    if(resultSet!=null)
                        resultSet.close();
                    if(preparedStatement!=null)
                        preparedStatement.close();
                    if(connection!=null){
                        connection.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return list;
    }

    @Override
    public int add(Student student) {     //增加学生
        String url = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123123";
        int i = -1;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            connection = DriverManager.getConnection(url,username,password);
           //// 创建命令行 写sql语句
            preparedStatement = connection.prepareStatement("insert  into  Student(name,age,gender) values(?,?,?)");
            // 设置 问号的值
          preparedStatement.setString(1,student.getName());
          preparedStatement.setInt(2,student.getAge());
          preparedStatement.setInt(3,student.getGender());
           //返回结果集
            i = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(preparedStatement!=null)
                    preparedStatement.close();
                if(connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int update(Student student) {
        String url = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123123";
        int i = -1;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            connection = DriverManager.getConnection(url,username,password);
            //将sql代码写入连接
            preparedStatement = connection.prepareStatement("update Student set name=?,age=?,gender=? where id=?");
            preparedStatement.setString(1,student.getName());
            preparedStatement.setInt(2,student.getAge());
            preparedStatement.setInt(3,student.getGender());
            preparedStatement.setInt(4,student.getId());
            // 执行sql语句
            // 如果是查询  调用 executeQuery方法 返回一个 ResultSet 结果集
            i = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(preparedStatement != null)
                    preparedStatement.close();
                if(connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }


    @Override
    public int del(int id) {
        String url = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123123";
        int i = -1;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection(url,username,password);
            // 创建命令行 写sql语句
            preparedStatement = connection.prepareStatement("delete from student where id=?");
            // 设置 问好的值
            preparedStatement.setInt(1,id);
            // 执行sql语句
            // 如果是查询  调用 executeQuery方法 返回一个 ResultSet 结果集
            i = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(preparedStatement != null)
                    preparedStatement.close();
                if(connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
