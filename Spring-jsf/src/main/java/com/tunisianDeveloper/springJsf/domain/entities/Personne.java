package com.tunisianDeveloper.springJsf.domain.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Personne
 *
 */
@Entity
@Table(name="t_personne")

public class Personne implements Serializable {

	
	private Integer id;
	private String nom;
	private String prenom;
	private static final long serialVersionUID = 1L;

	public Personne() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
   
}
