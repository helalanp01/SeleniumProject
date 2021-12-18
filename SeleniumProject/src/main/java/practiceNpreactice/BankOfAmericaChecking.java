package practiceNpreactice;

import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmericaChecking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//span[@class='title'])[1]");
		driver.findElementByXPath("(//span[@class='title'])[2]").click();
		driver.findElementByXPath("//a[@id='rewardsSavingsAccount']");//.click();
		driver.findElementByXPath("//a[@id='childSavingsAccount']").click();
		driver.findElementByXPath("//a[@id='go-button-zip-modal']").click();

	}

}
