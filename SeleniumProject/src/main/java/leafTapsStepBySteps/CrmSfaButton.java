package leafTapsStepBySteps;

import org.openqa.selenium.chrome.ChromeDriver;

public class CrmSfaButton {

	public static void main(String[] args) {
		//Launch Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
				
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
				
				//click crmsfa Button
				driver.findElementByLinkText("CRM/SFA").click();
				
				//print title
				System.out.println(driver.getTitle());
				
				//close browser
				driver.close();

	}

}
