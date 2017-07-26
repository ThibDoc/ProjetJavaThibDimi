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
		Commandes come = new Commandes(1, "bite", 502.2, "2017-01-01", 2,5);
		CommandesDAOMySQL com = new CommandesDAOMySQL();
		
		com.insertCommandes(come, connect);
		
	}

}
