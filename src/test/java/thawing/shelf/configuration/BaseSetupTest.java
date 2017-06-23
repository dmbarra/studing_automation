package thawing.shelf.configuration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import thawing.shelf.pages.AddExpensePage;
import thawing.shelf.pages.CategoryListPage;
import thawing.shelf.pages.LoginPage;
import thawing.shelf.pages.MainPage;
import thawing.shelf.pages.ManagerUserPage;
import thawing.shelf.pages.UserRegisterPage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseSetupTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected UserRegisterPage userRegisterPage;
    protected MainPage mainPage;
    protected CategoryListPage categoryListPage;
    protected AddExpensePage addExpensePage;
    protected ManagerUserPage managerUserPage;

    protected String key;
    protected String category;

    @Before
    public void setUp() throws InterruptedException, MalformedURLException {
        driver = new RemoteDriverSelenium().connectBrowserStack();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        userRegisterPage = PageFactory.initElements(driver, UserRegisterPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        categoryListPage = PageFactory.initElements(driver, CategoryListPage.class);
        addExpensePage = PageFactory.initElements(driver, AddExpensePage.class);
        managerUserPage = PageFactory.initElements(driver, ManagerUserPage.class);
        driver.get("http://thawing-shelf-73260.herokuapp.com/");
    }

    @After
    public void before(){
        driver.close();
        driver.quit();
    }

}
