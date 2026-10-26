package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

      //  1. Loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

    //  2. Creating a connection

        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/myschool";

        Connection con = DriverManager.getConnection(url,user,password);


        //   Creating a statement

        Statement st = con.createStatement();

      //  Executing the query

        String sql = "INSERT INTO student VALUES (12, 'priyanka', 'CS', 92)";

        st.executeUpdate(sql);


    }
}
