package leafTapsStepBySteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindQuete {

	public static void main(String[] args) {
		// 
System.setProperty("", "");
ChromeDriver driver=new ChromeDriver();
driver.findElementById("quoteId").sendKeys("");
//
driver.findElementById("quoteName").click();

//
WebElement status=driver.findElementById("statusId");
Select quoteDd=new Select(status);
quoteDd.selectByIndex(3);

//

//
WebElement productStore = driver.findElementById("productStoreId");
Select psdd=new Select(productStore);
psdd.selectByVisibleText("OFBiz Physical Retail Store");
//
WebElement channel=driver.findElementById("salesChannelEnumId");
Select channeldd=new Select(channel);
channeldd.selectByValue("POS_SALES_CHANNEL");
driver.findElementByClassName("smallSubmit").click();


//
driver.findElementByClassName("smallSubmit").click();



	}

}
