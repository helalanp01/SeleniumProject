package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.7-eleven.com/");
		driver.findElement(By.xpath("main-menu-item-2")).click();
		//Set<String> windowHandles = driver.getWindowHandles();
		
		
		

	}

}
