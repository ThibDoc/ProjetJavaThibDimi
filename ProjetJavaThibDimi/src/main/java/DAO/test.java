package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Connexions.Connexions;
import Entite.Clients;

public class test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connexions con = new Connexions("Luna","Luna");
		Connection connect = con.connect(con.getLog(), con.getPass());
		List<Clients> list = new ClientsDAOMySQL().getAllClients(connect);
		
		for (Clients unClient : list) {
			System.out.println(unClient.getNom());
		}
	}

}
