package leafTapsProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsWholeProjects {
	

	public static void main(String[] args) {
		
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\SeleniumProject\\hel\\chromedriver.exe");
		
		//Creating Object of Chrome Driver
		ChromeDriver driver=new ChromeDriver();
		
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
		
		//Click My Home
		driver.findElementByLinkText("My Home").click();
		
		//click create Lead Button
		driver.findElementByLinkText("Create Lead").click();
		
		
		//Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		
		//Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		//Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		
		//Enter Title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
		
		//Enter Description
		driver.findElementById("createLeadForm_description").sendKeys("TCS");
		
		//Enter Country Code
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
		
		//EnterDepartment
		driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
		
		//Enter Number Of Employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		
		//Enter Web Url
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
		
		//Enter Zip/Postal Code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
		
		//Enter phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456");
		
		//Enter email address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
		
		//Click Create lead
		driver.findElementByClassName("smallSubmit").click();
		
		//Click Find Leads
		driver.findElementByLinkText("Find Leads").click();
		
		//click Name and ID
		//driver.findElementByLinkText("Name and ID").click();
		
		//enter lead id
		//driver.findElementByName("id").sendKeys("13633");
		
		//enter first name
		//driver.findElementByName("firstName").sendKeys("Hema");
		
		//enter last name
		//driver.findElementByName("lastName").sendKeys("Mali");
		
		//company name
		//driver.findElementByName("companyName").sendKeys("TCS");
		
		//click find lead button
		//driver.findElementByLinkText("Find Leads").click();
		
		

	}

}
