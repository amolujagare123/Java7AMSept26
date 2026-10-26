package JDBCDemo;

import java.sql.*;

public class JDBCDemo2 {

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

        String sql = "select * from student";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }


    }
}
