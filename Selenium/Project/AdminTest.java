package testclasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.AdminPage;
import utilities.Baseclass;

import java.time.Duration;

public class AdminTest {
    Baseclass baseclass=new Baseclass();
    WebDriver driver=baseclass.getDriver();
    AdminPage adminPage=new AdminPage(driver);

    @BeforeTest
    public void setUp() {
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void loginIntoAdmin()
    {
        adminPage.loginAdmin();
    }
    @AfterTest
    public void tearDown()
    {
        driver.close();
    }
}
