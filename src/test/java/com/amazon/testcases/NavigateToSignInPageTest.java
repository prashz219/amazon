package com.amazon.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amazon.base.Page;
import com.amazon.pages.actions.HomePageActions;
import com.amazon.utilities.Utilities;
import com.relevantcodes.extentreports.LogStatus;

public class NavigateToSignInPageTest extends Page {

	@Test(enabled=true)
	public void navigateToSignInPageTest() {
		//Test to navigate to sign in page
		HomePageActions home = new HomePageActions();
		home.gotoSigninPage();
		String expectedTitle = "Amazon Sign In";
		assertEquals(driver.getTitle(), expectedTitle);
		
		try {
			Utilities.captureScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		test.log(LogStatus.INFO, test.addScreenCapture(Utilities.screenshotName));

	}

}
