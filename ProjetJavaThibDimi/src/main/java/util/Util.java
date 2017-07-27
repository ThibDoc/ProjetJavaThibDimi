package util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import DAO.ClientsDAOMySQL;
import Entite.Commandes;

public class Util {
	
	public List<Commandes> combyname(int id) throws SQLException{
		
		
				Connection conn = null;
				conn = GlobalConnection.getInstance();
		 		ClientsDAOMySQL com = new ClientsDAOMySQL();

		 		return com.getCommandesCli(conn, id);
		 }
	
	
}
