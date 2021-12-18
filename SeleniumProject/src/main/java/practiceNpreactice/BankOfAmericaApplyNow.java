package practiceNpreactice;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmericaApplyNow {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()='Open an Account']").click();
		driver.findElementByXPath("(//div[@class='cta cta'])[1]").click();
		driver.findElementByXPath("(//a[@class='open-cta'])[1]").click();
		
		//WebElement windowHandleOpenAcc 
		Set<String> windowHandleOpenAcc =driver.getWindowHandles();
		//System.out.println(windowHandleOpenAcc);
		for(String CDNum:windowHandleOpenAcc) {
			System.out.println(CDNum);
			driver.switchTo().window(CDNum);
			System.out.println(driver.getTitle());
			
		}
		
		

	}

}
