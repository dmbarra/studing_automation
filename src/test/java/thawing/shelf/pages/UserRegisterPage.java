package thawing.shelf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;

public class UserRegisterPage {

    @FindBy(id = "login")
    private WebElement userBox;

    @FindBy(id = "password1")
    private WebElement password1Box;

    @FindBy(id = "password2")
    private WebElement password2Box;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public void createNewUserSuccess(String user, String password){
        userBox.sendKeys(user);
        password1Box.sendKeys(password);
        password2Box.sendKeys(password);
        submitButton.click();
    }

    public String createNewUserSuccess(){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(1, 6);
        createNewUserSuccess(uuid, uuid);
        return uuid;
    }
}
