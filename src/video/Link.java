package video;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;


public class Link {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\sel\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  //Maximizes the browser window
		  driver.manage().window().maximize() ;
		 driver.get("https://bongobd.com/");
		  
		  
		driver.findElement(By.xpath("//a[@href='/watch/g6Pr8ygLM5W']")).click();
		  //driver.get("https://bongobd.com/watch/uigRfW1O57r");
		  Thread.sleep(50000); //it will wait 50 seconds because maximum ad limit is 20 seconds
		  driver.findElement(By.xpath("//*[@id=\"vid1\"]/div[4]/button[2]")).click(); //play button xpath
		  
		
          
	}
}

