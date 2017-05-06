package com.tunisianDeveloper.springJsf.domain.IDao;

import java.util.List;

import com.tunisianDeveloper.springJsf.domain.entities.Personne;

public interface IDaoPersonne {

	
	Boolean createPersonne(Personne personne);
	Boolean updatePersonne(Personne personne);
	Boolean deletePersonne(Personne personne);
	Personne getPersonneById(Integer id);
	List<Personne> getListPersonne();
	
}
