package leafTapsStepBySteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WriteEmail {

	public static void main(String[] args) {
		//
		System.setProperty("", "");
		//
		ChromeDriver driver=new ChromeDriver();
		
		//
		WebElement fromWriteEmail = driver.findElementById("fromEmailSelect");
		Select fromDd=new Select(fromWriteEmail);
		fromDd.selectByVisibleText("salesmanager@opentaps.org");
		
		
		
		driver.findElementById("toEmail").sendKeys("");
		
		
		driver.findElementByName("ccEmail").sendKeys("");
		driver.findElementByName("bccEmail").sendKeys("");
		driver.findElementByName("salesOpportunityId").sendKeys("");
		
		
		WebElement template = driver.findElementById("mergeFormId");
		Select templateDd=new Select(template);
		templateDd.selectByIndex(1);
		
		
		driver.findElementById("subject").sendKeys("");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		
		driver.findElementById("addButton").click();
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByClassName("smallSubmit").click();

	}

}
