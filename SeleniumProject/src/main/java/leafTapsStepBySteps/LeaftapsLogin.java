package leafTapsStepBySteps;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLogin {

	public static void main(String[] args) {
		
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		
		//creating object
		ChromeDriver driver=new ChromeDriver();
		
		//load URL
		driver.get("http://leaftaps.com/opentaps/control/logout");
		
		//Enter user name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//print title
		System.out.println(driver.getTitle());
		
		//close browser
		driver.close();

	}

}
