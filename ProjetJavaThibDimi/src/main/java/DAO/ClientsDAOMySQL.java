package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entite.Clients;
import Entite.Commandes;
import util.Util;

public class ClientsDAOMySQL implements ClientsDAO {

	Connection conn = null;
	Statement state = null;
	ResultSet result = null;

	
	@Override
	public void insertClients(Clients employe, Connection con) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClients(Clients employe, Connection con) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeClients(int code, Connection con) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Clients getClients(int code, Connection con) {
		Clients client=null;
		try {
			
			state = con.createStatement();
			result = state.executeQuery("SELECT * FROM client where code = '"+code+"'");

			while (result.next()) {
				client=new Clients();
				client.setCode(result.getInt("code"));
				client.setDate_creation(result.getDate("date_creation"));
				client.setPrenom(result.getString("prenom"));
				client.setNom(result.getString("nom"));
				client.setAdresse(result.getString("adresse"));
				client.setFixe(result.getInt("fixe"));
				client.setMobile(result.getInt("mobile"));
				client.setEmail(result.getString("email"));
				client.setRemarques(result.getString("remarques"));
				client.setCarte_fidelite(result.getInt("carte_fidelite"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return client;
	}

	@Override
	public List<Clients> getAllClients(Connection con) {
		List<Clients> clients=new ArrayList<Clients>();
		Clients client=null;
		try {
			
			state = con.createStatement();
			result = state.executeQuery("SELECT * FROM clients");

			while (result.next()) {
				client=new Clients();
				client.setCode(result.getInt("code"));
				client.setDate_creation(result.getDate("date_creation"));
				client.setPrenom(result.getString("prenom"));
				client.setNom(result.getString("nom"));
				client.setAdresse(result.getString("adresse"));
				client.setFixe(result.getInt("fixe"));
				client.setMobile(result.getInt("mobile"));
				client.setEmail(result.getString("email"));
				client.setRemarques(result.getString("remarques"));
				client.setCarte_fidelite(result.getInt("carte_fidelite"));
				Util u = new Util();
				client.setListCom( u.combyname(client.getCode()) );
				clients.add(client);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clients;

	}

	@Override
	public List<Commandes> getCommandesCli(Connection con,int cli) {
		List<Commandes> commandes=new ArrayList<Commandes>();
		Commandes commande=null;
		try {
			
			state = con.createStatement();
			result = state.executeQuery("SELECT * FROM commande where code_cli = "+cli);

			while (result.next()) {
				commande=new Commandes();
				commande.setCode(result.getInt("code"));
				commande.setCode_cli(result.getInt("code_cli"));
				commande.setMode_payement(result.getString("mode_payement"));
				commande.setTotal_ttc(result.getDouble("total_ttc"));
				commande.setDate(result.getString("date"));
				commandes.add(commande);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return commandes;
	}

	@Override
	public Clients getCliByName(Connection con, String nom) {
		Clients client=null;
		try {
			
			state = con.createStatement();
			result = state.executeQuery("SELECT * FROM clients where nom = '"+nom+"'");

			while (result.next()) {
				client=new Clients();
				client.setCode(result.getInt("code"));
				client.setDate_creation(result.getDate("date_creation"));
				client.setPrenom(result.getString("prenom"));
				client.setNom(result.getString("nom"));
				client.setAdresse(result.getString("adresse"));
				client.setFixe(result.getInt("fixe"));
				client.setMobile(result.getInt("mobile"));
				client.setEmail(result.getString("email"));
				client.setRemarques(result.getString("remarques"));
				client.setCarte_fidelite(result.getInt("carte_fidelite"));
				Util u = new Util();
				client.setListCom( u.combyname(client.getCode()) );
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return client;
	}

}
