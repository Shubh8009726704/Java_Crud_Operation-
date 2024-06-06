package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Show_Database {
public static void main(String[] args) throws SQLException,ClassNotFoundException {
		
	    String url = "jdbc:mysql://localhost:3306/adit";
        String username = "root";
        String password = "Shubh@8055";
        
        //driver
		Class.forName("com.mysql.cj.jdbc.Driver");
        
        //connection establish
        Connection conn = DriverManager.getConnection(url,username,password);
        System.out.println("Database Connected Successfully " + conn);
        
        //statement 
        Statement stm = conn.createStatement();
        
        //execute query 
        String query = "show databases";
        ResultSet rs = stm.executeQuery(query);
        System.out.println(rs);
        while(rs.next()) {
        	System.out.println(rs.getString(1));
        }
        
        //connection close
        conn.close();
	}
}
