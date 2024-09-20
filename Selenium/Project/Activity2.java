import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        WebElement firstHeading= driver.findElement(By.xpath("//h1[@class=\"entry-title\"]"));
        String webSiteHeading = firstHeading.getText();
        System.out.println("webSite Heading is :" + webSiteHeading);
        Assert.assertEquals(webSiteHeading, "Welcome to Alchemy Jobs");
        driver.quit();
    }
}
