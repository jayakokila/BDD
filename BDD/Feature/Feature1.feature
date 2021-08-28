Feature:To test the PHP application
Scenario:to test the login page of PHP
Given open chrome browser and url of the application
When enter username and password
Then Login success

Scenario:to test the login to the application
Given open chrome browser and url of the application
When enter valid username and password
Then Login successful

Scenario:to test the login to the application
Given open chrome browser and url of the application
When enter invalid username and password
Then Login unsuccessful
