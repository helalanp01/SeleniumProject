package seleniumDemo_one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCromeBrowser {

	public static void main(String[] args) throws InterruptedException  {
		
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		
		//Creating object of chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the browser
		driver.manage().window().maximize();
		
		//print Title of Home page
		System.out.println(driver.getTitle());
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		
		//check logo
		//System.out.println(driver.findElementById("logo"));
		
		//input username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//input Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click crmfsa Button
		driver.findElementById("label").click();
		
		// click Home Button
		driver.findElementByLinkText("My Home").click();
		
		//Click Create lead button
		driver.findElementByPartialLinkText("Create Lead").click();
		
		//click Create Account button
		//driver.findElementByPartialLinkText("Create Account").click();
		
		//click Create Contact button
		//driver.findElementByPartialLinkText("Create Contact").click();
		
		
		//click lead button
		driver.findElementByLinkText("Leads").click();
		
		// click Contacts button
		driver.findElementByLinkText("Contacts").click();
		
		driver.findElementByLinkText("Accounts").click();
		
		driver.findElementByLinkText("Cases").click();
		
		driver.findElementByLinkText("Activities").click();
		
		driver.findElementByLinkText("Opportunities").click();
		
		driver.findElementByLinkText("Quotes").click();
		
		driver.findElementByLinkText("Orders").click();
		
		driver.findElementByLinkText("Forecasts").click();
		
		driver.findElementByLinkText("Marketing").click();
		
		driver.findElementByLinkText("Partners").click();
		
		driver.findElementByLinkText("Teams").click();
		
		driver.findElementByLinkText("Reports").click();
		
		driver.findElementByLinkText("opentaps").click();
		
		driver.findElementByLinkText("My Leads").click();
		Thread.sleep(10000);
		
		driver.findElementByLinkText("").click();
		
		driver.findElementByLinkText("").click();
		
		
		// log out button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//long wait
		Thread.sleep(10000);
				
		//Close Browser
		driver.close();
		
		
		
}
}
