package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.mysql.fabric.xmlrpc.Client;

import Entite.Clients;
import Entite.Commandes;
import util.Connexions;
import util.DateActuel;
import util.GlobalConnection;
import util.Util;

public class test {

	public static void main(String[] args) throws SQLException, ParseException {
	
		DateActuel d = new DateActuel();
		System.out.println(d.dateActuel());
		
	}

}
