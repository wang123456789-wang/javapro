package f20;

import java.sql.*;

public class shiwu {

    public static void main(String[] args) {
        add();

    }
    static void add(){
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
            preparedStatement = connection.prepareStatement("insert into student(id,name,age,gender) values(?,?,?,?)");
            preparedStatement.setObject(1,45);
            preparedStatement.setObject(2,"王彦臻");
            preparedStatement.setObject(3,23);
            preparedStatement.setObject(4,1);
            preparedStatement2 = connection.prepareStatement("insert into student(id,name,age,gender) values(?,?,?,?)");
            preparedStatement2.setObject(1,46);
            preparedStatement2.setObject(2,"wangruijun");
            preparedStatement2.setObject(3,23);
            preparedStatement2.setObject(4,1);
            i = preparedStatement.executeUpdate();
            System.out.println(i);
            int m = 20;
            m = m/0;
            j = preparedStatement2.executeUpdate();
            System.out.println(j);
            connection.commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(preparedStatement2!=null)
                    preparedStatement2.close();
                if(preparedStatement!=null)
                    preparedStatement.close();
                if(connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
