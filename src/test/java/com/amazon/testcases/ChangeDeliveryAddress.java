package com.amazon.testcases;

import org.testng.annotations.Test;

import com.amazon.base.Page;
import com.amazon.pages.actions.HomePageActions;

public class ChangeDeliveryAddress extends Page {
	
	@Test
	public void changeDeliverTo() {
		
		HomePageActions home = new HomePageActions();
		home.changeDeliverTo();
	}

}
