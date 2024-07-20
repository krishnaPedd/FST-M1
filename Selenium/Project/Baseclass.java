package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Baseclass {

   public static  WebDriver driver;

   public  WebDriver getDriver()
   {
       driver=new ChromeDriver();
       return driver;
   }


   @BeforeSuite
    public void  intializeDriver()
   {
        driver.manage().window().maximize();

    }

    @AfterSuite
    public void tearDown()
    {
        driver.quit();
    }


}
