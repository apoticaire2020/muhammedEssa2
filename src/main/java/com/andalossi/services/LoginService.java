package com.andalossi.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean checkValidate(String n , String p) {
		if(n.equals("ahmed") && p.equals("123"))
		{
			return true;
		}
		else {
			return false;
		}
	}

}
