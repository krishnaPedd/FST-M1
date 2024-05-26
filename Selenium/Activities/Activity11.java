import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title is :"+driver.getTitle());
        //Select the checkbox
        WebElement checkBox=driver.findElement(By.name("toggled"));
        checkBox.click();
        System.out.println("checkbox selected status is: "+checkBox.isSelected());
        //Deselct the check box
        checkBox.click();
        System.out.println("checkbox selected status is: "+checkBox.isSelected());
        driver.quit();
    }
}
