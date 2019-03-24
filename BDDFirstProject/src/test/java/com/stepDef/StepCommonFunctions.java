package com.stepDef;

import static org.junit.Assert.*;

import org.junit.Test;

import com.coreFramework.Verify;
import com.pom.java.PomCommon;

import cucumber.api.java.en.Given;

public class StepCommonFunctions {

	PomCommon pomC = new PomCommon();
	@Given("^user verify below message \"([^\"]*)\"$")
	public void user_verify_below_message(String message)
	{
		Verify.verify(pomC.verifyMessage(message),message);
	}
}
