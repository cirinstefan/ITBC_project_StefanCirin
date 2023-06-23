package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class ButtonsPage extends BasePage {
    private WebElement doubleClickBtn;
    private WebElement rightClickBtn;
    private WebElement clickBtn;
    private Actions actions = new Actions(getDriver());
    private WebElement doubleClickMessage;
    private WebElement rightClickMessage;
    private WebElement clickMessage;

    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getDoubleClickBtn() {
        this.doubleClickBtn = getDriver().findElement(By.xpath("//button[text() ='Double Click Me']"));
        return doubleClickBtn;
    }

    public WebElement getRightClickBtn() {
        this.rightClickBtn = getDriver().findElement(By.xpath("//button[text() ='Right Click Me']"));
        return rightClickBtn;
    }

    public WebElement getClickBtn() {
        this.clickBtn = getDriver().findElement(By.xpath("//button[text() ='Click Me']"));
        return clickBtn;
    }

    public void doubleClickOnDoubleClickButton() {
        actions.doubleClick(getDoubleClickBtn()).perform();
    }

    public void clickOnCLickMeButton() {
        getClickBtn().click();
    }

    public void rightClickOnRightClickMeButton() {
        actions.contextClick(getRightClickBtn()).perform();
    }

    public WebElement getDoubleClickMessage() {
        this.doubleClickMessage = getDriver().findElement(By.xpath("//p[text()= 'You have done a double click' ]"));
        return doubleClickMessage;
    }

    public WebElement getRightClickMessage() {
        this.rightClickMessage = getDriver().findElement(By.xpath("//p[text()= 'You have done a right click' ]"));
        return rightClickMessage;
    }

    public WebElement getClickMessage() {
        this.clickMessage = getDriver().findElement(By.xpath("//p[text()= 'You have done a dynamic click' ]"));
        return clickMessage;
    }

    public void open() {
        getDriver().get("https://demoqa.com/buttons");
    }

}
