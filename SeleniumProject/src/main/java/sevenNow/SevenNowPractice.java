package sevenNow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SevenNowPractice {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.7now.com/home");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Address']")).sendKeys("48091");
		driver.findElement(By.xpath("//label[@class='address-head']")).click();
		driver.findElement(By.xpath("//button[@id='delivery']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Address']")).sendKeys("23939 ada ave ,warren,mi");

	}

}
