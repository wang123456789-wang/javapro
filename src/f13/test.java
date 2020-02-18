package f13;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db2";
        String username = "root";
        String password = "123123";
        Connection connection =null;
        PreparedStatement preparedStatement =null;
        try {
            //加载驱动 连哪种数据库 就加载哪种数据库
            Class.forName("com.mysql.jdbc.Driver");

            try {
                // 创建链接  通过DriverManager来实现
                connection = DriverManager.getConnection(url,username,password);
                preparedStatement =  connection.prepareStatement("insert into dept(deptno,dname,loc) values(60,'务部','天津')");
                //执行sql语句  看结果
                //如果是增删改  则用 PreparedStatement对象调用executeUpdate方法  返回行数int(受影响的行数)
                //如果是查询  则用 PreparedStatement对象调用executQuery方法  返回ResultSet对象(结果集)
                int i =  preparedStatement.executeUpdate();
                System.out.println(i);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //对于 connection 和 preparedStatement 来说都是资源 使用之后都要关闭
            try {
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
