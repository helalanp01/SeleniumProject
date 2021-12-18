package sevenEleven;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.7-eleven.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[@class='kampyle_button-text']")).click();
		//driver.findElement(By.xpath("//li[@id='main-menu-item-1']/a")).click();
		driver.findElement(By.xpath("//li[@id='main-menu-item-3']/a")).click();
		//String windowHandle = driver.getWindowHandle();
		//System.out.println(windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		//System.out.println(windowHandles);
		for(String tabhandle:windowHandles) {
			System.out.println(tabhandle);
			driver.switchTo().window(tabhandle);
			System.out.println(driver.getTitle());
		}
		//driver.findElement(By.xpath("//div[@class='kampyle_button-text']")).click();
		
		
		
		

	}

}
