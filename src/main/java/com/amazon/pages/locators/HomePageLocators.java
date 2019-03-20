package com.amazon.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;



public class HomePageLocators {
		
	//locators of HomePage
	@FindAll({
		@FindBy(css="#nav-link-yourAccount [class='nav-line-2']"),
		@FindBy(xpath="//*[contains(text(),'Hello, Sign in')]")
	})
	public WebElement HomePageHelloSignin;
	
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	public WebElement HelloSignIn;
	
	@FindBy(css="#nav-flyout-ya-signin .nav-action-inner")
	public WebElement SignIn;
	
}
