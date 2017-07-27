package DAO;

import java.sql.Connection;
import java.util.List;

import Entite.Articles;

public interface ArticlesDAO {
	
	public void insertArticles(Articles employe);
	public void updateArticles(Articles employe);
	public void removeArticles(int code);
	public Articles getArticles(Connection con, String name);
	public List<Articles> getAllArticles(Connection con);
}
