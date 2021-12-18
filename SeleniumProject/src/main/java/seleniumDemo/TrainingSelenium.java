package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TrainingSelenium {

	public static void main(String[] args) {
		
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
		
		//creating object of Chrome Browser
		ChromeDriver helal=new ChromeDriver();
		
		//load URL
		helal.get("https://www.tcfbank.com/");
		
		//maximize window
		helal.manage().window().maximize();
		
		//implicitly wait
		helal.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//print Title
		System.out.println(helal.getTitle());
		
		//Browser close
		helal.close();

	}

}
