package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexions{
	
	private String log;
	private String pass;
	
	
	public  Connexions(String login, String mdp) throws SQLException {
		this.log = login;
		this.pass = mdp;
		
		connect(login ,mdp);
		
		
	}
	
	public Connection connect(String login, String mdp) throws SQLException{
		String url = "jdbc:mysql://localhost:3306/luna";
		
		Connection con = DriverManager.getConnection(url,login,mdp);
		 
		return con;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
