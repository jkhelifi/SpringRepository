package com.tunisianDeveloper.springJsf.services.IService;

import java.util.List;

import com.tunisianDeveloper.springJsf.domain.entities.Personne;

public interface IPersonneService {
	
	
	Boolean addUser(Personne user);
	Boolean updateUser(Personne user);
	Boolean deleteUser(Personne  user);
	Personne getUserById(Integer id);
	List<Personne> getAllUser();
}
