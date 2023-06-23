package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage {

    private WebElement fullNameField;
    private WebElement emailField;
    private WebElement currentAddressField;
    private WebElement permananetAddressField;
    private WebElement submitBtn;
    private WebElement nameCheck;
    private WebElement emailCheck;
    private WebElement currentAddressCheck;
    private WebElement permananetAdressCheck;
    private String nameData = "Peradjura";
    private String emailData = "Peradjura@gmail.com";
    private String address1 = "Pere Djure 123";
    private String address2 = "Djure Pere 321";

    public String getNameData() {
        return nameData;
    }

    public String getEmailData() {
        return emailData;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFullNameField() {
        this.fullNameField = getDriver().findElement(By.id("userName"));
        return fullNameField;
    }

    public WebElement getEmailField() {
        this.emailField = getDriver().findElement(By.id("userEmail"));
        return emailField;
    }

    public WebElement getCurrentAddressField() {
        this.currentAddressField = getDriver().findElement(By.id("currentAddress"));
        return currentAddressField;
    }

    public WebElement getPermanentAddressField() {
        this.permananetAddressField = getDriver().findElement(By.id("permanentAddress"));
        return permananetAddressField;
    }

    public WebElement getSubmitBtn() {
        this.submitBtn = getDriver().findElement(By.id("submit"));
        return submitBtn;
    }

    public WebElement getNameCheck() {
        this.nameCheck = getDriver().findElement(By.id("name"));
        return nameCheck;
    }

    public WebElement getEmailCheck() {
        this.emailCheck = getDriver().findElement(By.id("email"));
        return emailCheck;
    }

    public WebElement getCurrentAddressCheck() {
        this.currentAddressCheck = getDriver().findElement(By.id("currentAddress"));
        return currentAddressCheck;
    }

    public WebElement getPermananetAdressCheck() {
        this.permananetAdressCheck = getDriver().findElement(By.id("permanentAddress"));
        return permananetAdressCheck;
    }

    public void enterDataIntoFullNameField(String text) {
        getFullNameField().sendKeys(text);
    }

    public void enterDataIntoEmailField(String text) {
        getEmailField().sendKeys(text);
    }

    public void enterDataIntoCurrentAddressField(String text) {
        getCurrentAddressField().sendKeys(text);
    }

    public void enterDataIntoPermananetAdressField(String text) {
        getPermanentAddressField().sendKeys(text);
    }

    public void clickSubmitButton() {
        getSubmitBtn().click();
    }

    public void open() {
        getDriver().get("https://demoqa.com/text-box");
    }

}
