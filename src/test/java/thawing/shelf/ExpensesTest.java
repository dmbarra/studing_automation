package thawing.shelf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import thawing.shelf.configuration.RemoteDriverSelenium;
import thawing.shelf.pages.AddExpensePage;
import thawing.shelf.pages.CategoryListPage;
import thawing.shelf.pages.LoginPage;
import thawing.shelf.pages.MainPage;
import thawing.shelf.pages.UserRegisterPage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExpensesTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private UserRegisterPage userRegisterPage;
    private MainPage mainPage;
    private CategoryListPage categoryListPage;
    private AddExpensePage addExpensePage;

    private String key;
    private String category;

    @Before
    public void setUp() throws InterruptedException, MalformedURLException {
        driver = new RemoteDriverSelenium().connectBrowserStack();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        userRegisterPage = PageFactory.initElements(driver, UserRegisterPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        categoryListPage = PageFactory.initElements(driver, CategoryListPage.class);
        addExpensePage = PageFactory.initElements(driver, AddExpensePage.class);
        driver.get("http://thawing-shelf-73260.herokuapp.com/");
    }

    @After
    public void before(){
        driver.close();
        driver.quit();
    }

    @Test
    public void shouldLoginSucessWithNewUser(){
        loginPage.openNewUserForm();
        key = userRegisterPage.createNewUserSuccess();
        assertThat(mainPage.getAccountUserName(), is(key));
    }

    @Test
    public void shouldNotLoginWithInvalidUser(){
        loginPage.loginSuccessUser("invalid", "invalid");
        assertThat(loginPage.isMessagePresent(), is(Boolean.TRUE));
    }

    @Test
    public void shouldCreateNewCategory(){
        loginPage.openNewUserForm();
        key = userRegisterPage.createNewUserSuccess();
        mainPage.openCategories();
        category = categoryListPage.createNewCategory();
        assertThat(categoryListPage.isElementOnTable(category), is(Boolean.TRUE));
    }

    @Test
    public void shouldCreateNewExpense(){
        loginPage.openNewUserForm();
        key = userRegisterPage.createNewUserSuccess();
        mainPage.openCategories();
        category = categoryListPage.createNewCategory();
        mainPage.addNewExpense();
        addExpensePage.createNewExpenseSuccess();
        assertThat(addExpensePage.isElementOnTable("25.09.00"), is(Boolean.TRUE));
    }
}
