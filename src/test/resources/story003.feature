Story-003
As a personal finance lover, I can manage the expenses I have already registered.

Acceptance Criteria:

An expense can be deleted for ever
Before deleting an expense, it will be required a confirmation
An expense can be modified
The information that can be modified is the same which must be provided when the expense is created (see Story-002)
The current information will be shown in first in order to make the edition easier


  Scenario: Delete expense
  Given I have expense registered
  When I access page
  And open expense information
  And I delete delete a expense
  Then All data about expense are erased

  Scenario: Modified expense data
  Given I have expense registered
  When I access page
  And open expense information
  And I modified a expense data
  And I save changes
  Then expense information are updated

