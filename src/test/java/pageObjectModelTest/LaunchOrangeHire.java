package pageObjectModelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel.UserInfo;
import pageObjectModel.MyInfoTab;

public class LaunchOrangeHire {

	String driverPath = "C:\\Users\\eswar\\eclipse-workspace\\SDET108Selinium\\src\\test\\resources\\drivers\\chromedriver.exe";
	UserInfo ObjectUserInfo;
	MyInfoTab objectuserInfo;

	WebDriver driver;

	@BeforeTest
	public void launchOrangehireApplicatio() throws InterruptedException {

		String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\eswar\\eclipse-workspace\\SDET108Selinium\\src\\test\\resources\\drivers\\chromedriver.exe");

		ChromeOptions chrom = new ChromeOptions();
		chrom.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(chrom);

		driver.get(URL);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		  

	}

	@Test 
	public void launchUserInfo() {

		UserInfo objectuserInfo = new UserInfo(driver);

		objectuserInfo.username();

	}

	
	@Test 
	public void navigateToMyInfoTab() throws InterruptedException  {

		MyInfoTab objectMyInfoTab = new MyInfoTab(driver);
		objectMyInfoTab.clickMyInfoTab();
		


		objectMyInfoTab.addressTab();
	}

}
