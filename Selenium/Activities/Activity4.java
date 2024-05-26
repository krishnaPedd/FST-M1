import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("title is :"+driver.getTitle());
        //find Third Header on the page
        String thirdHeaderText=driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Third header name is :"+thirdHeaderText);
        String fifthHeaderColor=driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
        System.out.println("Fifth header color is :"+fifthHeaderColor);
        String className=driver.findElement(By.className("violet")).getAttribute("class");
        System.out.println("Violet button class name is :"+className);
        String greyBtnText=driver.findElement(By.className("grey")).getText();
        System.out.println("Grey button text is :"+greyBtnText);
        driver.close();

    }
}
