package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class DashboardTests extends BaseTest {

    @Test
    public void openLeavesPortal() throws InterruptedException {
        loginPage.enterUsername("MANAGERUSERNAME");
        loginPage.enterPassword("MANAGERPASSWORD");
        dashboardPage = loginPage.clickLogin();
        dashboardPage.openLeavesdropdown();
        dashboardPage.openMyLeaves();
    }
    @Test
    public void verifyLeavesDetails(){
        String LeaveDetails = dashboardPage.getLeavesDetails();
        System.out.println("Leave Details Text:\n" + LeaveDetails);
        String normalized = LeaveDetails.toLowerCase().replaceAll("\\s+", " ");
        Assert.assertTrue(normalized.contains("entitled"), "Entitled field not displayed");
        Assert.assertTrue(normalized.contains("taken"), "Taken field not displayed");
        Assert.assertTrue(normalized.contains("estimated balance"), "Estimated balance field not displayed");

        System.out.println("All three leave detail fields are displayed.");


    }
}
