package scroll;

//import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Code {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String url = "https://bongobd.com/login";
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		System.out.println("opening the url" + url);
		driver.get(url);

		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div")).click();
		
		driver.findElement(By.xpath("//li[text()='Andorra']")).click();

	}

}
//*[@id="menu-"]/div[3]/ul/li[16]
