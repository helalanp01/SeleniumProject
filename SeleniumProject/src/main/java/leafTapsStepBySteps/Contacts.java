package leafTapsStepBySteps;

import org.openqa.selenium.chrome.ChromeDriver;

public class Contacts {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\new driver\\chromedriver.exe");
		
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
		
		//click create lead 
		driver.findElementByLinkText("Create Lead").click();
		
		//enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
		
		//enter first name
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		//enter last name
		driver.findElementById("createLeadForm_lastName").sendKeys("Chowdhury");
		
		//click create lead button
		driver.findElementByName("submitButton").click();
		
		//click home page
		driver.findElementByLinkText("My Home").click();
		
		//click create account
		driver.findElementByLinkText("Create Account").click();
		
		//enter account name
		driver.findElementById("accountName").sendKeys("ABC");
		
		//click create account
		driver.findElementByClassName("smallSubmit").click();
		
		//click create contact
		driver.findElementByLinkText("Contacts").click();
		
		//print title
				System.out.println(driver.getTitle());
				
				//waiting page
				Thread.sleep(5000);
		
		//close browser
		driver.close();

	}

}
