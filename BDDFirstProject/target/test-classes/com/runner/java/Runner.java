package com.runner.java;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/java/features/"},strict = true
        ,glue={"com.wrapper.file","com.stepDef"},
        format = { "pretty","html:target/site/cucumber-pretty","html:target/cucumber-report","json:target/cucumber.json" },
        tags={"@Login"}

        
)

public class Runner {
		
	@AfterClass 
	public static void clearGarbage()
	{
		System.gc();		
	}
	
}
