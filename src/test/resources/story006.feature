Story-006
As a user concerned about security,
I can access to all functionalities related to expense tracking if
I am a registered user and I am logged in.

Acceptance Criteria:

All functionalities require users to be logged in in order to work
Users have only access to their own expense data


  Scenario: Enable to access all functionality
  Given I am registered user
  When I access page
  Then I can use all functionalities disponible on system

  Scenario: Unable to access all functionality
  Given I am NOT registered user
  When I try access page
  Then I can NOT use all functionalities disponible on system


