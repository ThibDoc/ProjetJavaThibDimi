package DAO;

import java.util.List;

import Entite.Clients;

public interface ClientsDAO {
	
	public void insertClients(Clients employe);
	public void updateClients(Clients employe);
	public void removeClients(int code);
	public Clients getClients(int code);
	public List<Clients> getAllArticles();
}
