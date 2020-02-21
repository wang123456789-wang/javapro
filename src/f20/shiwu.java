package f20;

import com.neuedu.poji.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class shiwu {

    public static void main(String[] args) {
        shiwu1();

    }
    static List<Student> shiwu1(){
        List<Student> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        String url = "jdbc:mysql://192.168.148.148:3306/db1?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123123";
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement2 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            connection.setAutoCommit(false);
            preparedStatement2 = connection.prepareStatement("selecte id,name,age,gender from student");
            resultSet = preparedStatement2.executeQuery();
            while(resultSet.next()){
                Student student = new Student(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getInt(4));
                list.add(student);
            }

        } catch (ClassNotFoundException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(resultSet!=null)
                    resultSet.close();
                if(preparedStatement2!=null)
                    preparedStatement2.close();
                if(connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    static void shiwu2(){
        int i = 0;
        int j = 0;
        String url = "jdbc:mysql://192.168.148.148:3306/db1?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123123";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement2 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            connection.setAutoCommit(false);
            preparedStatement2 = connection.prepareStatement("insert into student(id,name,age,gender) values(?,?,?,?)");
            preparedStatement2.setObject(1,46);
            preparedStatement2.setObject(2,"wangruijun");
            preparedStatement2.setObject(3,23);
            preparedStatement2.setObject(4,1);
            j = preparedStatement2.executeUpdate();
            System.out.println(j);
            Thread.sleep(30000);
            connection.commit();
        } catch (ClassNotFoundException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if(preparedStatement2!=null)
                    preparedStatement2.close();
                if(connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
