Feature: Logging in to the application and Sharing your information to stakeholders

In order to share
As a Admin of app
I want to Login and Share my message

Scenario: Logining Web

Given I go to "loginL" on "Mozilla"
And I enter "userName" as "usernameText"
And I enter "passWord" as "passwordText"
And Click on "loginButton"
Then I logged in "Successfully"



