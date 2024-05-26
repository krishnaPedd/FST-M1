import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity12 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title is :"+driver.getTitle());
        WebElement textField= driver.findElement(By.id("input-text"));
        System.out.println("Text field enabled status :"+ textField.isEnabled());
        WebElement inputToggle= driver.findElement(By.id("toggleInput"));
        inputToggle.click();
        System.out.println("Text field enabled status :"+ textField.isEnabled());


    }
}
