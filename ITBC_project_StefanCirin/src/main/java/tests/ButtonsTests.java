package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTests extends BaseTest {
    @Test
    public void clickOnClickMeButton() {
        getButtonsPage().open();
        getButtonsPage().clickOnCLickMeButton();
        Assert.assertTrue(getButtonsPage().getClickMessage().isDisplayed());
    }

    @Test
    public void doubleCliclOnDoubleCLickMeButton() {
        getButtonsPage().open();
        getButtonsPage().doubleClickOnDoubleClickButton();
        Assert.assertTrue(getButtonsPage().getDoubleClickMessage().isDisplayed());
    }

    @Test
    public void rightClickOnRightClickMeButton() {
        getButtonsPage().open();
        getButtonsPage().rightClickOnRightClickMeButton();
        Assert.assertTrue(getButtonsPage().getRightClickMessage().isDisplayed());
    }

}
