package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.ButtonsPage;
import pages.LoginPage;
import pages.TextBoxPage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPage loginPage;
    private ButtonsPage buttonsPage;
    private TextBoxPage textBoxPage;


    public BaseTest() {
    }


    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Stefan//Desktop//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver, wait);
        buttonsPage = new ButtonsPage(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);

    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return this.wait;
    }

    public LoginPage getLoginPage() {
        return this.loginPage;
    }

    public ButtonsPage getButtonsPage() {
        return this.buttonsPage;
    }

    public TextBoxPage getTextBoxPage() {
        return this.textBoxPage;
    }


    @AfterClass
    public void cleanUp() {
        driver.close();
    }
}
