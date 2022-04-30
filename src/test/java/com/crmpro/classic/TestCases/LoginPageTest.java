package com.crmpro.classic.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crmpro.classic.TestPage.LoginPage;
import com.crmpro.classic.TestUtils.TestUtils;

public class LoginPageTest extends LoginPage {

	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test
	public void verifyLogin() {
		try {
			TestUtils.startTcLogger("verifyLogin");
			loginPage.login(username, password);
			if (driver.getTitle().equalsIgnoreCase("CRMPRO1")) {
				Assert.assertTrue(true);
				logger.info("-----verifyLogin Passed-----");

			} else {
				Assert.assertTrue(false);
				logger.info("-----verifyLogin Failed-----");
			}
			TestUtils.endTcLogger("verifyLogin");
		} catch (Exception e) {
			try {
				TestUtils.captureScreen("verifyLogin");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
