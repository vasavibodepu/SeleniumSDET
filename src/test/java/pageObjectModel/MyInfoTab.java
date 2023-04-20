package pageObjectModel;

import static org.testng.Assert.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyInfoTab {
	WebDriver driver;
	By clickMyInfo = By.xpath("//span[text()='My Info']");
	By navigateToContactDetails = By.xpath("//a[text()='Contact Details']");

	public MyInfoTab(WebDriver driver) {

		this.driver = driver;

	}

	public void clickMyInfoTab() throws InterruptedException {
		
		Thread.sleep(3000);
		
		// Click My Info Tab if it's available
		WebElement myInfoTab = driver.findElement(clickMyInfo);
		assertNotNull(myInfoTab);
		myInfoTab.click();
		
		Thread.sleep(3000);
		
		// Click Contact Details Tab if it's available
		WebElement contactDetailsTab = driver.findElement(navigateToContactDetails);
		assertTrue (contactDetailsTab != null);
		contactDetailsTab.click();

	}

	public void addressTab() {


	}

}
