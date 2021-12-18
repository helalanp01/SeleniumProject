package startWithInterface;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericsWrapper implements WrapperClassDemo {
public ChromeDriver driver;
public void launchBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\SeleniumProject\\hel\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println("SuccessFull");
}
	public void enterById(String locator, String data) {
		driver.findElementById(locator).sendKeys(data);
		
	}

	public void enterByName(String locator, String data) {
		driver.findElementByName(locator).sendKeys(data);
		
	}

	public void enterByClassName(String locator, String data) {
		driver.findElementByClassName(locator).sendKeys(data);
		
	}

	public void enterByTagName(String locator, String data) {
		driver.findElementByTagName(locator).sendKeys(data);
		
	}

	public void enterByLinkText(String locator, String data) {
		driver.findElementByLinkText(locator).sendKeys(data);
		
	}

	public void enterByPartialLinkText(String locator, String data) {
		driver.findElementByPartialLinkText(locator).sendKeys(data);
		
	}

	public void enterByCSSSelector(String locator, String data) {
		driver.findElementByCssSelector(locator).sendKeys(data);
		
	}

	public void enterByXpath(String locator, String data) {
		driver.findElementByXPath(locator).sendKeys(data);
		
	}

	public void clickById(String locator) {
		driver.findElementById(locator).click();
		
	}

	public void clickByName(String locator) {
		driver.findElementByName(locator).click();
		
	}

	public void clickByClassName(String locator) {
		driver.findElementByClassName(locator).click();
		
	}

	public void clickByTagName(String locator) {
		driver.findElementByTagName(locator).click();
		
	}

	public void clickByLinkText(String locator) {
		driver.findElementByLinkText(locator).click();
		
	}

	public void clickByPartialLinkText(String locator) {
		driver.findElementByPartialLinkText(locator).click();
		
	}
	

	public void simpleAlertAccept(String locator) {
		driver.switchTo().alert().accept();
		
	}

	public void simpleAlertDismiss() {
		
		driver.switchTo().alert().dismiss();
	}

	public void simpleAlertText() {
		String mgs=driver.switchTo().alert().getText();
		System.out.println(mgs);
	}

	public void simpleAlertSend() {
		// TODO Auto-generated method stub
		
	}

	public void simpleAlertConfermation() {
		String confermationMgs=driver.switchTo().alert().getText();
		System.out.println(confermationMgs);
		
	}

	public void simpleAlertPrompt() {
		// TODO Auto-generated method stub
		
	}

	public void DropSelectByIndex(int value) {
		WebElement src = driver.findElementById("dataSourceId");
		Select srcdpdw=new Select(src);
		srcdpdw.selectByIndex(10);
		
	}

	public void DropSelectByvalue(int value,String data)  {
		WebElement ownerShip = driver.findElementByName("ownershipEnumId");
		//Creating obj of Select Class
		Select owndpdw=new Select(ownerShip);
		owndpdw.selectByValue("OWN_SCORP");
	}

	public void DropSelectByvisibleText(String data) {
		WebElement industry = driver.findElementByName("industryEnumId");
		//Creating obj of Select class
		Select inddpdw=new Select(industry);
		inddpdw.selectByVisibleText("Distribution");
	}

	public void switchToFrameIndex(int value) {
		// TODO Auto-generated method stub
		
	}

	public void switchToFrameName(String data) {
		Set<String> windowHandles = driver.getWindowHandles();
		//System.out.println(windowHandles);
		for
			(String ref:windowHandles) {
			 System.out.println(ref);
			 driver.switchTo().window(ref);
		
	}
	}

	public void Id(String data) {
		// TODO Auto-generated method stub
		
	}

	
	public void clickXpath(String locator) {
		// TODO Auto-generated method stub
		
	}
	public void DropSelectByvalue(String data) {
		// TODO Auto-generated method stub
		
	}
	public void DropSelectByvisibleText(String id, String data) {
		// TODO Auto-generated method stub
		
	}
	public void closeBrowser() {
		driver.close();
	}
	

	
}
