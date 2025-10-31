package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

 public class DashboardPage extends BasePage{
    public WebDriver driver;
    private By dashboard = By.xpath("//div[@class='lp-dashboard__title']");
    //private By dashboard = By.xpath("//a[.//span[text()='Leaves']]");
   // private By dashboard = By.xpath("//button[@aria-label='Request new leave']");




     public DashboardPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public boolean isDashboardDisplayed() {
        System.out.println("Checking if Dashboard is visible");
        WebElement titlePage = wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard));
        titlePage.isDisplayed();
        return true;
    }
}
