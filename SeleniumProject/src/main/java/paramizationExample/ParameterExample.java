package paramizationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ParameterExample {
//Declare test data (passing the static value) 
//inside the TestNG.xml
//For Add Parameter in testing.xml 
//(Select any class/test case which you want to create TestNG.xml)
// Make connection between TestNG.xml and Java methods -
//@Parameters and receive the value using name(key)	
	public ChromeDriver driver;
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
	public void loginInfo(String url,String uname,String pwd) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}
	}
	

