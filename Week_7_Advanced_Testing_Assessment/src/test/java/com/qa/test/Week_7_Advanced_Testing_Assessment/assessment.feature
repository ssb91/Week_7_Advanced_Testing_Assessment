Feature: updating owner information

Scenario: get owners
Given an owner
When a user gets the owner from the system
Then the status code reads 200

Scenario: add owners
Given an owner
When a user adds the owner to the system
Then the status code reads 200

Scenario: get owner list
Given an owner
When a user gets the owner list from the system
Then the status code reads 200

Scenario: delete owner
Given an owner
When a user deletes the owner from the system
Then the status code reads 200

Scenario: update owner
Given an owner
When a user updates the owner from the system
Then the status code reads 200