import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6 {
   public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/jobs");
       WebElement jobsLink = driver.findElement(By.linkText("Jobs"));
       jobsLink.click();
       WebElement searchKeyword= driver.findElement(By.id("search_keywords"));
       searchKeyword.sendKeys("Selenium");
       WebElement searchJob= driver.findElement(By.xpath("//input[@value='Search Jobs']"));
       searchJob.click();
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='job_listings']")));
       WebElement matchedFirstJobs= driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]"));
       matchedFirstJobs.click();
       WebElement applyJob= driver.findElement(By.xpath("//input[@value='Apply for job']"));
       applyJob.click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='job_application_email']")));
       WebElement emailAddress= driver.findElement(By.xpath("//a[@class='job_application_email']"));
       String emailDetails= emailAddress.getText();
       System.out.println("Email  is :"+ emailDetails);
       driver.quit();
    }
}
