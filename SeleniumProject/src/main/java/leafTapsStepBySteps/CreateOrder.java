package leafTapsStepBySteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOrder {

	public static void main(String[] args) {
		// set system property
		System.setProperty("", "");
		//create object
		ChromeDriver driver=new ChromeDriver();
		
		//
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		
		driver.findElementById("").click();
		
		//select Division
		WebElement ordersDivision = driver.findElementById("tag1");
		Select orderDd=new Select(ordersDivision);
		orderDd.selectByVisibleText("Small Business");
		
		//select department
		WebElement departmentOrder = driver.findElementById("tag2");
		Select departmentDd=new Select(departmentOrder);
		departmentDd.selectByValue("DPT_WAREHOUSE");
		
		//select activity drop down menu
		WebElement activityOrder=driver.findElementById("tag3");
		Select activityDd=new Select(activityOrder);
		activityDd.selectByIndex(5);
		
		//Click Add to Order button
		driver.findElementByClassName("smallSubmit").click();

	}

}
