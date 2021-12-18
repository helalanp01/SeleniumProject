package sevenEleven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SevenElevenHomePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.7-eleven.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//hover on food button
		WebElement foodButton = driver.findElementByXPath("//li[@id='main-menu-item-0']/a");
		Actions action=new Actions(driver);
		action.moveToElement(foodButton).perform();
		Thread.sleep(5000);
		
		//WebElement getInfo = driver.findElementByXPath("//div[@class='cta']/a");
		
		//String learnmgs=getInfo.getText().toString();
		//System.out.println(getInfo.getText());
		
		//driver.findElementByXPath("//h1[text()='Bakery']").click();
		//Thread.sleep(5000);
		
		//hover on drinks button
		/*WebElement drinksButton = driver.findElementByXPath("//li[@id='main-menu-item-1']/a");
		action.moveToElement(drinksButton).perform();
		Thread.sleep(5000);
		
		// hover on rewards button
		WebElement rewardsButton = driver.findElementByXPath("//li[@id='main-menu-item-2']/a");
		action.moveToElement(rewardsButton).click().perform();
		Thread.sleep(5000);
		
		//click order delivery button
		driver.findElementByXPath("//li[@id='main-menu-item-3']/a").click();*/
		

	}

}
