package juiceShop;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ShirtOrder {
	
	String url= " https://juice-shop4.herokuapp.com/#/register";
	
	public void  launchApplicatio() {
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//co.setAcceptInsecureCerts(true);
	
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get(url);
		
//		Alert alert = driver.switchTo().alert();

		driver.findElement(By.xpath("//*[@class=\"mat-focus-indicator close-dialog mat-raised-button mat-button-base mat-primary ng-star-inserted\"]")).click();
		
		String loginId = "vasavijb"+ System.currentTimeMillis() + "@gmail.com";
		String password = "owasapjuiceshop";
		
		driver.findElement(By.id("emailControl")).sendKeys(loginId );
		
		driver.findElement(By.id("passwordControl")).sendKeys(password);
		driver.findElement(By.id("repeatPasswordControl")).sendKeys("owasapjuiceshop");
		driver.findElement(By.xpath("//*[@class=\"mat-select-arrow ng-tns-c129-11\"]")).click();
//		driver.findElement(By.xpath("//*[@class=\"mat-select-arrow ng-tns-c129-11\"]")).click();
		//mat-option-11
		
		//for (int i=0;i<12;i++);
		
		WebElement selectChoice = (WebElement)driver.findElement(By.xpath("//*[@id=\"mat-option-6\"]/span"));
		
		System.out.println("selectChoice getText : " + selectChoice.getText());
		
		selectChoice.click();
		

		//label[@id='mat-form-field-label-11']
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		
//driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c118-12']")).click();
driver.findElement(By.xpath("//*[@id=\"securityAnswerControl\"]")).sendKeys("tommy");
//registerButton

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id=\"registerButton\"]")));


	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(loginId);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);

	js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id=\"loginButton\"]")));
	
	

	
	
	
		
		
}
	
	public static void main(String[] args) {
		ShirtOrder order = new ShirtOrder();
		
		order.launchApplicatio();
	}
	
	

}
