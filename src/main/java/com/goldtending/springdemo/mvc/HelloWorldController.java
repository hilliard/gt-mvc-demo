package com.goldtending.springdemo.mvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/hello")
public class HelloWorldController {

        // need a controller method to show the initial form

        @RequestMapping("/showForm")
        public String showForm() {
                return "helloworld-form";
        }

        // need a controller method to process the form
         @RequestMapping("/processForm")
         public String processForm() {
                return "helloworld";
         }

        // need a new controller to read form data
        // add data to the model
        @RequestMapping("/processFormVersionTwo")
        public String letsShoutDude(HttpServletRequest request, Model model) {
        	
        	// read the request parameter from the HTML form
        	String firstName = request.getParameter("firstName");
        	String lastName = request.getParameter("lastName");
        	String address = request.getParameter("address");
        	String email = request.getParameter("email");
               	
        	// convert to all caps
        	firstName = firstName.toUpperCase();
        	
        	// create the message 
            String result = "Yo! " + firstName + " " + lastName + " " + address + " " + email; 
            		
            // add message to model
            model.addAttribute("message", result);
        	
        	// the view page
            return "helloworld";
        }
        
        // need a new controller to read form data
        // add data to the model
        @RequestMapping("/processFormVersionThree")
        public String processFormVersionThree(
        		// @RequestParam("firstName") String firstName, Model model) {
        		@RequestParam Map<String, String> requestParams, Model model) {
        	        String firstName = requestParams.get("firstName");
        	        String lastName = requestParams.get("lastName");
        	        String address = requestParams.get("address");
        	        String email = requestParams.get("email");
        	        
        	// read the request parameter from the HTML form
        	// @Request does this for us.
        	// String firstName = request.getParameter("firstName");
        	// need to figure out how to add these
        	// String lastName = request.getParameter("lastName");
        	// String address = request.getParameter("address");
        	// String email = request.getParameter("email");
        			
        	
        	// convert to all caps
        	firstName = firstName.toUpperCase();
        	
        	// create the message 
            String result = "Hey " + firstName + " " + lastName + " From " + address + " Who's Email is: " + email; 
            		
            // add message to model
            model.addAttribute("message", result);
        	
        	// the view page
            return "helloworld";
        }


}