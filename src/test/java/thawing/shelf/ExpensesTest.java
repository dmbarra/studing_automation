package thawing.shelf;

import org.junit.Test;
import thawing.shelf.configuration.BaseSetupTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExpensesTest extends BaseSetupTest {

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
    public void shouldUpdatePasswordFromNewUser(){
        loginPage.openNewUserForm();
        key = userRegisterPage.createNewUserSuccess();
        mainPage.openManagerUser();
        managerUserPage.updateUserPassword(key, "newPassword");
        mainPage.logout();
        loginPage.loginSuccessUser(key, "newPassword");
        assertThat(mainPage.getAccountUserName(), is(key));
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
