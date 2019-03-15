package com.amazon.pages.actions;

import com.amazon.base.Page;
import com.amazon.pages.locators.HomePageLocators;

public class HomePageActions extends Page {
	
	public HomePageLocators home;
	
	public HomePageActions gotoSigninPage() {
		
		click(home.HomePageHelloSignin);
		click(home.HomePageSignin);
		
		return this;
				
	}

}
