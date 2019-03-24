package com.wrapper.file;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.setup.file.Config;


public class SeleniumWrapper implements Config{
	public static WebDriver driver;

    @Before
    public void setUp() {
    	System.out.println("I am in selenium wrapper");
        if (browser.equals("FF")) {
            driver = new FirefoxDriver();
        } else {
            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/chromedriver.exe");
                driver = new ChromeDriver();                            
            }
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();  
    }
    
   
    
    @After
    public void closeBrowser()
    {
    	driver.quit();
    }

}
