package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import utilities.ConfigReader;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void open() {
        String url = ConfigReader.get("LOGIN_URL");
        System.out.println("Opening URL: " + url);
        driver.get(url);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
        System.out.println("Page loaded!");

        System.out.println("Waiting for login form...");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));  // ← YEH CHANGE
        System.out.println("Login form is visible!");
        System.out.println("All input fields:");
        driver.findElements(By.tagName("input")).forEach(element -> {
            System.out.println("  -> name: " + element.getAttribute("name") +
                    ", id: " + element.getAttribute("id") +
                    ", type: " + element.getAttribute("type"));
        });
    }

}