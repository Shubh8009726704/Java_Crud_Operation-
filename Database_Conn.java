package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_Conn {

	public static void main(String[] args) throws SQLException {
		
        String url = "jdbc:mysql://localhost:3306/adit";
        String username = "root";
        String password = "Shubh@8055";
        
        Connection conn = DriverManager.getConnection(url,username,password);
        System.out.println("Database Connected Successfully" );
	
	}

}
