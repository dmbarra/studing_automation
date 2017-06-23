package thawing.shelf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddExpensePage {

    @FindBy(id = "day")
    private WebElement dayBox;

    @FindBy(id = "month")
    private WebElement mounthBox;

    @FindBy(id = "year")
    private WebElement yearBox;

    @FindBy(id = "category")
    private WebElement categoryCombo;

    @FindBy(id = "amount")
    private WebElement amountBox;

    @FindBy(id = "reason")
    private WebElement reasonBox;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(css = "tbody tr")
    private WebElement tableCategory;

    public void createNewExpenseSuccess(){
        dayBox.clear();
        dayBox.sendKeys("25");
        mounthBox.clear();
        mounthBox.sendKeys("09");
        yearBox.clear();
        yearBox.sendKeys("2000");
        categoryCombo.click();
        categoryCombo.click();
        amountBox.clear();
        amountBox.sendKeys("2000");
        reasonBox.clear();
        reasonBox.sendKeys("Expense");
        submitButton.click();
    }

    public boolean isElementOnTable(String element){
        return !tableCategory.findElements(By.xpath("//td[contains(text(),'" + element + "')]")).isEmpty();
    }
}
