package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Connexions.Connexions;
import Entite.Clients;
import Entite.Commandes;

public class test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connexions con = new Connexions("Luna","Luna");
		Connection connect = con.connect(con.getLog(), con.getPass());
		Commandes com = new CommandesDAOMySQL().getCommandes(1,connect);
		
		
		System.out.println(com.getTotal_ttc());
		
	}

}
