package com.shiva.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;


@Repository
public class EducationDao {

	

	 private SessionFactory sessionFactory;
    
	    public void setSessionFactory(SessionFactory sf){
	        this.sessionFactory = sf;
	    }
	
	    
	    public void save(Education edu) {
			// TODO Auto-generated method stub
			Session session = this.sessionFactory.getCurrentSession();
	        session.persist(edu);
			
		}
	    
	    
	    public List<Education> getEducation()
	    {
	    	Session session = this.sessionFactory.getCurrentSession();
	        Criteria criteria=session.createCriteria(Education.class);
	       List<Education> education=(List<Education>) criteria.list();
	        return education;
	    	
	    }
	    
	    
	  
}
