package startWithInterface;

import org.testng.annotations.Test;

public class Tc_001 extends GenericsWrapper {
@Test
public void login() {
	launchBrowser("http://leaftaps.com/opentaps/control/main");
	//driver.get("http://leaftaps.com/opentaps/control/logout");
	enterById("username", "DemoSalesManager");
	enterById("password","crmsfa");
	clickByClassName("decorativeSubmit");
	clickByLinkText("CRM/SFA");
	clickByLinkText("Create Lead");
	enterById("createLeadForm_companyName", "ABC");
	enterById("createLeadForm_firstName", "Hema");
	enterById("createLeadForm_lastName", "Chowdhury");
	DropSelectByvisibleText("createLeadForm_dataSourceId");
	enterById("createLeadForm_firstNameLocal", "Mohammed");
	enterById("createLeadForm_personalTitle", "Chowdhury");
	enterById("createLeadForm_generalProfTitle", "Mr.");
	enterById("createLeadForm_annualRevenue", "12000");
	enterById("createLeadForm_industryEnumId", "Alaska");
	DropSelectByvalue("");
	enterById("createLeadForm_sicCode","48");
	enterById("createLeadForm_description","Most of part I fill up");
	
	enterById("createLeadForm_importantNote","Please Keep a note that u have to finish as soon as possible");
	
	enterById("createLeadForm_primaryPhoneCountryCode","+088");
	
	enterById("createLeadForm_primaryPhoneAreaCode","01710");
	
	enterById("createLeadForm_primaryPhoneExtension","016");
	
	enterById("createLeadForm_primaryEmail","zahra@yahoo.com");
	
	enterById("createLeadForm_generalToName","Mahfuz");
	
	enterById("createLeadForm_generalAddress1","23456 Renshaw");
	
	enterById("createLeadForm_generalCity","Troy");
	
	enterById("createLeadForm_generalPostalCode","48085");
	
	enterById("createLeadForm_generalPostalCodeExt","87");
	
	
	enterById("createLeadForm_primaryPhoneNumber","2484347251");
	
	enterById("createLeadForm_primaryPhoneAskForName","M");
	
	enterById("createLeadForm_tickerSymbol","@#56");
	
	enterById("createLeadForm_currencyUomId", "");
	DropSelectByvisibleText("GBP");
	enterById("createLeadForm_generalStateProvinceGeoId", "Usa");
	DropSelectByvisibleText("createLeadForm_generalStateProvinceGeoId","Alaska");
	//DropSelectByvisibleText("India");
	
	enterById("createLeadForm_primaryWebUrl","www.facebook.com");
	enterById("createLeadForm_generalAttnName","stand up");
	enterById("createLeadForm_generalAddress2","42354 grobbel");
	clickByName("submitButton");
	
	//print title
			System.out.println(driver.getTitle());
}
}
