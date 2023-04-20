package day05;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DelhiCovidWebsite {

	public void printCoronaDashboard() {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://coronabeds.jantasamvad.org/ ");
		String numberOfBeds = driver.findElement(By.xpath("//div/p[@id='beds_total']")).getText();
		System.out.println("Number of Beds : " + numberOfBeds);
		driver.findElement(By.xpath("//div/p[@id='beds_total']")).click();

		WebElement hospitalName = driver.findElement(By.xpath("//*/tr[1]/th/a[@data-toggle='collapse']"));
		// hospitalName.click();
		System.out.println(hospitalName.getText());

		// */tr/th[1]/a[@data-toggle='collapse']
		List<WebElement> rows = (List<WebElement>) driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(" Total Number of Rows : " + rows.size());

		for (int rowIndex = 1; rowIndex < 20; rowIndex++) {
			try {

				System.out.println(rows.get(rowIndex).findElement(By.tagName("th")).getText());
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}

		}

		driver.quit();
	}

	public static void main(String[] args) {

		DelhiCovidWebsite cw = new DelhiCovidWebsite();

		cw.printCoronaDashboard();
	}

}
