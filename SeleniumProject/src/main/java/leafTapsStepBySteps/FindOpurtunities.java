package leafTapsStepBySteps;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindOpurtunities {

	public static void main(String[] args) {
		// 
		System.setProperty("", "");
		ChromeDriver driver=new ChromeDriver();
		driver.findElementByName("leafTapsStepBySteps").sendKeys("");
		
		//
		
		//
		
		//
		driver.findElementByName("findAll").click();
		driver.findElementByLinkText("Find Opportunities").click();

	}

}
