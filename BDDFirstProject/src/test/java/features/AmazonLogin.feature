Feature: Amazon Login

@Login
Scenario: Verify multiple login
Given I am in home page of amazon
And user wait for 10 seconds
And user verify enter "sagar@gmail.com" username
And user verify enter "123456" password
And user wait for 10 seconds
And user clicks on submit
And user enter user credentils
|userName		|passWord|Error|
| 				|        |Enter your email or mobile phone number|
|saurabh@gmail.com|      |Enter your password |
|sandhya@gmail.com|sagar1234|We cannot find an account with that email address |