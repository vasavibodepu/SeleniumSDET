package pageObjectModelTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParelleTesting {

	WebDriver driver;
	String URL = "www.google.com";


	@Test()
	public void testChrome() {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setAcceptInsecureCerts(true);

		//System.setProperty("Webdriver.driver.chrome", "C:\\sdetlabs\\src\\test\\resources\\drivers\\chromedriver.exe");

		 driver = new ChromeDriver(co);
		//driver.manage().timeouts().implicitlyWait();
		 
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("got interrupted!");
			}


		String URL = "https://www.google.com/";

		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("this is the test related to Parallel Testing "+ " " +Thread.currentThread().getId());

	}

	@Test()
	
	public void testFirefox() {
		
		
		System.setProperty("Webdriver.driver.firefox", "C:\\sdetlabs\\src\\test\\resources\\drivers\\geckodriver.exe");
	 driver = new FirefoxDriver();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("got interrupted!");
		}

		
		String URL= "https://www.google.com/";
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		System.out.println("this is the test related to chrome browserstack homepage"+ " " +Thread.currentThread().getId());
		

		
	}

}
