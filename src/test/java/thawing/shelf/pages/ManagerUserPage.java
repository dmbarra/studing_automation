package thawing.shelf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerUserPage {

    @FindBy(id = "password")
    private WebElement passwordBox;

    @FindBy(id = "newpassword1")
    private WebElement newPassword1Box;

    @FindBy(id = "newpassword2")
    private WebElement newPassword2Box;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public void updateUserPassword(String oldPassword, String newPassword) {
        passwordBox.sendKeys(oldPassword);
        newPassword1Box.sendKeys(newPassword);
        newPassword2Box.sendKeys(newPassword);
        submitButton.click();
    }

}
