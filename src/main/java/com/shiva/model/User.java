package com.shiva.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String email;
	private String address;
	@OneToMany
	@JoinTable
	private Collection<Education> education=new ArrayList<Education>();
	
	@Transient
	private
	String[] education_form;
	

	public Collection<Education> getEducation() {
		return education;
	}

	public void setEducation(Collection<Education> education) {
		this.education = education;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getEducation_form() {
		return education_form;
	}

	public void setEducation_form(String[] education_form) {
		this.education_form = education_form;
	}
	
	
}
