import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Title is :"+driver.getTitle());
        Actions actions=new Actions(driver);
        // Perform left click
        actions.click().pause(1000). build().perform();
        String frontText=driver.findElement(By.className("active")).getText();
        System.out.println("front text is :"+frontText);

        //Perform double click
        actions.doubleClick().pause(1000).build().perform();
        frontText=driver.findElement(By.className("active")).getText();
        System.out.println("front text is :"+frontText);

        // Perform right click
        actions.contextClick().pause(1000).build().perform();
        frontText=driver.findElement(By.className("active")).getText();
        System.out.println("front text is :"+frontText);
        driver.close();
    }
}
;
