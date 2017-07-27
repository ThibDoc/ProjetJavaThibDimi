package Traitement;

import java.util.List;

import Entite.Articles;
import Entite.Clients;
import Entite.Commandes;

public class TraitementCommande {
	
	
	
	public String[] comboBoxArticle(List<Articles> list){
		String[] str = new String[list.size()];
		int compteur =0;
		for(Articles unArt : list){
			str[compteur] = unArt.getDesignation();
			compteur++;
		}
		
		return str;
		
	}
	

	public String[] comboBoxCommande(List<Commandes> list){
		String[] str = new String[list.size()];
		int compteur =0;
		for(Commandes uneCom : list){
			str[compteur] = Integer.toString(uneCom.getCode());
			compteur++;
		}
		
		return str;
		
	}
	
	public Object[][] TableauArticleCommande(List<Articles> list){
		Object[][] str = new Object[list.size()][6];
		int compteur =0;
		for(Articles unArt : list){
			
			str[compteur] = new Object[] {unArt.getCode(),unArt.getCategorie(),unArt.getDesignation(),unArt.getQuantite(),unArt.getPrix_unitaire(),unArt.getQuantite() * unArt.getPrix_unitaire()  };
			compteur++;
		}
		return str;
	}

	public Object[][] TableauToutesCommande(List<Commandes> list){
		Object[][] str = new Object[list.size()][5];
		int compteur =0;
		for(Commandes uneCom : list){
			
			str[compteur] = new Object[] {uneCom.getCode(),uneCom.getCode_cli(),uneCom.getMode_payement(),uneCom.getTotal_ttc(),uneCom.getDate()};
			compteur++;
		}
		return str;
	}
	
}
