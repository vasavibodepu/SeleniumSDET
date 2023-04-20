package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class BasicForms {
	
	String URL = "https://www.saucedemo.com";
	
	public void sauceDemo() {
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\sdetlabs\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		System.out.println("Chromedriver : " + System.getProperty("webdriver.chrome.driver"));
		

		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(chromeoptions);
		driver.get(URL);
		
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("secret_sauce");
		
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		

	}
			
	
	public static void main(String[] args) {
		
		BasicForms test1 = new BasicForms();
		
		test1.sauceDemo();

	}
}
