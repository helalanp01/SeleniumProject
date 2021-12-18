package leafTapsStepBySteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\SeleniumProject\\hel\\chromedriver.exe");
				
				//creating object
				ChromeDriver driver=new ChromeDriver();
				
				//load URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				
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
				
				//
				WebElement industry = driver.findElementByName("industryEnumId");
				//Creating obj of Select class
				Select inddpdw=new Select(industry);
				inddpdw.selectByVisibleText("Distribution");
				
				//
				WebElement ownerShip = driver.findElementByName("ownershipEnumId");
				//Creating obj of Select Class
				Select owndpdw=new Select(ownerShip);
				owndpdw.selectByValue("OWN_SCORP");
				
				//
				WebElement src = driver.findElementById("dataSourceId");
				Select srcdpdw=new Select(src);
				srcdpdw.selectByIndex(10);
				
				//
				WebElement iniTeam = driver.findElementById("initialTeamPartyId");
				Select itdpdw=new Select(iniTeam);
				itdpdw.selectByValue("DemoSalesTeam2");
				
				//
				WebElement precurrency = driver.findElementById("currencyUomId");
				Select pcdpdw=new Select(precurrency);
				pcdpdw.selectByValue("ALL");
				
				//
				WebElement mkt=driver.findElementById("marketingCampaignId");
				Select mktdpdw=new Select(mkt);
				
				WebElement country = driver.findElementById("generalCountryGeoId");
				Select cydpdw=new Select(country);
				cydpdw.selectByValue("USA");
				
				//
				WebElement state = driver.findElementById("generalStateProvinceGeoId");
				Select sdpdw=new Select(state);
				sdpdw.selectByVisibleText("Michigan");
				
				//click create account
				driver.findElementByClassName("smallSubmit").click();
				
				//print title
						System.out.println(driver.getTitle());
						
						//waiting page
						Thread.sleep(5000);
				
				//close browser
				driver.close();

	}

}
