

@Regression 
Feature: To validate Registration page functionality


Background:
Given user launch naveen automation web page and lands on home page
And user sees My account and clicks register
And user sees registration page

@Registration
Scenario: To verify valid registration of web page
When user enters valid details in registration page
And user accepts privacy policy and clicks continue button
Then user sees account creation message
And user clicks continue button and lands on his account page

@InvalidRegistration
Scenario: To verify invalid registrtion of naveen automation

When user enter invalid details in the registration page 
Then user sees error message according to the invalid input he has given


