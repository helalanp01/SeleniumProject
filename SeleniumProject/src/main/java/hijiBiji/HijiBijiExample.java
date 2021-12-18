package hijiBiji;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HijiBijiExample {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\helal\\eclipse-workspace\\Testpro\\newDriverOne\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/?ref=icp_country_ca");
		String printTitle = driver.getTitle();
		System.out.println("Title of the page :	"+ printTitle);
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
		 int numberoflink = driver.findElements(By.tagName("a")).size();
		 System.out.println(numberoflink);
		 
		 int count=0;
		 
		 java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
		 links.size();
		 for(int i = 0;i<links.size();i++) {
			 System.out.println("The link name is"+ links.get(i).getText());
		 }
		
	
	}

}
