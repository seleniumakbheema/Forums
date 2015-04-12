Feature: Logging in to the application and Sharing your information to stakeholders

In order to share
As a Admin of app
I want to Login and Share my message


Scenario: Sharing the meesage from Web
Given Click on "SHARE" from my "post"
And "share_url" will be created to share
And Share "url" to end user
And Enter "credentials"  with his "details"
And click on "send" button
Then End user can see the message successfully using "url" on his "Mozilla"