package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Baseclass;

import java.time.Duration;
import java.util.Random;

public class JobsPage {
    WebDriver driver;
    public JobsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="search_keywords")
    WebElement searchKeyword;
    @FindBy(xpath = "//input[@value='Search Jobs']")
    WebElement searchJob;
    @FindBy(xpath = "//ul[@class='job_listings']/li[1]")
    WebElement matchedFirstJobs;
    @FindBy(xpath = "//input[@value='Apply for job']")
    WebElement applyJob;
    @FindBy(xpath = "//a[@class='job_application_email']")
    WebElement emailAddress;

    @FindBy(linkText = "Post a Job")
    WebElement postJob;
    @FindBy(id="create_account_email")
    WebElement accoumtEmail;

    @FindBy(id="job_title")
    WebElement jobTitle;

    @FindBy(id="job_location")
    WebElement jobLocation;

    @FindBy(id="job_type")
    WebElement jobType;

    @FindBy(id="job_description_ifr")
    WebElement frame;

    @FindBy(xpath="//body[@id='tinymce']/p")
    WebElement jobDesc;

    @FindBy(id="application")
    WebElement applicationUrl;
    @FindBy(xpath="//input[@value='Preview']")
    WebElement preview;
    @FindBy(id="company_name")
    WebElement companyName;
    @FindBy(id="job_preview_submit_button")
    WebElement submitButton;

    @FindBy(xpath="//ul[@class='job_listings']/li[1]//h3")
    WebElement postedJobAppName;
















  public void verifyPostedJob()
   {
    searchKeyword.sendKeys("Full stack tester");
    searchJob.click();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='job_listings']")));
    String actualPostedJob=  postedJobAppName.getText();
       Assert.assertEquals(actualPostedJob,"Full stack tester");
    }

    public void searCHForJob()
    {
      //  driver.findElement(By.linkText("Jobs")).click();
        searchKeyword.sendKeys("Selenium");
        searchJob.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='job_listings']")));
        matchedFirstJobs.click();
        applyJob.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='job_application_email']")));
        String emailDetails= emailAddress.getText();
        System.out.println("Email  is :"+ emailDetails);


    }

    public void clockOnPost_A_Job()
    {
        postJob.click();
    }

    public void postJobApplication()
    {
        //Random r=new Random();
        //int value=r.nextInt();
        accoumtEmail.sendKeys("sample52420@gmail.com");
        jobTitle.sendKeys("Full stack tester");
        jobLocation.sendKeys("Hyderabad");
        Select select=new Select(jobType);
        select.selectByVisibleText("Full Time");
        driver.switchTo().frame(frame);
        jobDesc.sendKeys("This is full stack tester oppurnity, must have UI, API, Mobile automation skills");
        driver.switchTo().defaultContent();
        applicationUrl.sendKeys("https://myownway.com");
        companyName.sendKeys("Myownway");
        preview.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("job_preview_submit_button")));
        submitButton.click();

    }

    public void veryJobPost()
    {

    }


}
