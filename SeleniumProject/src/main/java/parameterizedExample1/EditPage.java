package parameterizedExample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditPage extends parameterInheritance {
	@Test
	public void Edit() {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Genisys");
		driver.findElementById("createLeadForm_firstName").sendKeys("Zahra");
		WebElement src = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select list = new Select(src);
		list.selectByIndex(3);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Islam");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gucchu");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs.");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Loan");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100");
		WebElement ind=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select inds=new Select(ind);
		inds.selectByVisibleText("Media");
		WebElement owner=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership=new Select(owner);
		ownership.selectByIndex(5);
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("13");;
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is a destructive page");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Loan Officer");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("248");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1456");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("alexkur@genisys.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Mum");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("23939 ada ave");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Warren");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("48091");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("13");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2484648574");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Alex");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.genisys.com");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Hi");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("245856 garber");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("@");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("45");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Cloth");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Mejenda");
		// driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stsChoose = new Select(state);
		stsChoose.selectByValue("IL");
		driver.findElement(By.name("submitButton")).click();

	}
}
