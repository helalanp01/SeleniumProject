package cssSelectorExampleTestLeaf;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCssExample {

	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\helal\\chromedriver.exe");
		//create obj of ChromeDriver 
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//inspect username text field using css selector
		//enter data on text field
		driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager");
		//enter password in password text field
		driver.findElementByCssSelector("#password").sendKeys("crmsfa");
		//click login Button
		driver.findElementByCssSelector(".decorativeSubmit").click();
		//click sfa link
		driver.findElementByCssSelector("#label>a").click();
		//click home button
		driver.findElementByCssSelector(".x-panel-header>a").click();
		driver.findElementByTagName("a");
		
		
		
		
		/*driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");
		driver.findElementByCssSelector("");*/
	}

}
