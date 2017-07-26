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
	public Articles getArticles(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Articles> getAllArticles() {
		List<Articles> employes=new ArrayList<Articles>();
		Articles Articles=null;
		try {
			
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM employe");

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employes;

	}

}
