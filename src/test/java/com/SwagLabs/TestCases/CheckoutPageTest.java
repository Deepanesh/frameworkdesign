package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.Basetest.BaseTest;

public class CheckoutPageTest extends BaseTest {

	@BeforeClass
	public void pageSetup() {
		ip = lp.doLogin(prop.getData("un"), prop.getData("pwd"));
		addWait();
		ip.addProductToCart(prop.getData("pname1"));
		addWait();
		ip.openCartPage();
		addWait();
		cp.clickCheckout();
	}

	@Test
	public void validateCheckout() {

		ch.doContinue(prop.getData("fn"), prop.getData("ln"), prop.getData("zc"));

	}
}
