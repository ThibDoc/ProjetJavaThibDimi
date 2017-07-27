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
	public void insertArticles(Articles employe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateArticles(Articles employe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeArticles(int code) {
		// TODO Auto-generated method stub
		
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

}
