package leafTapsStepBySteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Quote {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		//
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//''''''''
		//'''
		//'''''''
		WebElement pstore = driver.findElementById("productStoreId");
		Select storedd=new Select(pstore);
		storedd.selectByVisibleText("Amazon.com Integration Store");
		
		//
		WebElement sales = driver.findElementById("salesChannelEnumId");
		Select saledd=new Select(sales);
		storedd.selectByVisibleText("POS Channel");

	}

}
