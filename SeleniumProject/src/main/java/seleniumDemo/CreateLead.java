package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
		
		//Create object of chrome driver
		ChromeDriver driver=new ChromeDriver();
		
		//Load Url
		driver.get("http://leaftaps.com/opentaps");
		
		//maximize Browser
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click Create Lead link
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		
		//Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		//Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		
		//Enter Title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms");
		
		//Enter Description
		driver.findElementById("createLeadForm_description").sendKeys("TCS");
		
		//Enter Country Code
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
		
		//EnterDepartment
		driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
		
		//Enter Number Of Employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		
		//createLeadForm_numberEmployees
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
		
		//Enter Zip/Postal Code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
		
		//Enter phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456");
		
		//Enter email address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
		
		//Click create lead Button
		driver.findElementByClassName("smallSubmit").click();
		
		//thread wait
		Thread.sleep(5000);
		
		//browser close
		driver.close();
		

	}

}
