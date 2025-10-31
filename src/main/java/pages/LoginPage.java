package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import utilities.ConfigReader;

public class LoginPage extends BasePage {

    private WebDriverWait wait;
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//span[text()='Login']");

    public LoginPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterUsername() {
        String username = ConfigReader.get("MYUSERNAME");
        System.out.println(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField))
                .sendKeys(username);
    }

    public void enterPassword() {
        String password = ConfigReader.get("PASSWORD");
        System.out.println(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField))
                .sendKeys(password);

    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton))
                .click();
    }
}