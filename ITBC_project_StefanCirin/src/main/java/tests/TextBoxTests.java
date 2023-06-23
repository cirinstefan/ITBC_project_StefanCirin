package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest {
    @Test
    public void verifyIfNameInfoIsDisplayed() {
        getTextBoxPage().open();
        getTextBoxPage().enterDataIntoFullNameField(getTextBoxPage().getNameData());
        getTextBoxPage().clickSubmitButton();
        Assert.assertTrue(getTextBoxPage().getNameCheck().isDisplayed());
    }

    @Test
    public void verifyIfEmailInfoIsDisplayed() {
        getTextBoxPage().open();
        getTextBoxPage().enterDataIntoEmailField(getTextBoxPage().getEmailData());
        getTextBoxPage().clickSubmitButton();
        Assert.assertTrue(getTextBoxPage().getEmailCheck().isDisplayed());
    }

    @Test
    public void verifyIfCurrentAddressInfoIsDisplayed() {
        getTextBoxPage().open();
        getTextBoxPage().enterDataIntoCurrentAddressField(getTextBoxPage().getAddress1());
        getTextBoxPage().clickSubmitButton();
        Assert.assertTrue(getTextBoxPage().getCurrentAddressCheck().isDisplayed());
    }

    @Test
    public void verifyIfPermananetAddressInfoIsDisplayed() {
        getTextBoxPage().open();
        getTextBoxPage().enterDataIntoPermananetAdressField(getTextBoxPage().getAddress2());
        getTextBoxPage().clickSubmitButton();
        Assert.assertTrue(getTextBoxPage().getPermananetAdressCheck().isDisplayed());
    }
}
