package com.shivasol.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shiva.model.Education;
import com.shiva.model.EducationService;
import com.shiva.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private EducationService eduservice;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("user",new User());
        Map<String,String> map=new HashMap();
		
	
		model.addAttribute("eduname",eduservice.getEducation());
		
		return "home";
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("user")User user) {
		
		System.out.println(user.getName()+":"+user.getEmail()+":"+user.getAddress()+":"+user.getEducation_form().length);
		
		return "created";
	}
	
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create( Model model) {
	
		
		Education edu=new Education();
		edu.setName("btech");
		eduservice.save(edu);
		return "created";
	}


	public EducationService getEduservice() {
		return eduservice;
	}


	@Autowired(required=true)
	@Qualifier(value="eduservice")
	public void setEduservice(EducationService eduservice) {
		this.eduservice = eduservice;
	}
	
	
}
