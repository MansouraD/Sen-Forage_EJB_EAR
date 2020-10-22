package com.beans;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Village
 *
 */
@Entity

public class Village implements Serializable {

	private static final long serialVersionUID = 1L;  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom_village;

	public Village() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom_village() {
		return this.nom_village;
	}

	public void setNom_village(String nom_village) {
		this.nom_village = nom_village;
	}
   
}
