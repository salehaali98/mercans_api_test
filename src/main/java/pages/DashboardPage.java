package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;

public class DashboardPage extends BasePage{
    private By dashboard = By.xpath("//div[@class='lp-dashboard__title']");
    private By leavesDropdown = By.xpath("//p[normalize-space()='Leaves']");
    private By myLeaves = By.xpath("//a[normalize-space()='My leaves']");
    private By leavesDetails = By.xpath("//div[@class='balance-card__balances-wrapper']");


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
    public void openLeavesdropdown() {
        System.out.println("Opening My Leaves");
        WebElement leavesBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(leavesDropdown));
        leavesBtn.click();
        }

    public void openMyLeaves(){
         WebElement myLeavesBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(myLeaves));
         myLeavesBtn.click();
    }
    public String getLeavesDetails() {
        WebElement leavesCard = wait.until(ExpectedConditions.visibilityOfElementLocated(leavesDetails));
        String Leaves = leavesCard.getText();
        System.out.println("Leave details:\n" + Leaves);
        return Leaves;
    }

}
