package thawing.shelf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import thawing.shelf.configuration.RemoteDriverSelenium;
import thawing.shelf.pages.LoginPage;
import thawing.shelf.pages.UserRegisterPage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ExpensesTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private UserRegisterPage registerNewUserPage;

    private String key;

    @Before
    public void setUp() throws InterruptedException, MalformedURLException {
        driver = new RemoteDriverSelenium().connectBrowserStack();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        registerNewUserPage = PageFactory.initElements(driver, UserRegisterPage.class);
    }

    @After
    public void before(){
        driver.close();
        driver.quit();
    }

    @Test
    public void shouldLoginSucessWithNewUser(){
        driver.get("http://thawing-shelf-73260.herokuapp.com/");
        loginPage.openNewUserForm();
        key = registerNewUserPage.createNewUserSuccess();
    }
}
