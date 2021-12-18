package seleniumxpathdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapsXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Enter username/password,and click login button
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();

		// click create lead button,create lead form page
		driver.findElementByXPath("//div[@id='label']/a").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		System.out.println(driver.findElementByXPath("//a[text()='Create Lead']").isDisplayed());
		// enter data
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Mamunllc");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		boolean display=driver.findElementByXPath("//input[@id='createLeadForm_firstName']").isSelected();
		System.out.println(display);

		// select source field
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		// WebElement source =
		// driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']/option[3]");
		Select sourcedd = new Select(source);
		sourcedd.selectByIndex(3);

		// Enter data
		driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("helal");
		driver.findElementByXPath("//input[@id='createLeadForm_personalTitle']").sendKeys("Mr");
		driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Dear");
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("50");

		// Select industry filed and owner ship dield
		// driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		// WebElement source =
		// driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']/option[3]");
		Select industryDd = new Select(industry);
		industryDd.selectByIndex(2);
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		// WebElement source =
		// driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']");
		Select ownershipDd = new Select(ownership);
		ownershipDd.selectByIndex(5);

		// enter data
		driver.findElementByXPath("//input[@name='sicCode']").sendKeys("15");
		driver.findElementByXPath("//textarea[@name='description']").sendKeys("I am learning selenium");
		driver.findElementByXPath("//textarea[@name='importantNote']").sendKeys("Keep concentrate");
		driver.findElementByXPath("//input[@id='createLeadForm_lastNameLocal']").sendKeys("H");

		// select marketing drop down menu
		// driver.findElementByXPath("//input[@id='createLeadForm_parentPartyId']").sendKeys("01");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Malini");
		// driver.findElementByXPath("createLeadForm_marketingCampaignId");
		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		// WebElement source =
		// driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']/option[3]");
		Select marketingDd = new Select(marketing);
		marketingDd.selectByIndex(2);

		driver.findElementByXPath("//input[@id='createLeadForm_birthDate']").sendKeys("10/03/2021");
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("Anthropology");

		// Select currency drop down menu
		// driver.findElementByXPath("//select[@id='createLeadForm_currencyUomId']");
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		// WebElement source =
		// driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']/option[3]");
		Select currencyDd = new Select(currency);
		currencyDd.selectByIndex(2);

		driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("120");
		driver.findElementByXPath("//input[@id='createLeadForm_tickerSymbol']").sendKeys("Access code");
		// enter contact info
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("1");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("248");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("2");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("helal_uni@yahoo.com");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("4347251");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAskForName']").sendKeys("Ask ssn no");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("www.google.com");
		// enter data of primary address
		driver.findElementByXPath("//input[@id='createLeadForm_generalToName']").sendKeys("helal");
		driver.findElementByXPath("//input[@id='createLeadForm_generalAddress1']").sendKeys("23939 ada ave");
		driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("Warren");
		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("48091");
		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCodeExt']").sendKeys("48094");
		driver.findElementByXPath("//input[@id='createLeadForm_generalAttnName']").sendKeys("Mr");
		driver.findElementByXPath("//input[@id='createLeadForm_generalAddress2']").sendKeys("23948");

		// driver.findElementByXPath("//select[@id='createLeadForm_generalStateProvinceGeoId']");
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		// WebElement source =
		// driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']/option[3]");
		Select stateDd = new Select(state);
		stateDd.selectByIndex(2);

		// driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']]");
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		// WebElement source =
		// driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']/option[3]");
		Select countryDd = new Select(country);
		countryDd.selectByIndex(25);

		// click create lead button
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		Thread.sleep(1000);
		
		driver.close();

	}

}
