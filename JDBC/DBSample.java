import java.sql.*;
import java.util.*;
public class DBSample {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/CSE999";
    String username = "student";
    String passwd = "student123#";
    Connection conn = null;
    Statement stmt = null;
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(url, username, passwd);
      stmt = conn.createStatement();
      String query = "select * from student";
      ResultSet rs = stmt.executeQuery(query);
      while(rs.next()){
System.out.println(rs.getInt(1) + " " + rs.getString(2));
      }
      stmt.close();
      conn.close();
     }catch(Exception e){
      e.printStackTrace();
} }
}