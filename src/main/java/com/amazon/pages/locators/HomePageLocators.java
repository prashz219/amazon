package com.amazon.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(css = "#nav-link-yourAccount [class='nav-line-2']")
	public WebElement HomePageHelloSignin;
	
	@FindBy(css = "#nav-flyout-ya-signin .nav-action-inner")
	public WebElement HomePageSignin;	
	

}
