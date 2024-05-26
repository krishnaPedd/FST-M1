import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("The page title is  :"+driver.getTitle());
        // identifying username and entering user name
        driver.findElement(By.id("username")).sendKeys("admin");
        // identifying password and entering Password
        driver.findElement(By.id("password")).sendKeys("password");
        //Clicking on Sign in btn
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String message=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Log in confirmation message is :"+message);
        driver.close();
    }
}
