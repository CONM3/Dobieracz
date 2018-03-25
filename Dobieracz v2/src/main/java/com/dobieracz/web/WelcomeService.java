package com.dobieracz.web;

import org.springframework.stereotype.Component;

/**
 * 
 *
 * @since Mar 25, 2018, 4:51:59 PM
 * @author Grzegorz Brodowski
 */
@Component
public class WelcomeService {

	public String retrieveWelcomeMessage() {
		//Complex Method
		return "Good Morning updated";
	}
}