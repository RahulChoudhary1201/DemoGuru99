package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// User ID : mngr535397
	// Password : peheruz

	@FindBy(name = "uid")
	@CacheLookup
	WebElement inputUserId;

	@FindBy(name = "password")
	@CacheLookup
	WebElement inputPass;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement loginBtn;

	public void setUserName(String userName) {
		inputUserId.sendKeys(userName);
	}

	public void setPassword(String password) {
		inputPass.sendKeys(password);
	}

	public void clickSubmit() {
		loginBtn.click();
	}

}
