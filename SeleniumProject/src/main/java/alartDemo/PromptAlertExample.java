package alartDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		String titlemgs = driver.getTitle();
		System.out.println(titlemgs);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		//Mamun bhai I did not understand below code
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//body[@contenteditable='false']/button").click();
		
		String alertmgs = driver.switchTo().alert().getText();
		System.out.println(alertmgs);
		//driver.switchTo().alert().accept();
		Alert alertmg=driver.switchTo().alert();
		alertmg.dismiss();

	}

}
