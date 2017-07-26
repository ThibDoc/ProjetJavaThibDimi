package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entite.Clients;
import Entite.Commandes;

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
				clients.add(client);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clients;

	}

}
