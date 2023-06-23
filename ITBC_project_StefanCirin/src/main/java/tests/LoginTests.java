package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;



public class LoginTests extends BaseTest {
    @Test
    public void verifyIfUserCanLogInWithFieldsEmpty() {
        getLoginPage().open();
        getLoginPage().clickLogInBtn();
        Assert.assertTrue(getDriver().getCurrentUrl().contains(getLoginPage().getUrlLogin()));
    }

    @Test
    public void verifyIfUserCanLogInWithUserNameFieldLeftEmpty() {
        getLoginPage().open();
        getLoginPage().enterDataIntoPasswordField(getLoginPage().getPasswordData());
        getLoginPage().clickLogInBtn();
        Assert.assertTrue(getDriver().getCurrentUrl().contains(getLoginPage().getUrlLogin()));
    }
    @Test
    public void verifyIFUserCanLogInWithPasswordFieldLeftEmpty(){
        getLoginPage().open();
        getLoginPage().enterDataIntoUserNameField(getLoginPage().getUserNameData());
        getLoginPage().clickLogInBtn();
        Assert.assertTrue(getDriver().getCurrentUrl().contains(getLoginPage().getUrlLogin()));
    }

    @Test
    public void verifyIfUserCanLogInWithValidInput()  {
        getLoginPage().open();
        getLoginPage().enterDataIntoUserNameField(getLoginPage().getUserNameData());
        getLoginPage().enterDataIntoPasswordField(getLoginPage().getPasswordData());
        getLoginPage().clickLogInBtn();
        getWait().until(ExpectedConditions.urlContains(getLoginPage().getUrlProfile()));
        Assert.assertTrue(getDriver().getCurrentUrl().contains(getLoginPage().getUrlProfile()));

    }

}
