package com.myspace.uha40;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class verdict implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer montant_amende;
	private java.lang.Integer nb_retrait_point;
	private java.lang.Boolean retrait_permis;

	private java.lang.String nom;

	private java.lang.String prenom;

	public verdict() {
	}

	public java.lang.Integer getMontant_amende() {
		return this.montant_amende;
	}

	public void setMontant_amende(java.lang.Integer montant_amende) {
		this.montant_amende = montant_amende;
	}

	public java.lang.Integer getNb_retrait_point() {
		return this.nb_retrait_point;
	}

	public void setNb_retrait_point(java.lang.Integer nb_retrait_point) {
		this.nb_retrait_point = nb_retrait_point;
	}

	public java.lang.Boolean getRetrait_permis() {
		return this.retrait_permis;
	}

	public void setRetrait_permis(java.lang.Boolean retrait_permis) {
		this.retrait_permis = retrait_permis;
	}

	public java.lang.String getNom() {
		return this.nom;
	}

	public void setNom(java.lang.String nom) {
		this.nom = nom;
	}

	public java.lang.String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(java.lang.String prenom) {
		this.prenom = prenom;
	}

	public verdict(java.lang.Integer montant_amende,
			java.lang.Integer nb_retrait_point,
			java.lang.Boolean retrait_permis, java.lang.String nom,
			java.lang.String prenom) {
		this.montant_amende = montant_amende;
		this.nb_retrait_point = nb_retrait_point;
		this.retrait_permis = retrait_permis;
		this.nom = nom;
		this.prenom = prenom;
	}

}