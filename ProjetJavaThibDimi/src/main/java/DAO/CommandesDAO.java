package DAO;

import java.sql.Connection;
import java.util.List;

import Entite.Commandes;

public interface CommandesDAO {
	
	public void insertCommandes(Commandes employe);
	public void updateCommandes(Commandes employe);
	public void removeCommandes(int code);
	public Commandes getCommandes(int code,Connection con);
	public List<Commandes> getAllCommandes(Connection con);
}
