package tests;

import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import org.testng.annotations.*;
import Base.BaseTest;

import javax.sql.rowset.spi.SyncFactoryException;

public class LoginTests extends BaseTest {

    @Test(priority = 1)
    public void testValidLoginWithEmployee() throws InterruptedException {
        loginPage.enterUsername("EMPLOYEEUSERNAME");
        loginPage.enterPassword("EMPLOYEEPASSWORD");
        dashboardPage = loginPage.clickLogin();
        String url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        Assert.assertTrue(dashboardPage.isDashboardDisplayed());
        loginPage = dashboardPage.signOut();

    }


}