package leafTapsStepBySteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateCase {

	public static void main(String[] args) {
		System.setProperty("", "");
		ChromeDriver driver=new ChromeDriver();
		
		//
		
		//
		
		// select priority
		WebElement priorityCase=driver.findElementById("createCaseForm_priority");
		Select casedd=new Select(priorityCase);
		casedd.selectByVisibleText("Critical (1)");
		
		//select type
		WebElement typeCase=driver.findElementById("createCaseForm_custRequestTypeId");
		Select typeDd=new Select(typeCase);
		typeDd.selectByVisibleText("Request For Information");
		
		//select reason option
		WebElement reasonCase = driver.findElementById("createCaseForm_custRequestCategoryId");
		Select reasonDd=new Select(reasonCase);
		reasonDd.selectByVisibleText("Instructions not clear");
		
		
		driver.findElementById("createCaseForm_custRequestName").sendKeys("");
		driver.findElementById("createCaseForm_description").sendKeys("");
		driver.findElementById("createCaseForm_note").sendKeys("");
		
		//Click create case button
		driver.findElementByName("submitButton").click();

	}

}
