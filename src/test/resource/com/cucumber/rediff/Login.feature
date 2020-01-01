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
@Login
Feature: Logging into Rediff money
  I want to use this template for my feature file

  @Login
  Scenario: Logging into Rediff money
    Given I open chrome
    And I navigate to loginURL
    And validate login pagetext
    And validate login pagetitle
    And I entered emailid and password
    Then Homepage is displayed
    Then validate home page title
    Then click on myportofolio dropdown and verify

