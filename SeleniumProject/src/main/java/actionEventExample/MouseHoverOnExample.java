package actionEventExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class MouseHoverOnExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		WebElement content = driver.findElementByClassName("menulink");
		Actions action=new Actions(driver);
		action.moveToElement(content).perform();
		driver.findElementByXPath("//a[text()='Articles']").click();
		//driver.findElementByXPath("").click();
		
		
		
		
		

	}
	
	

	

}
