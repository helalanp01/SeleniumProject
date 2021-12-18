package alartDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlartExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		boolean display=driver.findElementByXPath("//button[text()='Click for JS Prompt']").isDisplayed();
		String promptmgs = driver.switchTo().alert().getText();
		System.out.println(promptmgs);
		System.out.println(display);
		driver.switchTo().alert().sendKeys("I am selenium learner");
		Thread.sleep(5000);
		//System.out.println(driver.switchTo().alert().sendKeys("I am selenium learner"));
		driver.switchTo().alert().accept();
		
		

	}

}
