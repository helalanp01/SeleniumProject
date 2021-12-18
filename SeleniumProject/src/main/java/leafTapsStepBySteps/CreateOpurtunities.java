package leafTapsStepBySteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOpurtunities {

	public static void main(String[] args) {

System.setProperty("webdriver.chorme.driver", "C:\\Users\\helal\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/");

//.......
//.......
//.....


//createOpportunityForm_opportunityStageId
WebElement inistage = driver.findElementById("createOpportunityForm_opportunityStageId");
Select inisdd=new Select(inistage);
inisdd.selectByVisibleText("Proposal");

//
WebElement mkc = driver.findElementById("createOpportunityForm_marketingCampaignId");
Select mkcdd=new Select(mkc);
mkcdd.selectByVisibleText("Catalog Generating Marketing Campaigns");

//
WebElement type = driver.findElementById("createOpportunityForm_typeEnumId");
Select typedd=new Select(type);
typedd.selectByVisibleText("Renewal");

//
WebElement src = driver.findElementById("createOpportunityForm_dataSourceId");
Select srcdd=new Select(src);
srcdd.selectByVisibleText("Word of Mouth");

//
WebElement currency = driver.findElementById("createOpportunityForm_currencyUomId");
Select cydd=new Select(currency);
cydd.selectByVisibleText("CLP - Chilean Peso");



	}

}
