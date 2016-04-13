package om.hib.hiber3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hib.scano.ServiceImpl;
import com.hib.scano.User;
import com.hib.scano.UserImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	private ServiceImpl serviceimpl;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		User u=new User();
		u.setName("anand");
		u.setEmail("anand.trevedi@gmail.com");
		u.setPassword("baroda");
		this.serviceimpl.addPerson(u);
		
		return "home";
	}

	
	public ServiceImpl getServiceimpl() {
		return serviceimpl;
	}

	@Autowired(required=true)
	@Qualifier(value="serviceimpl")
	public void setServiceimpl(ServiceImpl serviceimpl) {
		this.serviceimpl = serviceimpl;
	}
	
	
	
}
