package com.coreFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.setup.file.Config;
import com.wrapper.file.SeleniumWrapper;

public class BasePage extends SeleniumWrapper implements Config {

	public static void launchURL(String url) {
		driver.get(url);
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void quitBrowser(String string) {
		driver.close();
	}

	// This functions will return me webelement and it is accepting BY locator
	public static WebElement find(By by) {
		WebElement webElement = null;
		webElement = driver.findElement(by);
		return webElement;
	}

	public static void click(By by) {
		find(by).click();
	}

	public static void waitFortime(int time) throws InterruptedException {
		Thread.sleep(time * 1000);
	}

	public static String getText(By by) {

		System.out.println("Text is -->" + find(by).getText());
		return find(by).getText();
	}

	public static void setText(By by, String text) {
		find(by).sendKeys(new String(text));
	}

	// public static void verify(String actual, String expected) throws
	// IOException
	// {
	//
	// Assert.assertEquals(actual,expected);
	//
	// }
	// public static void verify(boolean actual, boolean expected) throws
	// IOException
	// {
	//
	// Assert.assertEquals(actual,expected);
	//
	// }

	public static boolean isDisplayed(By by) {
		return find(by).isDisplayed();
	}

	public static String getUrl() {
		return driver.getCurrentUrl().toString();
	}
	
	public static String getTitle()
	{
		return driver.getTitle();
	}

	public void clearTheText(By by) {
		find(by).clear();
	}
}
