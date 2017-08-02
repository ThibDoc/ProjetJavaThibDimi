package DAO;

import java.sql.Connection;
import java.util.List;

import Entite.Articles;

public interface ArticlesDAO {
	
	public void insertArticles(Articles art,Connection con);
	public void updateArticles(Articles art,Connection con);
	public void removeArticles(int code, Connection con);
	public Articles getArticles(Connection con, String name);
	public List<Articles> getAllArticles(Connection con);
	
}
