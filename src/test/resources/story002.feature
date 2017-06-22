Story-002
As a personal finance lover, I can track all my expenses in a easy way.

Acceptance Criteria:

The following information is provided in order to create an expense
The date when I spend the money
The category the expense belongs to
The amount I spent
A description of the expense
All previous pieces of information are mandatory


  Scenario: Show Expense information
  Given I have expense registered
  When I access page
  And open expense information
  Then I see date when I spend the money, category, amount I spent, description about expenses

