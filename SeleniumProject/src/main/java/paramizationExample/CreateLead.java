package paramizationExample;

import org.testng.annotations.Test;

public class CreateLead extends ParameterExample {
@Test
public void lead() {
	driver.findElementByLinkText("Create Lead").click();
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
}
}
