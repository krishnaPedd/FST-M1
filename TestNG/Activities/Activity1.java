import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
   private WebDriver driver;
    @BeforeClass
    public void setUp()
    {
         driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net");
    }

    @Test
    public void test1()
    {
        String title=driver.getTitle();
        System.out.println("Page Title is :"+title);
        Assert.assertEquals(title,"Training Support");
        driver.findElement(By.id("about-link")).click();
        String newPageTitle=driver.getTitle();
        System.out.println("New page title is "+ newPageTitle);
        Assert.assertEquals(newPageTitle,"About Training Support");

    }
    @AfterClass
    public  void tearDown(){
    driver.close();
    }
}
