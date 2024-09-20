import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity1 {
        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            driver.get("https://alchemy.hguy.co/jobs");
            String title=driver.getTitle();
            System.out.println("Title is :"+title);
            Assert.assertEquals(title,"Alchemy Jobs – Job Board Application");
            driver.quit();

        }
    }

