package com.amazon.testcases;

import org.testng.annotations.Test;

import com.amazon.base.Page;
import com.amazon.pages.actions.HomePageActions;


public class SignInTest extends Page{
	
	@Test	
	public void signInTest () {
		
		HomePageActions home = new HomePageActions();
		home.gotoSigninPage();
		
		
	}
	

}
