package Connexions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexions{
	
	public Connexions(String login, String mdp) throws SQLException{
		
		String url = "jdbc:mysql://localhost:3306/luna";
		
		Connection con = DriverManager.getConnection(url,login,mdp);

		con.close();
		

	}

}
