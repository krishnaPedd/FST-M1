import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        WebElement username = driver.findElement(By.id("user_login"));
        WebElement password = driver.findElement(By.id("user_pass"));
        WebElement login = driver.findElement(By.id("wp-submit"));
        username.sendKeys("root");
        password.sendKeys("pa$$w0rd");
        login.click();
        WebElement alchemeyJobsTitle = driver.findElement(By.xpath("//li[@id='wp-admin-bar-site-name']/a"));
        String headerTitle= alchemeyJobsTitle.getText();
        System.out.println("title is "+headerTitle);
        WebElement jobListings = driver.findElement(By.xpath("//li[@id='menu-posts-job_listing']/a"));
        jobListings.click();
        WebElement addnew = driver.findElement(By.xpath("//a[@class='page-title-action']"));
        addnew.click();
        WebElement closeDialoguePopup = driver.findElement(By.xpath("//button[@aria-label='Close dialog']"));
        closeDialoguePopup.click();


        WebElement position = driver.findElement(By.id("post-title-0"));
        position.sendKeys("Springboot develper");

        WebElement jobLocation = driver.findElement(By.id("_job_location"));
        jobLocation.sendKeys("Ban");
        WebElement companyName = driver.findElement(By.id("_company_name"));
        companyName.sendKeys("Salesforce");
        WebElement companyWebsite = driver.findElement(By.id("_company_website"));
        companyWebsite.sendKeys("Salesforce.com");
        WebElement companyTagline = driver.findElement(By.id("_company_tagline"));
        companyTagline.sendKeys("services");
        WebElement publish = driver.findElement(By.xpath("//button[contains(@class,'editor-post-publish-button__button is-primary')]"));
        publish.click();
        Thread.sleep(6000);
        WebElement confirmPublish = driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-button editor-post-publish-button__button is-primary']"));
        confirmPublish.click();
        Thread.sleep(5000);
        WebElement view_job = driver.findElement(By.xpath("//a[@class='components-button is-secondary']"));
        view_job.click();
        WebElement jobTitle = driver.findElement(By.xpath(" //div[@class='ast-single-post-order']/h1"));
        String jobTitlename=jobTitle.getText();
        System.out.println("Posted job is for :"+jobTitlename);
        Assert.assertEquals(jobTitlename,"Springboot develper");
        driver.quit();

    }
}
