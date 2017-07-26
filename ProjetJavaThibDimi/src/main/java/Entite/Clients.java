package Entite;

import java.sql.Date;
import java.util.List;

public class Clients {
	
	private int code;
	private Date date_creation;
	private String prenom;
	private String nom;
	private String adresse;
	private int fixe;
	private int mobile;
	private String email;
	private String remarques;
	private int carte_fidelite;
	private List<Commandes> listCom;
	
	public Clients(Date date_creation, String prenom, String nom, String adresse, int fixe, int mobile,
			String email, String remarques, int carte_fidelite,List<Commandes> listCom) {
		super();
		this.date_creation = date_creation;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.fixe = fixe;
		this.mobile = mobile;
		this.email = email;
		this.remarques = remarques;
		this.carte_fidelite = carte_fidelite;
		this.listCom = listCom;
	}
	
	public Clients() {
		// TODO Auto-generated constructor stub
	}



	

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getFixe() {
		return fixe;
	}
	public void setFixe(int fixe) {
		this.fixe = fixe;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRemarques() {
		return remarques;
	}
	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}
	public int getCarte_fidelite() {
		return carte_fidelite;
	}
	public void setCarte_fidelite(int carte_fidelite) {
		this.carte_fidelite = carte_fidelite;
	}
	public List<Commandes> getListCom() {
		return listCom;
	}

	public void setListCom(List<Commandes> listCom) {
		this.listCom = listCom;
	}
	
	
}
