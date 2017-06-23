package thawing.shelf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(linkText = "Expense tracker")
    private WebElement menuExpense;

    @FindBy(linkText = "Add Expense")
    private WebElement menuAddNewExpense;

    @FindBy(linkText = "List Expenses")
    private WebElement menuListExpenses;

    @FindBy(linkText = "List Categories")
    private WebElement menuListCategories;

    @FindBy(linkText = "Show Statistics")
    private WebElement menuShowStatistics;

    @FindBy(id = "editaccount")
    private WebElement menuEditAccount;

    public void openCategories(){
        menuListCategories.click();
    }

    public String getAccountUserName(){
        return menuEditAccount.getText();
    }

    public void addNewExpense() {
        menuAddNewExpense.click();
    }

    public void openManagerUser() {
        menuEditAccount.click();
    }
}
