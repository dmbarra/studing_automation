package thawing.shelf;

import org.junit.Test;
import thawing.shelf.configuration.BaseSetupTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExpensesTest extends BaseSetupTest {

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
