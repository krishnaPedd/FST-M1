import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/jobs");

        WebElement secondHeading = driver.findElement(By.xpath("//div[@class='entry-content clear']/h2"));
        String secondHeadingTxt= secondHeading.getText();
        System.out.println("second heading is :"+secondHeadingTxt);
        Assert.assertEquals(secondHeadingTxt,"Quia quis non");
        driver.quit();
    }
}

