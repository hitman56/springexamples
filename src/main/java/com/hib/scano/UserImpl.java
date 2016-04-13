package com.hib.scano;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate3.HibernateTransactionManager;

@Repository
public class UserImpl  implements UserDao {

	
	 private SessionFactory sessionFactory;
     
	    public void setSessionFactory(SessionFactory sf){
	        this.sessionFactory = sf;
	    }
	
	
	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        session.persist(u);
		
	}

}
