package com.crm.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends Testbase {

	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 0)
	public void loginPageTitleTest() {
		String expected = "Free CRM software in the cloud powers sales and customer service";
		Assert.assertEquals(driver.getTitle(), expected);
	}

	@Test(priority = 1)
	public void loginPageLogoTest() {
		boolean isCRMLogoPresent = loginPage.validateCRMLogo();
		Assert.assertTrue(isCRMLogoPresent);
	}

	@Test(priority = 2)
	public void checkLoginTest() {
		loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
