package practiceNpreactice;

import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmerica {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//span[text()='Checking'])[1]");//.click();
		driver.findElementByXPath("(//span[text()='Banking'])[1]").click();
		driver.findElementByXPath("(//a[text()='Credit Cards'])");//.click();
		driver.findElementByXPath("//span[text()='Loans']");//.click();
		driver.findElementByXPath("//span[text()='Investments']");//.click();
		driver.findElementByXPath("//span[text()='Learning']").click();
		driver.findElementByXPath("//img[contains(@title,'Low rates—act now.  Want a low-rate auto loan? Do')]");
		driver.findElementByXPath("//img[contains(@title,'O')]").click();
		//driver.findElementByXPath("//input[contains(@placeholder,'Online ID')]").sendKeys("helal");

	}

}
