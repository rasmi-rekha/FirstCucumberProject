#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Testing Datadriven feature in cucumber
 

  @tag1
  Scenario: Login rediff to test datadriven
    Given User will open "chrome" browser
    And User open  loginURL
    And User validated login page content
    And User entered "bibek346@rediffmail.com" and "Rasmi1@3"
    Then User name is displayed on Homepage
    Then User validated home page title
    

 