package com.tunisianDeveloper.springJsf.beansJsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

import com.tunisianDeveloper.springJsf.domain.entities.Personne;
import com.tunisianDeveloper.springJsf.services.IService.IPersonneService;

@ManagedBean
@SessionScoped
public class UserBean {

	@ManagedProperty("#{usermanager}")
	IPersonneService iPersonneService;
	
	List<Personne> personnes=new ArrayList<Personne>();
	Boolean form=false ;
	Personne personne=new Personne();
	Personne per=new Personne();
	Integer id;
	public UserBean() {
	}
	
	@PostConstruct
	public void showAllUsers()
	{
		personnes=iPersonneService.getAllUser();
		
	}
	public void add()
	{
		
		iPersonneService.addUser(personne);
		showAllUsers();
		personne=new Personne();
		
	}
	
	public void delete(Personne personne)
	{
		iPersonneService.deleteUser(personne);
		showAllUsers();
	}
	
	public void update(){
		
		
		//System.out.println(per.getId());
		iPersonneService.updateUser(per);
		showAllUsers();
		//per=new Personne();
		
	}

	public IPersonneService getiPersonneService() {
		return iPersonneService;
	}

	public void setiPersonneService(IPersonneService iPersonneService) {
		this.iPersonneService = iPersonneService;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Boolean getForm() {
		return form;
	}

	public void setForm(Boolean form) {
		this.form = form;
	}

	public Personne getPer() {
		return per;
	}

	public void setPer(Personne per) {
		this.per = per;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
	
	
	
	
	
}
