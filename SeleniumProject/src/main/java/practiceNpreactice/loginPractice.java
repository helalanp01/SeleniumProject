package practiceNpreactice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class loginPractice {

	public static void main(String[] args) {

		// launch browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");

		// Creating object
		ChromeDriver login = new ChromeDriver();

		// load URL
		login.get("http://leaftaps.com/opentaps/control/login");

		// maximize leaptaps window
		login.manage().window().maximize();

		// implicitly wait
		login.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		// enter username
		// find username locator & TestData
		login.findElementById("username").sendKeys("DemoSalesManager");

		// enter password
		// find password's locator & TestData
		login.findElementById("password").sendKeys("crmsfa");

		// click login button
		// find login locator
		login.findElementByClassName("decorativeSubmit").click();

		// click crmsfa button
		// find crmsfa locator
		login.findElementByLinkText("CRM/SFA").click();
		
		//find how many link in crm/sfa page
		List divnumber=login.findElementsByTagName("div");
		int totaldivnum=divnumber.size();
		System.out.println("Div Number :"+totaldivnum);
		
		//click create button
		//find create locator
		login.findElementByLinkText("Create Lead").click();
		
		//enter test data in company field
		login.findElementById("createLeadForm_companyName").sendKeys("ABC");
		
		// enter test data in first name
		login.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		//enter test data in last name
		login.findElementById("createLeadForm_lastName").sendKeys("Malini");
		
		//Create button
		login.findElementByName("submitButton").click();
		
		//back to home
		login.findElementByLinkText("My Home").click();
		
		//Create acc name
		login.findElementByLinkText("Create Account").click();
		
		//enter test data in acc number
		login.findElementById("accountName").sendKeys("8000");
		
		//click create account
		login.findElementByClassName("smallSubmit").click();
		
		//enter test data in create contact
		login.findElementById("firstNameField").sendKeys("Hema");
		
		//click create contact button
		login.findElementByClassName("lastNameField").sendKeys("ahmed");
		
		//
		login.findElementByName("submitButton").click();
		
		
		
		
		

	}

}
