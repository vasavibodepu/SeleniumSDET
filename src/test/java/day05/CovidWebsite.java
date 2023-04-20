package day05;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CovidWebsite {

	public void printHospName() {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://covid19.uk.gov.in/bedssummary.aspx");

//		List<WebElement> hospitals = driver.findElements(By.id("lblhospitalName"));
//	    for (WebElement hospital : hospitals)
//	    {
//
////			String HospName = driver.findElement(By.id("lblhospitalName" )).getText();
//			System.out.println("Name of the hospital : " + hospital.getText());
		
		
		List<WebElement>  totalRows = (List<WebElement>)driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(" Total Number of Rows : "  +totalRows.size());
		
//		total number of hospital names which are mentioned in rows of the given table
		List<WebElement> numberOfHospitalNames = driver.findElements(By.xpath("//span[@id='lblhospitalName']"));
		System.out.println(" Total Number of available Hospital Names : "  +numberOfHospitalNames.size());
		
//		total number of columns 
		
		List<WebElement> totalColumns = driver.findElements(By.xpath("//th[@aria-controls='grdhospitalbeds']"));
		System.out.println(" Total Number of Columns : "  + totalColumns.size());

		
		final int HOSPITAL_COLUMN_INDEX = 2;
		
		for (int rowIndex=1; rowIndex<20; rowIndex++) {
			String HospName = driver.findElement(By.xpath("//tbody/tr["+ rowIndex + "]/td[" + HOSPITAL_COLUMN_INDEX + "]/span[1]")).getText();
			System.out.println("Name of the hospital : "+HospName);
		}

		}

//	}

	public static void main(String[] args) {

		CovidWebsite cw = new CovidWebsite();

		cw.printHospName();
	}

}
