package seleniumDemo_one;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapsTesting {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
	
	//Creating object
	ChromeDriver driver=new ChromeDriver();
	
	//Load URL
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//maximize browser
	driver.manage().window().maximize();
	
	//implicitly browser
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.getTitle();
	System.out.println(driver.getTitle());
	
	//login button
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	//Password
	driver.findElementById("password").sendKeys("crmsfa");
	
	//click login button
	driver.findElementByClassName("decorativeSubmit").click();
	
	//print after login page
	System.out.println(driver.getTitle());
	
	//Click CRM/SFA
	driver.findElementByLinkText("CRM/SFA").click();
	
	//click Leads link
	driver.findElementByLinkText("Leads").click();
	
	//click create lead link
	driver.findElementByLinkText("Create Lead").click();
	
	//click request catalog 
	//driver.findElementByPartialLinkText("Request C").click();
	
	//enter company name
	driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
	
	// enter first name
	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	
	//enter last name
	driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
	
	// enter first name local
	driver.findElementById("createLeadForm_firstNameLocal").sendKeys("H");
	
	//enter Title
	driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");
	
	//find source element and store 
	WebElement src = driver.findElementById("createLeadForm_dataSourceId");
	
	//creating object of Select class
	Select srcdd=new Select(src);
	srcdd.selectByVisibleText("Direct Mail");
	
	//find element from industry field and store it with variable
	WebElement ind=driver.findElementById("createLeadForm_industryEnumId");
	
	//Create select obj of select class
	Select inddd=new Select(ind);
	inddd.selectByValue("IND_DISTRIBUTION");
	
	//find element of ownerShip
		WebElement ownership=driver.findElementById("createLeadForm_ownershipEnumId");
		
		//create object of Select class
		Select owndd=new Select(ownership);
		//call drop down select method
		owndd.selectByIndex(6);
		
		//find element of marketing and store with variable
		WebElement mkt=driver.findElementById("createLeadForm_marketingCampaignId");
		
		//Creating object of Select class
		Select mktdd=new Select(mkt);
		mktdd.selectByVisibleText("Car and Driver");
		
		//find id from currency and store it
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		//Creating object of Select class
		Select curdd=new Select(currency);
		curdd.selectByValue("DZD");
		
		//find element of state field and store 
		WebElement states = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		
		//Create object of Select Class
		Select statedd=new Select(states);
		statedd.selectByIndex(10);
		
		//find element of country
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		//creating object of select class
		Select countrydd=new Select(country);
		countrydd.selectByValue("BGD");
	
	//click creat lead button
	driver.findElementByName("submitButton").click();
	
	
	
	//how many link in this web page
	List<WebElement> listofUl = driver.findElementsByTagName("a");
	
	int TotalUl = listofUl.size();
	
	
	System.out.println(TotalUl);
	
	List<WebElement> listofA = driver.findElementsByTagName("a");
	
	
	
	
	

	
	
	//wait browser
	Thread.sleep(5000);
	
	//WebElement listoflink=driver.findElementByTagName("a");
	//System.out.println(listoflink);
	
	//log out
	
	//wait browser after log out
		//Thread.sleep(5000);
	
	
		
	//Browser Close
	driver.close();
	}

}
