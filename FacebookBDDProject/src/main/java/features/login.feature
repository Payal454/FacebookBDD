Feature: Facebook Login Feature

#without examples keyword
#Scenario: Facebook login test scenario
#Given user is already on Login Page
#When title of login page is Facebook - log in or sign up
#Then user enters "payal123" and "12345"
#Then user clicks on login button



#with examples keyword
Scenario Outline: Facebook login test scenario
Given user is already on Login Page
When title of login page is Facebook - log in or sign up
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user quit

Examples:

		| username  | password |
		| payal123  | test@123 |
		| automation| testtest | 
 
 
 
 
 
