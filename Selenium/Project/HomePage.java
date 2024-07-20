package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utilities.Baseclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage {
     WebDriver driver;
     public HomePage(WebDriver driver)
     {
         this.driver=driver;
         PageFactory.initElements(driver, this);
     }
     @FindBy(xpath = "//img[contains(@src,'776615-e1569782235456-1024x271.jpg')]")
     private WebElement headerImage;

    @FindBy(tagName = "h1")
    private WebElement firstHeading;

    @FindBy(tagName = "h2")
     private WebElement secondHeading;

     @FindBy(linkText = "Jobs")
     private WebElement jobsLink;



    public void verifyTitle()
    {
        String title=driver.getTitle();
        System.out.println("Title is :"+title);
        Assert.assertEquals(title,"Alchemy Jobs – Job Board Application");
    }

    public void verifyWebsiteHeading()
    {
        String webSiteHeading= firstHeading.getText();
        System.out.println("webSite Heading is :"+ webSiteHeading);
        Assert.assertEquals(webSiteHeading,"Alchemy Jobs");
    }

    public void verifyURLOfHeaderImg()
    {
        String imageURl=  headerImage.getAttribute("src");
        System.out.println("Image URL is :"+imageURl);
    }

    public void verifyWebsiteSecondHeading()
    {
        String secondHeadingTxt= secondHeading.getText();
        System.out.println("second heading is :"+secondHeadingTxt);
        Assert.assertEquals(secondHeadingTxt,"Quia quis non");
    }

    public  void clickOnJobs()
    {
        jobsLink.click();
    }

    public void navigateToJobsPage()
    {
        String title=driver.getTitle();
        Assert.assertEquals(title,"Jobs");
    }

}
