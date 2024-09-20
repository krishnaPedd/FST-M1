import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Activity8 {
    public static void main(String[] args) {
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
        Assert.assertEquals(headerTitle,"Alchemy Jobs");
    }
}
