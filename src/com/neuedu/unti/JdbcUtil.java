package com.neuedu.unti;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {
    private static final String URL = "jdbc:mysql://192.168.148.148:3306/db1";
    private static final  String USERNAME = "root";
    private static final  String PASSWORD = "123123";
    //封装加载驱动
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //封装创建连接
    static Connection getConnect(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    //封装通用的增删改
    public static int executeUpdate(String sql,Object... params){
        int result = 0;
        Connection connection = getConnect();
        PreparedStatement preparedStatement = null;
        try {
            //把sql代码写入连接
            preparedStatement = connection.prepareStatement(sql);
            if(params != null){
                for(int i = 0;i<params.length;i++){
                    preparedStatement.setObject(i+1,params[i]);
                }
            }
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(connection,preparedStatement);
        }
        return result;
    }

//封装关闭接口
    static void close(Connection connection,PreparedStatement preparedStatement){
        try {
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void close(Connection connection,PreparedStatement preparedStatement,ResultSet resultSet){
        try {
            connection.close();
            preparedStatement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //封装通用查询 方法一
    public static <T> List<T> executeQuery(String sql,Class<T> clz,Object... params){
        //Student 继承Objiect
        //List<Student> 和List<Object>之间没有继承关系
        List<T> list = new ArrayList<>();
        //调用创建连接方法来创建连接
        Connection connection = getConnect();
        //将sql代码写入连接
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement =connection.prepareStatement(sql);
            if(params!=null){
                for(int i = 0;i<params.length;i++){
                    preparedStatement.setObject(i+1,params[i]);
                }
            }
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                //创建一个T类型的对象
                //该方法是通过反射 Class对象 调用无参构造方法来创建对象
                T t = clz.newInstance();
                //通过字段名从resultSet中拿值，然后赋值给对象的属性
                //在不知道该类有多少个属性的情况下 有多少个属性就应该给多少个属性赋值 set
                //我们必须先获取有多少个属性 一个属性存放在一个Field中，从这个Field[]中取出属性
                Field[] fields = clz.getDeclaredFields(); //getDeclaredFields()时取出所有权限的属性 getFields()是取出非私有属性
                //属性名刚好和数据库字段名一样了，我们就可以把属性名当作数据库里的字段名 用 resultSet.getObject(属性名)
                //dept表的字段名有 deptno dname loc
                for(Field f:fields){
                    // f.getName() 可能和 数据库中的字段名不同
                    // 那么我们就先看 该属性有没有 Column注解  如果有 我们用注解的值当做字段名
                    // 如果没有注解 我们再把 f.getName() 当做字段名
                    // 此刻就要先判断 该属性下 有没有 Column注解
                    String column=f.getName();
                    if(f.isAnnotationPresent(Column.class)){
                        // 如果有 我们就要获取到注解的值 来替换 column的值
                        // 获取注解
                        Column c = f.getAnnotation(Column.class);
                        // 用注解的value 替换 column
                        column = c.value();
                    }
                    Object value = resultSet.getObject(column);
                    // 拿出值之后 我们就可以为 属性赋值了
                    // 为属性赋值 属性对象是 Field 但是我们必须指明 我们要为哪个对象的属性赋值
                    /*
                     我们用 field 调用set方法 可以进行赋值
                        第一个参数 传一个对象  表示为哪个对象的该属性赋值

                        第二个参数 传值 表示 赋什么样的值

                        注意 如果该属性是 private 那么在赋值之前必须先打开权限
                     */
                    f.setAccessible(true);
                    f.set(t, value);

                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            close(connection,preparedStatement,resultSet);
        }
        return list;
    }
    //封装通用查询方法二

}
