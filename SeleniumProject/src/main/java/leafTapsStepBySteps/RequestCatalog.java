package leafTapsStepBySteps;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RequestCatalog {

	public static void main(String[] args) {
		// 
		System.setProperty("", "");
		ChromeDriver driver=new ChromeDriver();
		driver.findElementByName("firstName").sendKeys("");
		driver.findElementByName("lastName").sendKeys("");
		driver.findElementByName("companyName").sendKeys("");
		driver.findElementById("generalAddress1").sendKeys("");
		driver.findElementById("generalAddress2").sendKeys("");
		driver.findElementById("generalCity").sendKeys("");
		WebElement dD = driver.findElementById("generalStateProvinceGeoId");
		Select stateDd=new Select(dD);
		stateDd.selectByVisibleText("DC");
		
		driver.findElementById("generalPostalCode").sendKeys("");
		driver.findElementById("generalPostalCodeExt").sendKeys("");
		
		WebElement countryDd = driver.findElementById("generalCountryGeoId");
		Select countryDpDw=new Select(countryDd);
		countryDpDw.selectByVisibleText("Bangladesh");
		
		driver.findElementByName("primaryPhoneCountryCode");
		driver.findElementByName("primaryPhoneAreaCode");
		driver.findElementByName("primaryPhoneNumber");
		driver.findElementByName("primaryEmail");
		
		WebElement catalog = driver.findElementByClassName("selectBox");
		Select catalogDd=new Select(catalog);
		catalogDd.selectByValue("02");
		
		WebElement car = driver.findElementByClassName("selectBox");
		Select carDd=new Select(car);
		carDd.selectByIndex(3);
		
		driver.findElementByClassName("inputBox").sendKeys("");
		
		WebElement about = driver.findElementByName("marketingCampaignId");
		Select aboutDd=new Select(about);
		aboutDd.selectByValue("CATRQ_CARNDRIVER");
		
		driver.findElementByName("comments").sendKeys("");
		
		driver.findElementByClassName("smallSubmit").click();
		
		//go back
		//driver.findElementByClassName("tabletext").click();
		

	}

}
