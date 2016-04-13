package com.shiva.cval;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class CustomValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		User user=(User)target;
		if(user.getName().length()==0)
			errors.rejectValue("name", "user.name", "Username not empty");
			//errors.rejectValue("name", "User.name");
	}

	
}
