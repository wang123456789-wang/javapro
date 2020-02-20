package com.neuedu.dao;

import com.mysql.jdbc.Driver;
import com.neuedu.poji.Student;
import com.neuedu.poji.dept;
import com.neuedu.unti.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IstudentDao {
    @Override
    public List query() {
          List<Student> list = JdbcUtil.executeQuery("select id,name,age,gender from student", Student.class);
//        List<Student> list = new ArrayList<>();
//        String url = "jdbc:mysql://localhost:3306/db1";
//        String username = "root";
//        String password = "123123";
//        PreparedStatement preparedStatement = null;
//        Connection connection = null;
//        ResultSet resultSet = null;
//        try {
//            //加载驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            //创建连接
//            connection = DriverManager.getConnection(url,username,password);
//            //执行sql语句  看结果
//            //                //如果是增删改  则用 PreparedStatement对象调用executeUpdate方法  返回行数int(受影响的行数)
//            //                //如果是查询  则用 PreparedStatement对象调用executQuery方法  返回ResultSet对象(结果集)
//            preparedStatement = connection.prepareStatement("select id,name,age,gender from Student");
//           resultSet = preparedStatement.executeQuery();
//
//            while(resultSet.next()){
//                Student student = new Student(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getInt("age"),resultSet.getInt("gender"));
//                list.add(student);
//
////                student.setId(resultSet.getInt("id"));
////                student.setName(resultSet.getString("name"));
////                student.setAge(resultSet.getInt("age"));
////                student.setGender(resultSet.getInt("gender"));
////                list.add(student);
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//                try {
//                    if(resultSet!=null)
//                        resultSet.close();
//                    if(preparedStatement!=null)
//                        preparedStatement.close();
//                    if(connection!=null){
//                        connection.close();
//                    }
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//        }
        return list;
    }

    @Override
    public int add(Student student) {     //增加学生
        return JdbcUtil.executeUpdate("insert  into  student(name,age,gender) values(?,?,?)",student.getName(),student.getAge(),student.getGender());
//        String url = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
//        String username = "root";
//        String password = "123123";
//        int i = -1;
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        try {
//            //加载驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            //创建连接
//            connection = DriverManager.getConnection(url,username,password);
//           //// 创建命令行 写sql语句
//            preparedStatement = connection.prepareStatement("insert  into  Student(name,age,gender) values(?,?,?)");
//            // 设置 问号的值
//          preparedStatement.setString(1,student.getName());
//          preparedStatement.setInt(2,student.getAge());
//          preparedStatement.setInt(3,student.getGender());
//           //返回结果集
//            i = preparedStatement.executeUpdate();
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(preparedStatement!=null)
//                    preparedStatement.close();
//                if(connection!=null)
//                    connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        return i;
    }

    @Override
    public int update(Student student) {    //修改学生
        return JdbcUtil.executeUpdate("update student set name=?,age=?,gender=? where id=?",student.getName(),student.getAge(),student.getGender(),student.getId());
//        String url = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
//        String username = "root";
//        String password = "123123";
//        int i = -1;
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        try {
//            //加载驱动
//            //创建连接
//            //将sql代码写入连接
//            preparedStatement = connection.prepareStatement("update Student set name=?,age=?,gender=? where id=?");
//            preparedStatement.setString(1,student.getName());
//            preparedStatement.setInt(2,student.getAge());
//            preparedStatement.setInt(3,student.getGender());
//            preparedStatement.setInt(4,student.getId());
//            // 执行sql语句
//            // 如果是查询  调用 executeQuery方法 返回一个 ResultSet 结果集
//            i = preparedStatement.executeUpdate();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(preparedStatement != null)
//                    preparedStatement.close();
//                if(connection != null)
//                    connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        return i;
    }


    @Override
    public int del(int id) {    //删除学生
        return  JdbcUtil.executeUpdate("delete from student where id=?",id);
//        String url = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
//        String username = "root";
//        String password = "123123";
//        int i = -1;
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        try {
//            // 加载驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            // 创建连接
//            connection = DriverManager.getConnection(url,username,password);
//            // 创建命令行 写sql语句
//            preparedStatement = connection.prepareStatement("delete from student where id=?");
//            // 设置 问好的值
//            preparedStatement.setInt(1,id);
//            // 执行sql语句
//            // 如果是查询  调用 executeQuery方法 返回一个 ResultSet 结果集
//            i = preparedStatement.executeUpdate();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(preparedStatement != null)
//                    preparedStatement.close();
//                if(connection != null)
//                    connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        return i;
    }

    @Override
    public Student queryOne(int id) {
        Student student = new Student();
        String url = "jdbc:mysql:localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123123";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            connection = DriverManager.getConnection(url,username,password);
            //将sql代码写入连接中
            preparedStatement = connection.prepareStatement("select * from Student where id=?");
            //执行SQL代码返回结果集

            resultSet = preparedStatement.executeQuery();
            preparedStatement.setInt(1,student.getId());
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getNString("name"));
            student.setAge(resultSet.getInt("age"));
            student.setGender(resultSet.getInt("gender"));
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
                    if(connection!=null)
                        connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return student ;
    }
}
