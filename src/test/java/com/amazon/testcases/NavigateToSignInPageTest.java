package com.amazon.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.amazon.base.Page;
import com.amazon.pages.actions.HomePageActions;

public class NavigateToSignInPageTest extends Page {

	@Test
	public void navigateToSignInPageTest() {

		HomePageActions home = new HomePageActions();
		home.mouseHoverandSignIn();
		String expectedTitle = "Amazon Sign In";
		assertEquals(driver.getTitle(), expectedTitle);

	}

}
