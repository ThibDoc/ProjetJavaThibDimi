package Traitement;

import java.util.List;

import Entite.Articles;

public class TraitementArticle {
	public Object[][] TableauArticleCommande(List<Articles> list){
		Object[][] str = new Object[list.size()][5];
		int compteur =0;
		for(Articles unArt : list){
			
			str[compteur] = new Object[] {unArt.getCode(),unArt.getCategorie(),unArt.getDesignation(),unArt.getQuantite(),unArt.getPrix_unitaire() };
			compteur++;
		}
		return str;
	}
}
