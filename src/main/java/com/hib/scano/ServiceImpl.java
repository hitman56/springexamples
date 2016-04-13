package com.hib.scano;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceImpl {

	
	
	private UserDao userdao;

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	
	
	 @Transactional
	    public void addPerson(User u) {
	        this.userdao.save(u);
	    }
	 
   
}
