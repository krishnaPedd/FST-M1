package testclasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import utilities.Baseclass;

import java.time.Duration;

public class HomePageTests extends Baseclass {

   // HomePage homePage=new HomePage(driver);
   Baseclass baseClass=new Baseclass();
  WebDriver driver= baseClass.getDriver();
   HomePage homePage = new HomePage(driver);
   @BeforeTest
   public void setup()
   {
       driver.get("https://alchemy.hguy.co/jobs/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   }


    @Test
    public void verifyHomePageTitle()
    {

        homePage.verifyTitle();
    }

    @Test
    public void verifyHomePageWebsiteHeading()
    {
       homePage.verifyWebsiteHeading();
    }
    @Test
    public void verifyHomePageURLOfHeaderImg()
    {
      homePage.verifyURLOfHeaderImg();
    }
    @Test
    public void verifyHomePageWebsiteSecondHeading()
    {
      homePage.verifyWebsiteSecondHeading();
    }

    public void navigateToJobsPage()
    {
      homePage.navigateToJobsPage();
    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
    }


}
