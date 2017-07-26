package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entite.Clients;

public class ClientsDAOMySQL implements ClientsDAO {

	Connection conn = null;
	Statement state = null;
	ResultSet result = null;

	
	@Override
	public void insertClients(Clients employe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClients(Clients employe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeClients(int code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Clients getClients(int code) {
		// TODO Auto-generated method stub
		return null;
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
