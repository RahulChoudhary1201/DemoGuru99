package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.BaseClass;
import com.pageObjects.LoginPage;

public class TC_LoginTest_01 extends BaseClass {

	@Test
	public void loginTest() {
		driver.get(baseUrl);

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userId);
		lp.setPassword(pass);
		lp.clickSubmit();

		if (driver.getTitle().equals(" Guru99 Bank Home Page ")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
