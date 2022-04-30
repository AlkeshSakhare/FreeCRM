package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class LoginPage extends Testbase {

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(.,'Sign Up')]")
	WebElement signUpBtn;

	@FindBy(xpath = "//img[@alt='free crm logo']")
	WebElement crmLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void signUpLink() {
		signUpBtn.click();
	}

	public boolean validateCRMLogo() {
		return crmLogo.isDisplayed();
	}

	public HomePage login(String un, String pwd) {
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
}
