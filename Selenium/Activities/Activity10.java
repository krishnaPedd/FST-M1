import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title is :"+driver.getTitle());
        WebElement dynamicCheckbox=driver.findElement(By.className("willDisappear"));
        WebElement toggleCheckBox=driver.findElement(By.id("toggleCheckbox"));
        toggleCheckBox.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("willDisappear")));
        System.out.println("checkbox is displayed: "+dynamicCheckbox.isDisplayed());
        toggleCheckBox.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println("Checkbox is displayed: " + dynamicCheckbox.isDisplayed());
        driver.findElement(By.xpath("//input[@class='willDisappear']")).click();
       // driver.close();
    }
}
