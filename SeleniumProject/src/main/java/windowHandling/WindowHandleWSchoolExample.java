package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWSchoolExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		//System.out.println(windowHandles);
		for
			(String ref:windowHandles) {
			 System.out.println(ref);
			 driver.switchTo().window(ref);
			 System.out.println(driver.getTitle());
			
		}

	}

}
