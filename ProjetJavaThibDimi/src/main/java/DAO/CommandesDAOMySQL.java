package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entite.Clients;
import Entite.Commandes;

public class CommandesDAOMySQL implements CommandesDAO{

	Connection conn = null;
	Statement state = null;
	ResultSet result = null;
	
	
	@Override
	public void insertCommandes(Commandes employe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCommandes(Commandes employe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCommandes(int code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Commandes getCommandes(int code,Connection con) {
		Commandes commande=null;
		try {
			
			state = con.createStatement();
			result = state.executeQuery("SELECT * FROM commande where code = '"+code+"'");

			while (result.next()) {
				commande=new Commandes();
				commande.setCode_cli(result.getInt("code_cli"));
				commande.setMode_payement(result.getString("mode_payement"));
				commande.setTotal_ttc(result.getDouble("total_ttc"));
				commande.setDate(result.getDate("date"));
				commande.setCode_article(result.getInt("code_article"));
				commande.setQuantite(result.getInt("quantite"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return commande;
	}

	@Override
	public List<Commandes> getAllCommandes(Connection con) {
		List<Commandes> commandes=new ArrayList<Commandes>();
		Commandes commande=null;
		try {
			
			state = con.createStatement();
			result = state.executeQuery("SELECT * FROM commande");

			while (result.next()) {
				commande=new Commandes();
				commande.setCode_cli(result.getInt("code_cli"));
				commande.setMode_payement(result.getString("mode_payement"));
				commande.setTotal_ttc(result.getDouble("total_ttc"));
				commande.setDate(result.getDate("date"));
				commande.setCode_article(result.getInt("code_article"));
				commande.setQuantite(result.getInt("quantite"));
				commandes.add(commande);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return commandes;
	}

}
