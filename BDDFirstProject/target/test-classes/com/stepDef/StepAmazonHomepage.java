package com.stepDef;

import static org.junit.Assert.*;

import com.setup.file.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.coreFramework.BasePage;
import com.coreFramework.Verify;
import com.pom.java.PomAmazon;
import com.pom.java.PomCommon;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepAmazonHomepage {

	PomAmazon pomA=new PomAmazon();
	PomCommon pomC = new PomCommon();
	
	@Given("^I am in home page of amazon$")
	public void I_am_in_home_page_of_amazon() throws IOException
	{
		pomA.LaunchSite();
	}
	
	@When("^user verify url \"([^\"]*)\"$")
	public void user_verify_url(String arg1) throws Throwable {
	    System.out.println(arg1);
	    Verify.verify(arg1,pomA.checkUrl());
	}
	
	@Then("^user wait for (\\d+) seconds$")
	public void user_waits_for_time(int time) throws InterruptedException
	{
		pomC.waitSomeTime(time);
	}
	
	@When("^user verify url '(.*?)'$")
	public void user_verify_url_exampple(String arg1) throws Throwable {
	    System.out.println(arg1);
	    Verify.verify(pomA.checkUrl(),arg1);
	}
	
	@And("^user search the items$")
	public void user_search_the_items(List<String> item)
	{
		for(String str : item)
		{
			pomA.searchItem(str);			
		}
		
	}
	
	@Given("^user verify enter \"([^\"]*)\" username$")
	public void user_verify_enter_username(String userName) {
	    
	    Verify.verify(pomA.setuserName(userName),true);
	}

	@Given("^user verify enter \"([^\"]*)\" password$")
	public void user_verify_enter_password(String userPassword) {
	    
		Verify.verify(pomA.setPassword(userPassword),true);
	}

	@Given("^user clicks on submit$")
	public void user_clicks_on_submit() throws Throwable {
		Verify.verify(pomA.submitButton(),true);
	}
	
	@And("^user enter user credentils$")
	public void user_enter_user_credentils(DataTable table) throws InterruptedException
	{
		List<Map<String, String>> userDetails = table.asMaps(String.class,String.class);
		for(Map<String, String> details:userDetails)
		{
			Verify.verify(pomA.enterDetails(details),true);
		}
		
	}
}
