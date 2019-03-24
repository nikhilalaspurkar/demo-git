Feature: FirstFeature 

@FirstTest
Scenario: Verify Amazon logo
Given I am in home page of amazon

@SecondTest
Scenario: Verify url
Given I am in home page of amazon
And user verify url "http://www.amazon.in/"
And user verify url "http://www.amazon.com/"
And user wait for 10 seconds
