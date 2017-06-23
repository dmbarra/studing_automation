package thawing.shelf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;

public class CategoryListPage {

    @FindBy(id = "go_add_category")
    private WebElement linkNewCategory;

    @FindBy(id = "name")
    private WebElement fieldName;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(css = "tbody tr")
    private WebElement tableCategory;

    public String createNewCategory(){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(1, 6);
        linkNewCategory.click();
        fieldName.sendKeys(uuid);
        submitButton.click();
        return uuid;
    }

    public boolean isElementOnTable(String element){
        return !tableCategory.findElements(By.xpath("//td[contains(text(),'" + element + "')]")).isEmpty();
    }
}
