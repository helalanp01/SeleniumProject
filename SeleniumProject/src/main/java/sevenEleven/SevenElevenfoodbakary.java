package sevenEleven;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SevenElevenfoodbakary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.7-eleven.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//hover on food button
		WebElement foodButton = driver.findElementByXPath("//li[@id='main-menu-item-0']/a");
		Actions action=new Actions(driver);
		action.moveToElement(foodButton).perform();
		
		//driver.findElement(By.xpath("(//a[text()='Bakery'])[1]")).click();
		//WebElement foodcandy = driver.findElement(By.xpath("(//a[text()='Candy'])[1]"));
		//driver.findElement(By.xpath("(//a[text()='Ice Cream'])[1]"));
		//driver.findElement(By.xpath("(//a[text()='Fresh & Chilled'])[1]"));
		//driver.findElement(By.xpath("(//a[text()='Hot Foods'])[1]"));
		//driver.findElement(By.xpath("(//a[text()='Pizza'])[1]"));
		//driver.findElement(By.xpath("(//a[text()='Snacks'])[1]"));
		//driver.findElement(By.xpath("(//a[text()='Breakfast'])[1]"));
		//action.moveToElement(food).perform();
		//action.moveToElement(foodcandy);
				Thread.sleep(5000);

	}

}
