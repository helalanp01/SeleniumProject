package leafTapsStepBySteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findsLead {

	public static void main(String[] args) {
		System.setProperty("", "");
		//
		ChromeDriver driver=new ChromeDriver();
		driver.findElementByName("id").sendKeys("");
		//
		driver.findElementByName("firstName").sendKeys("");
		
		//
		driver.findElementByName("lastName").sendKeys("");
		
		//
		driver.findElementByName("companyName").sendKeys("");
		//
		driver.findElementByLinkText("Find Leads").click();

	}
	public void Phone() {
		ChromeDriver lead=new ChromeDriver();
		lead.findElementByName("phoneAreaCode").sendKeys("");
		lead.findElementByName("phoneNumber").sendKeys("");
	}
	public void email() {
		ChromeDriver lead_email=new ChromeDriver();
		lead_email.findElementByName("emailAddress").sendKeys("");
		
		//
		lead_email.findElementByLinkText("Find Leads").click();
		
	}
	public void advance() {
		ChromeDriver lead_Advance=new ChromeDriver();
		//toName
		lead_Advance.findElementByName("toName");
		//
		lead_Advance.findElementByName("attnName");
		//
		lead_Advance.findElementByName("address");
		
		//
		lead_Advance.findElementByName("city");
		
		//Country
		
		//State
		
		//
		lead_Advance.findElementByName("postalCode");
		//
		lead_Advance.findElementByLinkText("Find Leads").click();
	}

}
