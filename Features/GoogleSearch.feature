@googlesearch
Feature: google search

Scenario Outline: simple search

Given I am on google homepage
When I enter search "<term>"
And I click on google search button
Then I recieve relative search contents

Examples:
|term				|
|Quality Assurance	|
|Software Testing	|
