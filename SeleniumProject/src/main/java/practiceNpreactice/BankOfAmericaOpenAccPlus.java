package practiceNpreactice;

import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmericaOpenAccPlus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()='Open an Account']").click();
		driver.findElementByXPath("(//div[@class='cta cta'])[1]").click();
		driver.findElementByXPath("(//a[@class='open-cta'])[1]");
		driver.findElementByXPath("(//a[@class='open-cta'])[2]").click();

	}

}
