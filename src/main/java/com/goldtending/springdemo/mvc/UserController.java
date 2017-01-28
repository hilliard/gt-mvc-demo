package com.goldtending.springdemo.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/user")
public class UserController {
	
	// configure using countries.properties file
    //	@Value("{#countryOptions}")
	// private Map<String,String> countryOptions;

	// method for showing form \
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a new user object
		User theUser = new User();
		// add user object to model attribute
		theModel.addAttribute("user", theUser);
		// add the country options to the model
		// theModel.addAttribute("theCountryOptions", countryOptions);
		
		return "user-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("user") User theUser) {
		
		// log the input data
		System.out.println("theUser: " + theUser.getFirstName()
							+ " " + theUser.getLastName());
		
		return "user-confirmation";
		
	}
	
	
}
