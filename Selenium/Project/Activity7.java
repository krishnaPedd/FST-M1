import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity7 {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://alchemy.hguy.co/jobs");
            WebElement postJobLink = driver.findElement(By.linkText("Post a Job"));
            postJobLink.click();
            WebElement accountEmail = driver.findElement(By.id("create_account_email"));
            accountEmail.sendKeys("sample52490@gmail.com");
            WebElement jobTitle = driver.findElement(By.id("job_title"));
            jobTitle.sendKeys("Full stack developer2");
            WebElement jobLocation = driver.findElement(By.id("job_location"));
            jobLocation.sendKeys("Hyderabad");
            WebElement jobType = driver.findElement(By.id("job_type"));
            Select select=new Select(jobType);
            select.selectByVisibleText("Full Time");
            WebElement frame = driver.findElement(By.id("job_description_ifr"));
            driver.switchTo().frame(frame);
            WebElement jobDesc = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
            jobDesc.sendKeys("This is full stack tester oppurnity, must have UI, API, Mobile automation skills");
            driver.switchTo().defaultContent();
            WebElement applicationUrl = driver.findElement(By.id("application"));
            applicationUrl.sendKeys("https://myownway.com");
            WebElement companyName = driver.findElement(By.id("company_name"));
            companyName.sendKeys("Myownway");
            WebElement preview = driver.findElement(By.xpath("//input[@value='Preview']"));
            preview.click();
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("job_preview_submit_button")));
            WebElement submitButton = driver.findElement(By.id("job_preview_submit_button"));
            submitButton.click();
            WebElement jobsLink = driver.findElement(By.linkText("Jobs"));
            jobsLink.click();
            WebElement searchKeyword= driver.findElement(By.id("search_keywords"));
            searchKeyword.sendKeys("Full stack developer2");
            WebElement searchJob= driver.findElement(By.xpath("//input[@value='Search Jobs']"));
            searchJob.click();
            WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(5));
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='job_listings']")));
            WebElement postedJobAppName= driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]//h3"));
            String actualPostedJob=  postedJobAppName.getText();
            System.out.println("posted job is "+actualPostedJob);
            Assert.assertEquals(actualPostedJob,"Full stack developer2");

        }
}
