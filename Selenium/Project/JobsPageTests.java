package testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.JobsPage;
import utilities.Baseclass;

import java.time.Duration;

public class JobsPageTests extends Baseclass {

    Baseclass baseclass=new Baseclass();
    WebDriver driver=baseclass.getDriver();
    HomePage homePage=new HomePage(driver);
    JobsPage jobsPage=new JobsPage(driver);
    @BeforeTest
    public void setup()
    {
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void searCHForJob()
    {
        homePage.clickOnJobs();
        jobsPage.searCHForJob();
    }

    @Test
    public void postJob()
    {
        jobsPage.clockOnPost_A_Job();
        jobsPage.postJobApplication();
        homePage.clickOnJobs();
        jobsPage.verifyPostedJob();
    }
    @AfterTest
    public void tearDown()
    {
        driver.close();
    }
}
