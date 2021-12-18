package hijiBijiCreateLead;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindLead extends CreateLead {
	
@Test
public void FindInfo() {
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.name("id")).sendKeys("125");
	driver.findElement(By.name("firstName")).sendKeys("Zahra");
	driver.findElement(By.name("lastName")).sendKeys("Islam");
	driver.findElement(By.name("companyName")).sendKeys("genisys");
	driver.findElement(By.linkText("Find Leads")).click();
}
}
