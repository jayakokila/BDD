Feature:To test the Ksrtc application
Scenario:to test the login page of Ksrtc
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
