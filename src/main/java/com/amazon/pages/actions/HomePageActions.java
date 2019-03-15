package com.amazon.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.amazon.base.Page;
import com.amazon.pages.locators.HomePageLocators;

public class HomePageActions extends Page {
	
	public HomePageLocators home;
	
	public HomePageActions(){
		
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.home);
		
	}
	
	
	public HomePageActions gotoSigninPage() {
		
		//driver.findElement(By.cssSelector("#nav-link-yourAccount [class='nav-line-2']")).click();
		
		
		click(home.HomePageHelloSignin);
		//click(home.HomePageSignin);
		
		return this;
				
	}

}
