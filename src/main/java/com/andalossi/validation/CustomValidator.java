package com.andalossi.validation;

import org.springframework.stereotype.Service;

@Service
public class CustomValidator {
	
	public boolean checknamevalidate(String name) {
		if (name.length()>2) {
			return true;
		}else {
			return false;
		}
	}

}
