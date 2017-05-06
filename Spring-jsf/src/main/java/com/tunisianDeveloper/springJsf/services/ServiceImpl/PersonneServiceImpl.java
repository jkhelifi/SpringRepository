package com.tunisianDeveloper.springJsf.services.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunisianDeveloper.springJsf.domain.IDao.IDaoPersonne;
import com.tunisianDeveloper.springJsf.domain.entities.Personne;
import com.tunisianDeveloper.springJsf.services.IService.IPersonneService;


@Service("usermanager")
public class PersonneServiceImpl implements IPersonneService {

	
	@Autowired
	IDaoPersonne iDaouser;
	
	@Override
	public Boolean addUser(Personne user) {
		
		return iDaouser.createPersonne(user);
	}

	@Override
	public Boolean updateUser(Personne user) {
		
		return iDaouser.updatePersonne(user);
	}

	@Override
	public Boolean deleteUser(Personne user) {
		
		return iDaouser.deletePersonne(user) ;
	}

	@Override
	public Personne getUserById(Integer id) {
		
		return iDaouser.getPersonneById(id);
	}

	@Override
	public List<Personne> getAllUser() {
		
		return iDaouser.getListPersonne();
	}

}
