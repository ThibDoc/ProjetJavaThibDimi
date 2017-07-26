package Entite;

public class Articles {
	
	private int code ;
	private String categorie;
	private String designation;
	private int quantite;
	private double prix_unitaire;
	
	public Articles(String categorie, String designation, int quantite, double prix_unitaire) {
		super();
		this.categorie = categorie;
		this.designation = designation;
		this.quantite = quantite;
		this.prix_unitaire = prix_unitaire;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix_unitaire() {
		return prix_unitaire;
	}
	public void setPrix_unitaire(double prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}
	
	
	
}
