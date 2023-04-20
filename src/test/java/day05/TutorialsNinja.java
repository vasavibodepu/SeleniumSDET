package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TutorialsNinja {

	String URL = "http://tutorialsninja.com/demo/index.php";

	public void practiceElements() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\eswar\\eclipse-workspace\\SDET108Selinium\\src\\test\\resources\\drivers\\chromedriver.exe");
		System.out.println("chrome driver : " + System.getProperty("webdriver.chrome.driver"));

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(options);

		System.out.println("driver : " + driver);

		driver.get(URL);

		WebElement currencyDropDown = driver.findElement(By.className("btn-group"));
		currencyDropDown.click();

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println("got interrupted!");
		}

		WebElement chooseCurrency = driver.findElement(By.name("EUR"));
		chooseCurrency.click();

		driver.manage().window().maximize();

		// Try to order a canon EOS 5 D camera and collect the error message occurred
		// due to a bug in select option

		orderCanonCamera(driver);		
		
//		Move to the home screen, Click on Iphone and go to details screen, change the quantity to two then add to cart + e.getMessage()
		
		gotoHomePage(driver); //click home button to go to home screen
		
		orderIPhone(driver); //iphone click
			
			System.out.println("iPhone added to cart successfully !");
			
			//Click on the cart icon (black color) in the right side top then click view cart
			//Change the quantity of iphone to 3 and click update button 
			//Print the Eco tax and VAT Amount in console and click Checkout button
			//Print the error message and remove the product from the ca
			
			
			
			
	}

	private void orderCanonCamera(ChromeDriver driver) {
		// select product from home page
		WebElement orderCanon = driver.findElement(
				By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=product/product&product_id=30']"));
		orderCanon.click();
		
		// select options
		WebElement pleaseSelect = driver.findElement(By.name("option[226]"));
		pleaseSelect.click();

		// add quatity
		WebElement quantityCanon = driver.findElement(By.name("quantity"));
		quantityCanon.clear();
		quantityCanon.sendKeys("2");
		
		// add to cart
		WebElement canonAddCart = driver.findElement(By.id("button-cart"));
		
		canonAddCart.click();
		
		try {
			Thread.sleep(1500);

			WebElement errorText = driver.findElement(By.className("text-danger"));
			if (errorText != null) {
				System.err.println(errorText.getText());
			}
			
		} catch (Exception e) {
			System.out.println("got interrupted!" + e.getMessage());
		}
		

		

	}

	private void gotoHomePage(ChromeDriver driver) {
		WebElement homeScreen = driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=common/home']"));
		homeScreen.click();
	}

	private void orderIPhone(ChromeDriver driver) {
		WebElement iphoneSelect = driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=product/product&product_id=40']"));
iphoneSelect.click();

		WebElement iphoneQuantity = driver.findElement(By.xpath("//input[@name='quantity' and @id='input-quantity']"));
		
		iphoneQuantity.clear();
		iphoneQuantity.sendKeys("2");
		
		//btn btn-primary btn-lg btn-block
		
		WebElement iphoneAddCart = driver.findElement(By.id("button-cart"));
		iphoneAddCart.click();
		

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println("got interrupted!");
		}

		
		System.out.println("Your item is added to the shopping cart");
		
		//alert alert-success alert-dismissible
		
		WebElement iphoneSuccessText = driver.findElement(By.className("alert alert-success alert-dismissible"));
		iphoneSuccessText.getText();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TutorialsNinja test1 = new TutorialsNinja();
		test1.practiceElements();

	}
}
