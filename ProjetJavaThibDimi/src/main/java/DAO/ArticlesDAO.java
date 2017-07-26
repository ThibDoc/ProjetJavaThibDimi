package DAO;

import java.util.List;

import Entite.Articles;

public interface ArticlesDAO {
	
	public void insertArticles(Articles employe);
	public void updateArticles(Articles employe);
	public void removeArticles(int code);
	public Articles getArticles(int code);
	public List<Articles> getAllArticles();
}
