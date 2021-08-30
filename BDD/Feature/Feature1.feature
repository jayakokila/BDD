Feature:To test the PHP application
Scenario:to test the login of PHP
Given open chrome browser and url of the application
When enter username and password
Then Login success

Scenario:to test the invalidlogin of PHP
Given open chrome browser and url of the application
When enter invalid username and invalid password
Then Login Unsuccessful


