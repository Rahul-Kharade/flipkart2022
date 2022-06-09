Feature: ManageAdresses

Background: Succesfully canceled Initial Login Page
When user open "Chrome" browser with exe as
When user enter url as
When user cancle initial Login window
When user navigate on Login button
When user click on MyProfile 
When user enter "8668365485" as username
When user enter "9960610875" as password
When user click on login button 

@RegressionTest
 Scenario: Validate ManageAdresses Functionality
When user click on ManageAdress
When user click on add new adress
When user enter "RAHUL" as a name	
When user enter "8668365485" as a mobile number
When user enter "413739" as a pincode
When user enter "SHRIRAMPUR" as a locality
When user enter "BHOKAR newasa road tal shrirampur" as a Adress
When user click on home as a adress type
When user  click on save button 
Then adress added sucessfully