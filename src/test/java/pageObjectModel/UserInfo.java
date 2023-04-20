package pageObjectModel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserInfo {

	WebDriver driver;

	By username = By.xpath("//input[@name='username']");
	By passWord = By.xpath("//input[@name='password']");
	By loginButton = By
			.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

	public UserInfo(WebDriver driver) {
		this.driver = driver;

	}

	public void username() {
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(passWord).sendKeys("admin123");
		driver.findElement(loginButton).click();

	}

}
