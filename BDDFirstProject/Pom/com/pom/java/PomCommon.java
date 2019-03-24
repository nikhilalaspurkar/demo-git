package com.pom.java;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

import com.coreFramework.BasePage;

public class PomCommon extends BasePage{

	public void waitSomeTime(int time) throws InterruptedException
	{
		waitFortime(time);
	}
	
	public String verifyMessage(String message)
	{
		return driver.findElement(By.xpath("//*[text()='"+message+"']")).getText();
	}
}
