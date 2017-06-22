Story-007
As a user concerned about security and interested in personal finance,
I can registered in order to have access to the expense tracker functionalities.

Acceptance Criteria:

New users must provide an username they want to use to log in and a password
Two users cannot have the same username
Passwords need to be confirmed (for example, by entering in two different fields)


  Scenario: Create new user to access app
  Given I am NOT registered
  When I access page to login
  And enter new user page register
  And I fill all field
  Then I can use all functionalities disponible on system

  Scenario: Try to create new user filling passwords fields with differentes keys
  Given I am NOT registered
  When I access page to login
  And enter new user page register
  And I fill passwords fields with differentes values
  Then I can NOT use all functionalities disponible on system
  And I receive message error

  Scenario: Try to create two new users with same username
  Given I am registered
  When I access page to login
  And enter new user page register
  And I fill username field with same user I already have
  Then I receive message error
