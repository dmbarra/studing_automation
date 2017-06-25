package thawing.shelf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "login")
    private WebElement userBox;

    @FindBy(id = "password")
    private WebElement passwordBox;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(linkText = "Register new user")
    private WebElement newUserLink;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement alertMessage;

    public void loginSuccessUser(String user, String password) {
        userBox.sendKeys(user);
        passwordBox.sendKeys(password);
        submitButton.click();
    }

    public void openNewUserForm() {
        newUserLink.click();
    }

    public boolean isMessagePresent() {
        return alertMessage.isDisplayed();
    }
}
