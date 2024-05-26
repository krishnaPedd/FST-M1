import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/ajax");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Home page title is :"+driver.getTitle());
        driver.findElement(By.className("violet")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        // Find and print the new text
        String text = driver.findElement(By.tagName("h1")).getText();
        System.out.println(text);
        WebElement initialLateText=driver.findElement(By.tagName("h3"));
        System.out.println("Initially late text is :"+initialLateText.getText());

        //Wait for delayed text
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"),"I'm late!"));
        WebElement ajaxLateText=driver.findElement(By.tagName("h3"));
        System.out.println("After Ajax is loaded the text is :"+ajaxLateText.getText());
        driver.close();
    }
    }

