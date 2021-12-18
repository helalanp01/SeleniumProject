package hijiBijiCreateLead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends InheritanceInfo{
@Test
public void createLead() {
	//click create lead 
			driver.findElementByLinkText("Create Lead").click();
			
			//enter company name
			driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
			
			//enter first name
			driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
			
			//enter last name
			driver.findElementById("createLeadForm_lastName").sendKeys("Chowdhury");
		//select Source drop down mwnu
			WebElement source = driver.findElementById("createLeadForm_dataSourceId");
			
			//create object of Select class and pass variable
			Select sourceDropDown=new Select(source);
			
			//call selectByVisible method
			sourceDropDown.selectByVisibleText("Public Relations");
			
			//Enter local name
			driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Mohammed");
			
			//Enter Salutation field in Data
			driver.findElementById("createLeadForm_personalTitle").sendKeys("Chowdhury");
			
			//enter test data in Title field
			driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr.");
			
			//enter anual revenue data
			driver.findElementById("createLeadForm_annualRevenue").sendKeys("12000");
			
			//Select Industy data and store in variable
			WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
			
			//create a class of Select class and pass webelement value
			Select industryDropDown=new Select(industry);
			//call select method 
			industryDropDown.selectByValue("IND_HARDWARE");
			
			//Select oenership data and store in variable
			WebElement ownership=driver.findElementById("createLeadForm_ownershipEnumId");
			
			//create a class of Select class and pass web element value
			Select ownershipDropDown=new Select(ownership);
			//call select method 
			ownershipDropDown.selectByIndex(3);
			
			//enter sic code
			driver.findElementById("createLeadForm_sicCode").sendKeys("48");
			
			driver.findElementById("createLeadForm_description").sendKeys("Most of part I fill up");
			
			driver.findElementById("createLeadForm_importantNote").sendKeys("Please Keep a note that u have to finish as soon as possible");
			
			driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+088");
			
			driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("01710");
			
			driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("016");
			
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("zahra@yahoo.com");
			
			driver.findElementById("createLeadForm_generalToName").sendKeys("Mahfuz");
			
			driver.findElementById("createLeadForm_generalAddress1").sendKeys("23456 Renshaw");
			
			driver.findElementById("createLeadForm_generalCity").sendKeys("Troy");
			
			driver.findElementById("createLeadForm_generalPostalCode").sendKeys("48085");
			
			driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("87");
			
			WebElement MKT = driver.findElementById("createLeadForm_marketingCampaignId");
			Select MKTDropDown=new Select(MKT);
			MKTDropDown.selectByVisibleText("Catalog Generating Marketing Campaigns");
			
			WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			
			Select stateDropDown=new Select(state);
			stateDropDown.selectByVisibleText("Alaska");
			
			WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
			
			Select coutryDropDown=new Select(country);
			coutryDropDown.selectByVisibleText("India");
			
			
			driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Islam");
			driver.findElementById("createLeadForm_departmentName").sendKeys("Grocery");
			
			WebElement Currency = driver.findElementById("createLeadForm_currencyUomId");
			Select CurrencyDropDown=new Select(Currency);
			CurrencyDropDown.selectByValue("GBP");
			
			
			
			
			driver.findElementById("createLeadForm_numberEmployees").sendKeys("50");
			
			driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("2484347251");
			
			driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("M");
			
			driver.findElementById("createLeadForm_tickerSymbol").sendKeys("@#56");
			
			driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.facebook.com");
			driver.findElementById("createLeadForm_generalAttnName").sendKeys("stand up");
			driver.findElementById("createLeadForm_generalAddress2").sendKeys("42354 grobbel");
			
			
			//click create lead button
			driver.findElementByName("submitButton").click();
			
			//print title
					System.out.println(driver.getTitle());
					
					//waiting page
					//Thread.sleep(5000);
			
			//close browser
			//driver.close();
}
					@Test
					public void FindInfo() {
						driver.findElementByLinkText("Create Lead").click();
						driver.findElement(By.linkText("Find Leads")).click();
						driver.findElement(By.name("id")).sendKeys("125");
						driver.findElement(By.name("firstName")).sendKeys("Zahra");
						driver.findElement(By.name("lastName")).sendKeys("Islam");
						driver.findElement(By.name("companyName")).sendKeys("genisys");
						driver.findElement(By.linkText("Find Leads")).click();
					

		}
}

