package com.andalossi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.andalossi.services.LoginService;

@Controller
@SessionAttributes(names = "name") // stock name qui sera disponible partout
public class LoginController {
	// des millions internautes on ne peut pas fabriquer chaque fois un objet
	// solution annotation autowired  (liaison entre 2 class)
	//LoginService loginService = new LoginService();
	@Autowired
	LoginService loginService ;
	
	@RequestMapping(value ="/login" , method = RequestMethod.GET )
	public String loginPage() {
		
		return "login";
	}
	@RequestMapping(value ="/login" , method = RequestMethod.POST  )
	public String getInfo(@RequestParam String name ,
			              @RequestParam String password,
			               ModelMap model) {
		//System.out.println(name);
	if (!loginService.checkValidate(name, password)) {
		model.put("msgError", "name invalid or pass invalid");
		return "login";
		
	} else {
		model.put("name" , name); // model prend name et le passe a jsp page home uniquement
		model.put("password" , password);
		return "home";
	}	
		
	}

}
