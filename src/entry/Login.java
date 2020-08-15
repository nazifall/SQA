package entry;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String url = "https://bongobd.com/login";
  System.setProperty("webdriver.chrome.driver","C:\\sel\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  
  System.out.println("opening the url"   +url);
  driver.get(url);
  
  System.out.println("The title is " +driver.getTitle());
  
  driver.findElement(By.id("phoneNumberInput")).sendKeys("01717844599");
  
	}

}
