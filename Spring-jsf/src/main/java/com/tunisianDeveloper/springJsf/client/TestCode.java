package com.tunisianDeveloper.springJsf.client;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tunisianDeveloper.springJsf.domain.entities.Personne;
import com.tunisianDeveloper.springJsf.services.IService.IPersonneService;

public class TestCode {

	
	@Test
	public void test_createUser() {
		ApplicationContext ctx= new 
				ClassPathXmlApplicationContext("ApplicationContext.xml");
		IPersonneService ipers=(IPersonneService) ctx.getBean("usermanager");
		
		Personne personne=new Personne();
		personne.setNom("foulen");
		personne.setPrenom("ben foulen");
		
		ipers.addUser(personne);
	}
}
