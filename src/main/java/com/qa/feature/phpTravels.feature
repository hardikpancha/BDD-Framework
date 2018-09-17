Feature: PHPTravels Application Test 

Scenario: Validate PHPTravels Home Page Test 

	Given user opens a browser 
	Then user is on login page 
	Then user logs into app
	Then validate home page title 
	Then validate logged in username
	Then check Hotels link
	Then check Flights link
#	Then change currency to INR
	And close the browser
	