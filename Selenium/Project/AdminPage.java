package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
    WebDriver driver;
     public AdminPage(WebDriver driver)
     {
         this.driver=driver;
     }
     @FindBy(id="user_login")
     WebElement username;

    @FindBy(id="user_pass")
    WebElement password;

    @FindBy(id="wp-submit")
    WebElement login;

    public void loginAdmin()
    {
        username.sendKeys("username");
        password.sendKeys("password");
        login.click();
    }



}
