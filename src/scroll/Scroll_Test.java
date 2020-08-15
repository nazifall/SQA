package scroll;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xpath.internal.operations.Bool;


public class Scroll_Test {
	private static ChromeDriver driver;
    String element;
    String ip;
@BeforeClass
    public static void openBrowser(){
	 System.setProperty("webdriver.chrome.driver","C:\\sel\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
} 

      @Test
    public void valid_scroll() {

System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
driver.get("https://bongobd.com/login");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div")).click();

//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div")).click();
 driver.findElement(By.xpath("//li[text()='Andorra']")).click();
//ip = driver.findElement(By.xpath("//li[text()='Andorra']")).getText();

	 element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div/div[2]/div[1]/div")).getText();
	 
	    
	 	 
Assert.assertEquals(element,"Andorra +376");
	 	      System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 	     }


      
@AfterClass
public static void closeBrowser(){
driver.quit();
}
}
//*[@id="root"]/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div



