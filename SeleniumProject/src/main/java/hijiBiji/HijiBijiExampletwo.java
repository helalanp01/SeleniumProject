package hijiBiji;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HijiBijiExampletwo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\helal\\\\eclipse-workspace\\\\Testpro\\\\newDriverOne\\\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("headless");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/?ref=icp_country_ca");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement searchText = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		File f = searchText.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("new.JPEG"));
		searchText.sendKeys("Guiter");
		searchText.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		int count=0;
		 java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of link"+links.size());
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
			
			clickOnImage(driver);
			capturedOnImage(driver);
		}
		
		
	}

	public static WebElement clickOnImage (WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement image=driver.findElement(By.xpath("//img[@class='_bXVsd_image_1pfbQ']"));
		image.click();
		return image;
		
	}

	public static  void capturedOnImage(WebDriver driver) throws IOException {
		TakesScreenshot srcshot=((TakesScreenshot)driver);
		File searchFile=srcshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(searchFile, new File("Second.JPEG"));
		
		
	}

}
