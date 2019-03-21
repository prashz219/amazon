package com.amazon.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.amazon.base.Page;
import com.amazon.pages.actions.HomePageActions;

public class NavigateToSignInPageTest extends Page {

	@Test(enabled=true)
	public void navigateToSignInPageTest() {
		//Test to navigate to sign in page
		HomePageActions home = new HomePageActions();
		home.gotoSigninPage();
		String expectedTitle = "Amazon Sign In";
		assertEquals(driver.getTitle(), expectedTitle);
		

	}

}
