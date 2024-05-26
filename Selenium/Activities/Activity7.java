import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("title name is :"+driver.getTitle());
        WebElement ballImage=driver.findElement(By.xpath("//img[@id='draggable']"));
        WebElement target1=driver.findElement(By.xpath("//div[@id='droppable']"));
        WebElement target2=driver.findElement(By.xpath("//div[@id='dropzone2']"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(ballImage).moveToElement(target1).pause(1000).release().build().perform();
        String droppedMsg1=target1.findElement(By.tagName("p")).getText();
        if(droppedMsg1.equals("Dropped!"))
         System.out.println("Football dropped successfully to zone1");
        actions.dragAndDrop(ballImage,target2).build().perform();
        String droppedMsg2=target2.findElement(By.tagName("p")).getText();
        if(droppedMsg2.equals("Dropped!"))
            System.out.println("Football dropped successfully to zone2");
        driver.close();

    }
}
