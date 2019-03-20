package com.amazon.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.amazon.base.Page;
import com.amazon.pages.locators.HomePageLocators;

public class HomePageActions extends Page {

	public HomePageLocators home;

	public HomePageActions() {

		this.home = new HomePageLocators();
		PageFactory.initElements(driver, this.home);

	}

	public HomePageActions gotoSigninPage() {

		click(home.HomePageHelloSignin);
		return this;
	}
	
	public HomePageActions mouseHoverandSignIn() {

		mouseHover(home.HelloSignIn);
		click(home.SignIn);
		return this;
	}

}
