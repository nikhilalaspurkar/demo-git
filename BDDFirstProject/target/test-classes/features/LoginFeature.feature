Feature: Login Feature

@Test
Scenario: Login Amazon
Given I am in home page of amazon
Then user wait for 5 seconds
#And user verify below message
#"Sign in for your best experience"
And user search the items
 |item|
 |item1|
 |item2|