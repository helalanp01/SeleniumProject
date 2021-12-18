package practiceNpreactice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeNPractice {

	public static void main(String[] args) {
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "driver Location");
		
		System.setProperty("webdriver.chrome.driver", "");
		
		System.setProperty("webdriver.chrome.driver", "");
		
		System.setProperty("webdriver.chrome.driver", "");
		
		System.setProperty("webdriver.chrome.driver", "");
		
		System.setProperty("webdriver.chrome.driver", "");
		
		System.setProperty("webdriver.chrome.driver", "");
		
		System.setProperty("", "");
		
		System.setProperty("", "");
		
		System.setProperty("","");
		
		//Creating Object
		ChromeDriver driver=new ChromeDriver();
		
		ChromeDriver driver_two=new ChromeDriver();
		
		ChromeDriver driver_three=new ChromeDriver();
		
		ChromeDriver driver_four=new ChromeDriver();
		
		ChromeDriver driver_five=new ChromeDriver();
		
		ChromeDriver driver_six=new ChromeDriver();
		
		ChromeDriver driver_seven=new ChromeDriver();
		
		ChromeDriver driver_eight=new ChromeDriver();
		
		ChromeDriver driver_nine=new ChromeDriver();
		
		ChromeDriver driver_ten=new ChromeDriver();
		
		//Load URL
		driver.get("WebSite name or webpage");
		
		driver.get("");
		
		driver.get("");
		
		driver.get("");
		
		driver.get("");
		
		driver.get("");
		
		driver.get("");
		
		driver.get("");
		
		driver.get("");
		
		driver.get("");
		
		//maximize browser
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Enter User Name
		driver.findElementById("find ID Locator").sendKeys("Username");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		driver.findElementById("").sendKeys("");
		
		//Enter password
		driver.findElementByClassName("Find Locator ClassName").sendKeys("Password");
		driver.findElementByClassName("").sendKeys("");
		driver.findElementByClassName("").sendKeys("");
		driver.findElementByClassName("").sendKeys("");
		driver.findElementByClassName("").sendKeys("");
		driver.findElementByClassName("").sendKeys("");
		driver.findElementByClassName("").sendKeys("");
		driver.findElementByClassName("").sendKeys("");
		driver.findElementByClassName("").sendKeys("");
		driver.findElementByClassName("").sendKeys("");
		
		//click login button
		driver.findElementById("find Locator ID").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		
		//get Title
		driver.getTitle();
		driver.getTitle();
		driver.getTitle();
		driver.getTitle();
		driver.getTitle();
		driver.getTitle();
		driver.getTitle();
		driver.getTitle();
		driver.getTitle();
		driver.getTitle();
		
		//close window
		driver.close();
		driver.close();
		driver.close();
		driver.close();
		driver.close();
		driver.close();
		driver.close();
		driver.close();
		driver.close();
		driver.close();
		
		

	}

}
