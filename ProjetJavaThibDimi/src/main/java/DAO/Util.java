package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Entite.Commandes;
import util.Connexions;

public class Util {
	
	public List<Commandes> combyname() throws SQLException{
		ClientsDAOMySQL com = new ClientsDAOMySQL();
		Connexions con = new Connexions("Luna","Luna");
		Connection connect = con.connect(con.getLog(), con.getPass());
		return com.getCommandesCli(connect, 1);
	}

	
}
