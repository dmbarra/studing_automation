Story-001
As a personal finance lover, I can see all my expenses in one single place.

Acceptance Criteria:

For each expense, I can see:
The date when the expense happened
The category the expense belongs to
The amount of money I spent
A description of the expense
Expenses are shown following a time-based ordering criteria
Not too many expenses are shown at the same time
In case there are more than 10 registered expenses, the will be shown in 10-item chunks


  Scenario: Show List of Expenses
  Given I have expense registered
  When I access page
  Then I see date, category, description about expenses
  And expense are ordered by time register

  Scenario: Show more 10 registered expenses
  Given I have 20 expenses registered
  When I access page
  Then I see only 10-itens