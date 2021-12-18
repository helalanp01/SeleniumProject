package practiceNpreactice;

import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmericaOpenAccAdvantageRelationship {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()='Open an Account']").click();
		driver.findElementByXPath("(//div[@class='cta cta'])[1]").click();
		driver.findElementByXPath("(//a[@class='open-cta'])[1]");
		driver.findElementByXPath("(//a[@class='open-cta'])[2]");
		driver.findElementByXPath("(//a[@class='open-cta'])[3]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("48091");

	}

}
