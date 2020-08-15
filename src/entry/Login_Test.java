package entry;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {
	private static ChromeDriver driver;
	 WebElement element;
	 
	 @BeforeClass
	     public static void openBrowser(){
		 System.setProperty("webdriver.chrome.driver","C:\\sel\\chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 } 
	 
	 @Test
	     public void valid_login(){
	 
	 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 driver.get("https://bongobd.com/login");
	 driver.findElement(By.id("phoneNumberInput")).sendKeys("01717844599");
	      try{
	 element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div/div[2]/button/span[1]"));
	 }
	      catch (Exception e){
	 	 }
	 	      Assert.assertNotNull(element);
	 	      System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 	     }
	 
	 @AfterClass
	 public static void closeBrowser(){
	 driver.quit();
	 }
	 }
	 
	 
				

