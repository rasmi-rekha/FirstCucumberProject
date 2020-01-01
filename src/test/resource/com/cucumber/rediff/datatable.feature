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
Feature: Testing datatable in cucumber
 

  @tag1
  Scenario: Login rediff in datadriven
    Given User open browser
    | FF |
    And User open url loginURL
    And User validate login page content
    And User entered emailid and password
    | rasmirekha.acharya@rediffmail.com | Rasmi1@3 |
    Then User Homepage is displayed
    Then User validate home page title
    
