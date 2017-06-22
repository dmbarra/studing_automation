Story-008
As a user concerned about security, I can change my access data.

Acceptance Criteria:

Usernames cannot be changed
Password can be changed
The current password must be provided in order to change it
The new password must be confirmed (for example, by entering in two different fields)


  Scenario: Change a user password
  Given I am registered
  When I access page
  And I access manager user page
  And I update my password
  Then password are updated

  Scenario: Failed change a user password
  Given I am registered
  When I access page
  And I access manager user page
  And I fill passwords fields with differentes values
  Then I receive message error
