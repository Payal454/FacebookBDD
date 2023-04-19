Feature: Fcaebook_login 

@SmokeTest
Scenario: Login with correct username ans password 
Given: This is a valid login test

@RegressionTest
Scenario: Login with incorrect username ans password 
Given: This is a invalid login test

@SmokeTest
Scenario: Test Title of login page
Given: title of login page is Facebook

@SmokeTest @End2End
Scenario: Verify right panel link
Given: clicking on right panel link

@RegressionTest
Scenario: create forgot password
Given This is forgot password test case

@SmokeTest @RegressionTest
Scenario: Create new account
Given: This is new account test case