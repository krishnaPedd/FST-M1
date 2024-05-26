import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("The page title is :"+driver.getTitle());
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement toggleCheckBox=driver.findElement(By.id("toggleCheckbox"));
        WebElement dynamicCheckBox=driver.findElement(By.id("dynamicCheckbox"));
        toggleCheckBox.click();
        //wait for the dynamic check box to disappear
        wait.until(ExpectedConditions.invisibilityOf(dynamicCheckBox));
        toggleCheckBox.click();
        //wait for the dynamic check box to appear
        wait.until(ExpectedConditions.visibilityOf(dynamicCheckBox));
        System.out.println("Checkbox  display status is :"+dynamicCheckBox.isDisplayed());
        driver.close();
    }
}
