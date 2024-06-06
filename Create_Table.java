package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Table {

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
        String query = "create table Students(name varchar(50),age int(10),city varchar(50),college varchar(50))";
        stm.execute(query);
        System.out.println("Table created successfully");
        
        //connection close
        conn.close();
	}

}
