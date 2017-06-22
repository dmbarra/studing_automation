Story-004
As a personal finance lover, I can manage the categories I can use to classify my expenses.

Acceptance Criteria:

New categories can be created just by providing the name of the category
The existing categories can be queried, modified and deleted
Before deleting a category, it will be required a confirmation
When expenses are created or modified, they cab only be classified into one of the existing categories


  Scenario: Create new category
  Given I want create new category
  When I access page to list categories
  And I insert new category
  Then the new category is showed on categories list

  Scenario: Modified category
  Given I want modified category
  When I access page to list categories
  And I select the category I want
  And Changed the data
  Then the category modified is showed on categories list

  Scenario: Delete category
  Given I want delete category
  When I access page to list categories
  And I select the category I want delete
  Then the category is NOT showed on categories list

