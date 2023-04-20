package day05;

 import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloSelenium {
	
	String url = "https://www.numpyninja.com/";
	public void launchTestApplication() {
		
//		set the path of the Chrome driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eswar\\eclipse-workspace\\SDET108Selinium\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		System.out.println("chrome driver : " + System.getProperty("webdriver.chrome.driver"));


		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--remote-allow-origins=*");
			
		
		ChromeDriver driver =new ChromeDriver(coptions);
//		WebDriver driver = new FirefoxDriver();
		
		System.out.println("driver : " + driver);
		
		driver.get(url);
		
			
				
		WebElement firstNametxtBox = driver.findElement(By.id("input_comp-l1c0ktzj1"));
		firstNametxtBox.sendKeys("vijaya");
		
//		WebElement lastNametxtBox = driver.findElement(By.name("last-name"));
//		lastNametxtBox.sendKeys("bharathi");
//		
//		WebElement EmailtxtBox = driver.findElement(By.name("email"));
//		EmailtxtBox.sendKeys("vijaya@bharathi.com");
//		
//		WebElement phonetxtBox = driver.findElement(By.name("phone"));
//		phonetxtBox.sendKeys("97865432456");
//		
//		WebElement questiontxtBox = driver.findElement(By.id("textarea_comp-l1c0ku07"));
//		questiontxtBox.sendKeys("when next sdet batch will start?");
//		
//		WebElement submitBtn = driver.findElement(By.id("comp-l1c0ku0e3"));
//		submitBtn.click();
//		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloSelenium test = new HelloSelenium();
		test.launchTestApplication();

	}

}
