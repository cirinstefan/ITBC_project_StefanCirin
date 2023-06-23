package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement loginBtn;
    private WebDriverWait wait;
    private String userNameData = "pericpera";
    private String urlLogin = "login";
    private String urlProfile = "profile";
    private String passwordData = "Pericpera123!";


    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFullNameField() {
        this.userNameField = getDriver().findElement(By.xpath("//input[@class='mr-sm-2 form-control' and @type= 'text']"));
        return userNameField;
    }

    public WebElement getPasswordField() {
        this.passwordField = getDriver().findElement(By.xpath("//input[@class='mr-sm-2 form-control' and @type= 'password']"));
        return passwordField;
    }

    public WebElement getLoginBtn() {
        this.loginBtn = getDriver().findElement(By.xpath("//button[text()= 'Login' and @type = 'button']"));
        return loginBtn;
    }
    public WebDriverWait getWait() {
        return this.wait;
    }

    public String getUserNameData() {
        return userNameData;
    }

    public String getUrlLogin() {
        return urlLogin;
    }
    public String getPasswordData() {
        return passwordData;
    }

    public String getUrlProfile() {
        return urlProfile;
    }

    public void clickLogInBtn() {
        getLoginBtn().click();
    }

    public void enterDataIntoUserNameField(String text) {
        getFullNameField().sendKeys(text);
    }

    public void enterDataIntoPasswordField(String text) {
        getPasswordField().sendKeys(text);
    }

    public void open() {
        getDriver().get("https://demoqa.com/login");
    }

}
