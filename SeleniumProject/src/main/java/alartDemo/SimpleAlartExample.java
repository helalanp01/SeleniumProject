package alartDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlartExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='searchBtn']").click();
		
		String mgs=driver.switchTo().alert().getText();
		System.out.println(mgs);
		Thread.sleep(2500);
		driver.switchTo().alert().accept();
		Thread.sleep(2500);
		driver.close();
		
		

	}

}
