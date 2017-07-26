package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import Entite.Clients;
import Entite.Commandes;
import util.Connexions;

public class test {

	public static void main(String[] args) throws SQLException, ParseException {
		// TODO Auto-generated method stub
		Connexions con = new Connexions("Luna","Luna");
		Connection connect = con.connect(con.getLog(), con.getPass());
		ClientsDAOMySQL com = new ClientsDAOMySQL();
		
		List<Commandes> list = com.getCommandesCli(connect, 1);
		
		Clients cli = com.getCliByName(connect, "Leclercq");
		
		
		for (Commandes commandes : list) {
			System.out.println(commandes.getQuantite());
		}
		/*cli.setListCom(list);
		System.out.println(cli.getAdresse());
		for (Commandes commandes : cli.getListCom()) {
			System.out.println(commandes.getQuantite());
		}*/
		
		/*List<Clients> li = com.getAllClients(connect);
		
		for (Clients clients : li) {
			for (Commandes commandes : clients.getListCom()) {
				System.out.println(commandes.getQuantite());
			}
		}*/
		
	}

}
