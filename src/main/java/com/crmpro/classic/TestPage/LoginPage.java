package com.crmpro.classic.TestPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.classic.TestBase.TestBase;
import com.crmpro.classic.TestUtils.TestUtils;

public class LoginPage extends TestBase {

	@FindBy(name = "username")
	WebElement usernameTxt;
	@FindBy(name = "password")
	WebElement passwordTxt;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String un, String pw) {
		TestUtils.sendKeysClear(usernameTxt, un);
		TestUtils.sendKeysClear(passwordTxt, pw);
		TestUtils.click(loginBtn);
	}

}
