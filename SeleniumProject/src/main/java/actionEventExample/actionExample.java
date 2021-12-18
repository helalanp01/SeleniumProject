package actionEventExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.testim.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		WebElement content = driver.findElementByClassName("//a[text()='Resources']");
		Actions action=new Actions(driver);
		action.moveToElement(content).perform();
		//driver.findElementByXPath("//a[text()='Articles']").click();
		//driver.findElementByXPath("").click();

	}

}
