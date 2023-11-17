package com.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public String baseUrl = "https://demo.guru99.com/v3/index.php";
	public String userId = "mngr535397";
	public String pass = "peheruz";
	public static WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
