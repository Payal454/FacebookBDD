Feature: Facebook Login Feature

#Test DATA TABLE 
 
Scenario: Facebook login test scenario
Given user is already on Login Page
When title of login page is Facebook - log in or sign up
Then user enters username and password
| payalpatel | test@456 |

Then user clicks on login button
Then close the browser
 