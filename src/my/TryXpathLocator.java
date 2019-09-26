package my;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryXpathLocator {
public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        invokeCh();
        driver.get("http://skyscanner.com");
      //  driver.findElement(By.name("firstname")).sendKeys("MEHMET");
       // driver.findElement(By.name("lastname")).sendKeys("KOrtak");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
    public static void invokeCh(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();

    }
}
