package alartDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class MargeLeadAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//div[@id='label']/a").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		
		
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		
		String mgs = driver.switchTo().alert().getText();
		System.out.println(mgs);
		//driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		//driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		driver.switchTo().alert().dismiss();
		

	}

}
