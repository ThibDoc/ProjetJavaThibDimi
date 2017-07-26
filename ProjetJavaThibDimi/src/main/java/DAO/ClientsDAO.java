package DAO;

import java.sql.Connection;
import java.util.List;

import Entite.Clients;
import Entite.Commandes;

public interface ClientsDAO {
	
	public void insertClients(Clients employe,Connection con);
	public void updateClients(Clients employe,Connection con);
	public void removeClients(int code,Connection con);
	public Clients getClients(int code,Connection con);
	public List<Clients> getAllClients(Connection con);
	public List<Commandes> getCommandesCli(Connection con,int cli);
	public Clients getCliByName(Connection con,String nom);
}
