package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GlobalConnection {
	
	private String url = "jdbc:mysql://localhost:3306/luna";

	private static Connection connect;
	
	public GlobalConnection(String log , String mdp) throws SQLException{
		
		connect = DriverManager.getConnection(url,log,mdp);
		
	}
	
	private GlobalConnection(){
		
	}
	
	public static Connection getInstance() throws SQLException{

		return connect;
	}

}

