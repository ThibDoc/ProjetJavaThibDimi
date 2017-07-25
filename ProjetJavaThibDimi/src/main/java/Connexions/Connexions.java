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

		Statement req1 = con.createStatement();
		ResultSet rs = req1.executeQuery("select * from clients where id = '1'");

		while(rs.next()){
			System.out.println(rs.getString("id"));
		}
		rs.close();
		req1.close();
		con.close();
		

	}

}
