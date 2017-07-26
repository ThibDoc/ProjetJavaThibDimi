package Entite;

import java.util.Date;

public class Commandes{
	
	private int code;
	private	int code_cli;
	private String mode_payement;
	private double total_ttc;
	private String date;
	private int code_article;
	private int quantite;
	
	public Commandes(int code_cli, String mode_payement, double total_ttc, String date, int code_article,
			int quantite) {
		super();
		this.code_cli = code_cli;
		this.mode_payement = mode_payement;
		this.total_ttc = total_ttc;
		this.date = date;
		this.code_article = code_article;
		this.quantite = quantite;
	}
	public Commandes() {
		// TODO Auto-generated constructor stub
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getCode_cli() {
		return code_cli;
	}
	public void setCode_cli(int code_cli) {
		this.code_cli = code_cli;
	}
	public String getMode_payement() {
		return mode_payement;
	}
	public void setMode_payement(String mode_payement) {
		this.mode_payement = mode_payement;
	}
	public double getTotal_ttc() {
		return total_ttc;
	}
	public void setTotal_ttc(double total_ttc) {
		this.total_ttc = total_ttc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getCode_article() {
		return code_article;
	}
	public void setCode_article(int code_article) {
		this.code_article = code_article;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	
}
