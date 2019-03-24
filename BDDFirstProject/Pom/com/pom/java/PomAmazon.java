package com.pom.java;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;

import com.coreFramework.BasePage;
import com.coreFramework.Verify;
import com.setup.file.Config;

public class PomAmazon extends BasePage{

	By searchItemby = By.xpath("//span[text()='All']/parent::div/parent::div/parent::div/following-sibling::div[2]//input");
	By userNameby =By.xpath("//label[contains(text(),'Email or mobile phone number')]/following-sibling::input");
	By userPasswordby =By.xpath("//span[contains(text(),'Login')]/parent::span/parent::span/parent::div/preceding-sibling::div[1]/input");
	By loginButtonby = By.xpath("//input[@id='signInSubmit']");
	By verifyErrorWithblank=By.xpath("//*[contains(text(),'Enter your email or mobile phone number')]");
	By verifyErrorWithwrongDetails=By.xpath("//*[contains(text(),'We cannot find an account with that email address')]");
	By verifyErrorWithblankPassword=By.xpath("//*[contains(text(),'Enter your password')]");
	
	public void LaunchSite()
	{
		launchURL(url);
//		return url;
	}
	
	public String checkUrl()
	{
		return getUrl().toString();
	}

	public void searchItem(String item)
	{
		setText(searchItemby,item);
		clearTheText(searchItemby);
	}
	
	public boolean setuserName(String userName)
	{
		boolean flag=false; 
		if(isDisplayed(userNameby))
		{
			setText(userNameby,userName);
			flag = true;
		}
		return flag;
	}
	
	public boolean setPassword(String userName)
	{
		boolean flag=false; 
		if(isDisplayed(userPasswordby))
		{
			setText(userPasswordby,userName);
			flag = true;
		}
		return flag;
	}
	
	public boolean submitButton()
	{
		boolean flag=false; 
		if(isDisplayed(userPasswordby))
		{
			click(loginButtonby);
			flag = true;
		}
		return flag;
	}

	public boolean enterDetails(Map<String, String> details) throws InterruptedException {
		
		boolean flag=false;
		
		if(isDisplayed(userNameby) && isDisplayed(userPasswordby))
		{
			setText(userNameby,details.get("userName"));
			setText(userPasswordby,details.get("passWord"));
			waitFortime(5);
			submitButton();
			waitFortime(15);
			if(details.get("Error").equalsIgnoreCase("Enter your email or mobile phone number"))
			{
				verifyerrorMessage(verifyErrorWithwrongDetails,details.get("Error"));
			}else
				if(details.get("Error").equalsIgnoreCase("Enter your password"))
				{
					verifyerrorMessage(verifyErrorWithblank,details.get("Error"));
				}else
				{
					verifyerrorMessage(verifyErrorWithblankPassword,details.get("Error"));
				}
			clearTheText(userNameby);
			clearTheText(userPasswordby);
			waitFortime(10);
			flag = true;
		}
		
		return flag;
	}
	
	public void verifyerrorMessage(By by, String eMessage)
	{
		Verify.verify(getText(by),eMessage);
	}
	
}
