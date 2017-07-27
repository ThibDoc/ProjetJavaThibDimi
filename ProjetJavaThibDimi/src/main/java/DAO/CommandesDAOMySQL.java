package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entite.Clients;
import Entite.Commandes;

public class CommandesDAOMySQL implements CommandesDAO{

	Connection conn = null;
	Statement state = null;
	ResultSet result = null;
	
	
	@Override
	public void insertCommandes(Commandes commande,Connection con) {
		int code_cli = commande.getCode_cli();
		String mode_payement = commande.getMode_payement();
		double total_ttc = commande.getTotal_ttc();
		String date = commande.getDate();
		int code_article = commande.getCode_article();
		int quantite = commande.getQuantite();
		
		try {
			state = con.createStatement();
			state.executeUpdate("INSERT INTO `commande`(`code_cli`, `mode_payement`, `total_ttc`, `date`, `code_article`, `quantite`) VALUES ("+code_cli+",'"+mode_payement+"',"+total_ttc+",'"+date+"',"+code_article+","+quantite+")");
			System.out.println("Commande ajouter");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateCommandes(Commandes commande,Connection con) {
	    int code = commande.getCode();
		int code_cli = commande.getCode_cli();
		String mode_payement = commande.getMode_payement();
		double total_ttc = commande.getTotal_ttc();
		String date = commande.getDate();
		int code_article = commande.getCode_article();
		int quantite = commande.getQuantite();
		
		try {
			state = con.createStatement();
			state.executeUpdate("UPDATE `commande` SET `code`="+code+",`code_cli`="+code_cli+",`mode_payement`=\""+mode_payement+"\",`total_ttc`="+total_ttc+",`date`="+date+",`code_article`="+code_article+",`quantite`="+quantite+" WHERE code = '"+code+"'");
			System.out.println("Commande n°"+code+" modifier");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeCommandes(int code,Connection con) {
		
		try {
			state = con.createStatement();
			state.executeUpdate("DELETE FROM `commande` WHERE code = '"+code+"'");
			System.out.println("Commande n°"+code+" supprimer");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Commandes getCommandes(int code,Connection con) {
		Commandes commande=null;
		try {
			
			state = con.createStatement();
			result = state.executeQuery("SELECT * FROM commande where code = '"+code+"'");

			while (result.next()) {
				commande=new Commandes();
				commande.setCode(result.getInt("code"));
				commande.setCode_cli(result.getInt("code_cli"));
				commande.setMode_payement(result.getString("mode_payement"));
				commande.setTotal_ttc(result.getDouble("total_ttc"));
				commande.setDate(result.getString("date"));
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
				commande.setDate(result.getString("date"));
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
