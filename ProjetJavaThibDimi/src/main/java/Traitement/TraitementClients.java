package Traitement;

import Entite.Clients;

import java.util.List;

import DAO.ClientsDAOMySQL;

public class TraitementClients {
	
	public List<Clients> clients;

	public TraitementClients(List<Clients> clients) {
		super();
		this.clients = clients;
	}
	
	public String[] MenuDeroulantClient(){
		
		
		String[] str = new String[this.clients.size()];
		int compteur =0;
		for(Clients unCli : this.clients){
			str[compteur] = unCli.getNom();
			compteur++;
		}
		
		return str;
	}
	
}
