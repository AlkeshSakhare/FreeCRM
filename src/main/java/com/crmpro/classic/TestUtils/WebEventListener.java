package com.crmpro.classic.TestUtils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crmpro.classic.TestBase.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener {
	public void beforeNavigateTo(String url, WebDriver driver) {
		logger.info("Before navigating to: '" + url + "'");
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		logger.info("Navigated to:'" + url + "'");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		logger.info("Value of the:" + element.toString() + " before any changes made");
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		logger.info("Element value changed to: " + element.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		logger.info("Trying to click on: " + element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		logger.info("Clicked on: " + element.toString());
	}

	public void beforeNavigateBack(WebDriver driver) {
		logger.info("Navigating back to previous page");
	}

	public void afterNavigateBack(WebDriver driver) {
		logger.info("Navigated back to previous page");
	}

	public void beforeNavigateForward(WebDriver driver) {
		logger.info("Navigating forward to next page");
	}

	public void afterNavigateForward(WebDriver driver) {
		logger.info("Navigated forward to next page");
	}

	public void onException(Throwable error, WebDriver driver) {
		logger.info("Exception occured: " + error);
		try {
			TestUtils.takeScreenshotAtEndOfTest();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		logger.info("Trying to find Element By : " + by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		logger.info("Found Element By : " + by.toString());
	}

	/*
	 * non overridden methods of WebListener class
	 */
	public void beforeScript(String script, WebDriver driver) {
	}

	public void afterScript(String script, WebDriver driver) {
	}

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		logger.info("Alert shown : " + driver.switchTo().alert().getText());
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		logger.info("Alert accepted : " + driver.switchTo().alert().getText());
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		logger.info("Alert dismissed : " + driver.switchTo().alert().getText());
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

}
