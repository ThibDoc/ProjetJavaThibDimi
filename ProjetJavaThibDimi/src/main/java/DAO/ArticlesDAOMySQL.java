package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Entite.Articles;

public class ArticlesDAOMySQL implements ArticlesDAO{

	Connection conn = null;
	Statement state = null;
	ResultSet result = null;

	
	@Override
	public void insertArticles(Articles art,Connection con) {
		
		String newCateg = art.getCategorie();
		String newDesignation = art.getDesignation();
		int newQuantite= art.getQuantite();
		Double newPrixUnit = art.getPrix_unitaire();
		
		try {
			state = con.createStatement();
			state.executeUpdate("INSERT INTO `article`VALUES (NULL,'"+newCateg+"','"+newDesignation+"',"+newQuantite+","+newPrixUnit+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateArticles(Articles art,Connection con) {

		int updateCode =art.getCode();
		String updateCateg = art.getCategorie();
		String updateDesignation =art.getDesignation();
		int updateQuantite= art.getQuantite();
		Double updatePrixUnit = art.getPrix_unitaire();
		
		try {
			state = con.createStatement();
			state.executeUpdate("UPDATE article SET categorie='"+updateCateg+"',designation='"+updateDesignation+"',quantite="+updateQuantite+",prix_unitaire="+updatePrixUnit+"  WHERE code = "+updateCode);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeArticles(int code,Connection con) {
		try {
			state = con.createStatement();
			state.executeUpdate("DELETE FROM `article` WHERE code ="+code);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Articles getArticles(Connection con,String name) {
		
		Articles article=null;
		try {
			
			state = con.createStatement();
			result = state.executeQuery("SELECT * FROM article where designation = '"+name+"'");

			while (result.next()) {
				article=new Articles();
				article.setCode(result.getInt("code"));
				article.setCategorie(result.getString("categorie"));
				article.setDesignation(result.getString("designation"));
				article.setQuantite(result.getInt("quantite"));
				article.setPrix_unitaire(result.getDouble("prix_unitaire"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return article;
	}

	@Override
	public List<Articles> getAllArticles(Connection con) {
		
		List<Articles> articles=new ArrayList<Articles>();
		Articles article=null;
		try {
			
			state = con.createStatement();
			result = state.executeQuery("SELECT * FROM article");

			while (result.next()) {
				article=new Articles();
				article.setCode(result.getInt("code"));
				article.setCategorie(result.getString("categorie"));
				article.setDesignation(result.getString("designation"));
				article.setQuantite(result.getInt("quantite"));
				article.setPrix_unitaire(result.getDouble("prix_unitaire"));
				articles.add(article);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return articles;

	}

	@Override
	public List<Articles> getAllArticleOrderCateg(Connection con) {
		List<Articles> articles=new ArrayList<Articles>();
		Articles article=null;
		try {
			
			state = con.createStatement();
			result = state.executeQuery("SELECT * FROM `article` ORDER BY categorie");

			while (result.next()) {
				article=new Articles();
				article.setCode(result.getInt("code"));
				article.setCategorie(result.getString("categorie"));
				article.setDesignation(result.getString("designation"));
				article.setQuantite(result.getInt("quantite"));
				article.setPrix_unitaire(result.getDouble("prix_unitaire"));
				articles.add(article);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return articles;
	}

	

}
