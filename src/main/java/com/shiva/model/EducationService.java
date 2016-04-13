package com.shiva.model;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EducationService {

	private EducationDao edudao;

	public EducationDao getEdudao() {
		return edudao;
	}

	public void setEdudao(EducationDao edudao) {
		this.edudao = edudao;
	}
	
	@Transactional
	public void save(Education edu)
	{
		edudao.save(edu);
	}
	
	@Transactional
	public List<Education> getEducation()
	{
		
	 List<Education> education=	edudao.getEducation();
	 return education;
	}
	
	
}
