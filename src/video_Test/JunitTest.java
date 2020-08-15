package video_Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
		


public class JunitTest {				

	private static ChromeDriver driver;
	 WebElement element;
	 
	 @BeforeClass
	     public static void openBrowser(){
		 System.setProperty("webdriver.chrome.driver","C:\\sel\\chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 } 
	 
	 @Test
	     public void valid_click(){
	 
	 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 driver.get("https://bongobd.com/");
	      driver.findElement(By.xpath("//a[@href='/watch/g6Pr8ygLM5W']")).click();
	      try{
	 element = driver.findElement(By.xpath("//*[@id=\"vid1\"]/button")); 
	 }catch (Exception e){
	 }
	      Assert.assertNotNull(element);
	      System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	     }
	
	 
	
	 @AfterClass
	 public static void closeBrowser(){
	 driver.quit();
	 }
	 
	 
	}				
        						
   
    
    

    

