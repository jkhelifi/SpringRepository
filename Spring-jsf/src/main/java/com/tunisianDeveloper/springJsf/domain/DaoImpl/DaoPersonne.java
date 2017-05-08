package com.tunisianDeveloper.springJsf.domain.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tunisianDeveloper.springJsf.domain.IDao.IDaoPersonne;
import com.tunisianDeveloper.springJsf.domain.entities.Personne;

@Repository
public class DaoPersonne implements IDaoPersonne {

	@PersistenceContext
	EntityManager entity;
	
	
	
	@Override
	public Boolean createPersonne(Personne personne) {
				
		
			entity.persist(personne);
			return true;
				
				
	}

	@Override
	public Boolean updatePersonne(Personne personne) {
		
			entity.merge(personne);
			return true;
		
	}

	@Override
	public Boolean deletePersonne(Personne personne) {
		
			
			entity.remove(entity.merge(personne));
			return true;
		
	}

	@Override
	public Personne getPersonneById(Integer id) {
		return entity.find(Personne.class, id);
	}

	@Override
	public List<Personne> getListPersonne() {
		Query query=entity.createQuery("select a from Personne a");
		//query.setParameter("a", true);
		return query.getResultList();
	}

}
