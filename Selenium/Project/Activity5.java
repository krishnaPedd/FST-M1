import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/jobs");
        WebElement jobsLink = driver.findElement(By.linkText("Jobs"));
        jobsLink.click();
        String title=driver.getTitle();
        System.out.println("Jobs patge title is "+title);
        Assert.assertEquals(title,"Jobs – Alchemy Jobs");
        driver.quit();
    }
}
