Feature: Login functionality

Background: Succesfully canceled Initial Login Page
When user open "Chrome" browser with exe as
When user enter url as
When user cancle initial Login window

@SmokeTest 		
Scenario: Login functionality with valid credentials
When user navigate on Login button
When user click on MyProfile 
When user enter "8668365485" as username
When user enter "9960610875" as password
When user click on login button
Then Application shows user profile to user