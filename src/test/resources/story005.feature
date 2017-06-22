Story-005
As a personal finance lover who is specially fond of analytics, I can get some basics statistics about how I spend my money.

Acceptance Criteria:

Expenses can be analyzed on a monthly basis
A summary with the amount of money spent per category plus the total amount spent during the month will be reported
At least, one graphical representation of the expenses in the month will be provided



Scenario: Show statistics about expenses
  Given I want see statistics about my expenses
  When I access page show statistics
  Then I see summary with the amount of money per category plus the total amount spent during the month
  And I see one graphical representation of expenses


