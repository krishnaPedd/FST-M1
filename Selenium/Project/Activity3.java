import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        WebElement headerImage=driver.findElement(By.xpath("//img[contains(@src,'776615-e1569782235456-1024x271.jpg')]"));
        String imageURl=  headerImage.getAttribute("src");
        System.out.println("Image URL is :"+imageURl);
        driver.quit();
    }
}
