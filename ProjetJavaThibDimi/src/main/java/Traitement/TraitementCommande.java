package Traitement;

import java.util.List;

import Entite.Articles;
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
	
	public Object[][] TableauArticleCommande(Articles art){
		Object[][] str = new Object[1][6];
		str[0] = new Object[] {art.getCode(),art.getCategorie(),art.getDesignation(),art.getQuantite(),art.getPrix_unitaire(),art.getQuantite() *art.getPrix_unitaire()  };
	
		return str;
	}

}
