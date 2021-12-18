package hijiBijiCreateLead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InheritanceInfo {
	public ChromeDriver driver;
	@BeforeMethod
	public void login() {
		//Launch Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\SeleniumProject\\hel\\chromedriver.exe");
				
				//Creating Object of Chrome Driver
				 driver=new ChromeDriver();
				
				//load Url of Leaftaps
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//maximize Browser
				driver.manage().window().maximize();
				
				//implicitly wait
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//enter user name
				driver.findElementById("username").sendKeys("DemoSalesManager");
				
				//enter password
				driver.findElementById("password").sendKeys("crmsfa");
				
				//click login Button
				driver.findElementByClassName("decorativeSubmit").click();
				
				//click crmsfa button
				driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void CloseBrowser() {
	 driver.close();
	}
}
