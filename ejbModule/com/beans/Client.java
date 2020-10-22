package com.beans;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom_de_famille;
	private String adresse;
	private int village;
	

	public Client() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom_de_famille() {
		return this.nom_de_famille;
	}

	public void setNom_de_famille(String nom_de_famille) {
		this.nom_de_famille = nom_de_famille;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public int getVillage() {
		return this.village;
	}

	public void setVillage(int village) {
		this.village = village;
	}
   
}
