package aaapractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AaaPractice {

public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\SeleniumProject\\hel\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	//driver.get("https://member.acg.aaa.com/mi.html");
	driver.get("https://member.acg.aaa.com/mi.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	WebElement stateid = driver.findElementById("stateId");
	Select selsectstate=new Select(stateid);
	selsectstate.selectByIndex(8);
	
	driver.findElementByXPath("//input[@placeholder='Zip Code']").sendKeys("48091");
	
	
	driver.findElementByXPath("//input[@id='go']").click();
	
	
	driver.findElementByXPath("//input[@value='Click here to Continue'][1]").click();
	driver.findElementByXPath("//img[@alt='AAA Auto Club Group']").click();
	Thread.sleep(5000);
	
	WebElement membership=driver.findElementByXPath("//a[text()='Membership']");
	
	Actions action=new Actions(driver);
	action.moveToElement(membership).perform();
	
	
	
	
	
	
	
	
	
	
	
}
}
