package Traitement;

import java.util.List;

import Entite.Clients;
import Entite.Commandes;

public class TraitementCommande {
	
	
	
	public String[] comboBoxCommandeCli(List<Commandes> list){
		String[] str = new String[list.size()];
		int compteur =0;
		for(Commandes uneCommande : list){
			str[compteur] = Integer.toString(uneCommande.getCode());
			compteur++;
		}
		
		return str;
		
	}

}
