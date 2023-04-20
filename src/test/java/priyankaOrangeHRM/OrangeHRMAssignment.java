package priyankaOrangeHRM;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrangeHRMAssignment {

	// login page Webelement
	By userName = By.xpath("//input[@name='username']");
	By passWord = By.xpath("//input[@name='password']");
	// common save button in all the page (reusing the xpath in different page)
	By saveBtn = By.xpath("//button[@type='submit']");

	// Myinfo Page WebElement
	By myInfoBtn = By.xpath("//span[text()='My Info']");
	By contactTab = By.xpath("//a[text()='Contact Details']");

	// contact tab details
	By street1Det = By.xpath("//form/div[1]/div/div[1]/div/div[2]/input");
	By street2Det = By.xpath("//form/div[1]/div/div[2]/div/div[2]/input");
	By cityDet = By.xpath("//form/div[1]/div/div[3]/div/div[2]/input");
	By stateDet = By.xpath("//form/div[1]/div/div[4]/div/div[2]/input");
	By zipCodeDet = By.xpath("//form/div[1]/div/div[5]/div/div[2]/input");
	By mobNum = By.xpath("//form/div[2]/div/div[2]//div[2]/input");

	// Emergency tab details
	By EmergencyTab = By.xpath("//a[text()='Emergency Contacts']");
	By addTBtn = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button");
	By EmergencyConName = By.xpath("//form/div[1]/div/div[1]//div[2]/input");
	By conRelationship = By.xpath("//form/div[1]/div/div[2]//div[2]/input");
	By emgConNum = By.xpath("//form/div[2]/div/div[2]//div[2]/input");

	// dependent tab
	By dependentTab = By.xpath("//a[text()='Dependents']");
	By dependentAddBtn = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button");
	By depenNameBox = By.xpath("//form/div[1]/div[1]//div/input");
	By depenSel = By.xpath("//form/div[1]/div/div[2]/div/div[2]/div/div");
	// common select options in dropdown menu in all the page (reusing the xpath in
	// different page)
	By allSelOptions = By.xpath("//div[@role='listbox']");

	// recruitment Add tab
	By recruitTab = By.xpath("//span[text()='Recruitment']");
	By addCandidateBtn = By.xpath("//div[@class='orangehrm-paper-container']/div[1]/button");
	By candidateFirstName = By.xpath("//input[@name='firstName']");
	By candidateLastName = By.xpath("//input[@name='lastName']");
	By vacancyAddSel = By.xpath("//div[contains(text(),'-- Select --')]");
	By emailAddBox = By.xpath("//form/div[3]/div/div[1]/div/div[2]/input");
	By shortlistBtn = By.xpath("//button[contains(.,'Shortlist')]");
	By scheduleInvBtn = By.cssSelector("button:nth-child(2)");
	By intvTitleSel = By.xpath("//form/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
	By intviewerSrchBtn = By.xpath("//input[@placeholder='Type for hints...']");

	// recruitment search tab
	By jobTitleSel = By.xpath("//form/div[1]/div/div[1]/div/div[2]/div/div");
//	By jobTitleOpt = By.xpath("//div[@role='listbox']");
	By vacancySel = By.xpath("//form/div[1]/div/div[2]/div/div[2]/div/div");
	By hiringManSel = By.xpath("//form/div[1]/div/div[3]/div/div[2]/div/div");
	By stausSel = By.xpath("//form/div[1]/div/div[4]/div/div[2]/div/div");
	By candidateName = By.xpath("//input[@placeholder='Type for hints...']");

	public void orangeHRMLoginPage() throws InterruptedException {
		// Initial Setups
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\eswar\\\\eclipse-workspace\\\\SDET108Selinium\\\\src\\\\test\\\\resources\\\\drivers\\\\chromedriver.exe");

		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(coptions);
		coptions.addArguments("start-maximized");
		driver.manage().window().maximize();
		coptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		coptions.setAcceptInsecureCerts(true);
		coptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();

		/*
		 * 1. Launch the below application
		 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login and login
		 * with give credentials
		 */
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(userName).sendKeys("Admin");
		driver.findElement(passWord).sendKeys("admin123");
		driver.findElement(saveBtn).click();

		// 2. Navigate to My info - > Contact Details, enter contact details and press
		// save
		// button
		Thread.sleep(3000);
		driver.findElement(myInfoBtn).click();
		Thread.sleep(3000);
		driver.findElement(contactTab).click();

		Thread.sleep(8000);
		driver.findElement(street1Det).clear();
		driver.findElement(street1Det).sendKeys("123 Plano texas");
		Thread.sleep(3000);

		driver.findElement(street2Det).clear();
		driver.findElement(street2Det).sendKeys("USA");
		Thread.sleep(3000);

		driver.findElement(cityDet).clear();
		driver.findElement(cityDet).sendKeys("plano");
		Thread.sleep(3000);
		driver.findElement(stateDet).clear();
		driver.findElement(stateDet).sendKeys("texas");

		Thread.sleep(3000);
		driver.findElement(zipCodeDet).clear();
		driver.findElement(zipCodeDet).sendKeys("75089");
		Thread.sleep(3000);
		driver.findElement(mobNum).sendKeys("1234567890");
		driver.findElement(saveBtn).click();
		Thread.sleep(3000);

		// 3. Navigate to Emergency contacts and add details
		driver.findElement(EmergencyTab).click();
		Thread.sleep(3000);
		driver.findElement(addTBtn).click();
		Thread.sleep(3000);
		driver.findElement(EmergencyConName).sendKeys("Tus");
		driver.findElement(conRelationship).sendKeys("Spouse");
		driver.findElement(emgConNum).sendKeys("1122334455");
		driver.findElement(saveBtn).click();

		// 4. Navigate to Dependents and add dependents
		Thread.sleep(3000);
		driver.findElement(dependentTab).click();
		Thread.sleep(3000);
		driver.findElement(dependentAddBtn).click();
		driver.findElement(depenNameBox).sendKeys("Riya");
		driver.findElement(depenSel).click();
		driver.findElement(allSelOptions).click();
		driver.findElement(saveBtn).click();
		Thread.sleep(3000);

		// 5. Navigate to recruitment menu and add a candidate

		driver.findElement(recruitTab).click();
		Thread.sleep(3000);
		driver.findElement(addCandidateBtn).click();
		Thread.sleep(3000);
		driver.findElement(candidateFirstName).sendKeys("Priya");
		driver.findElement(candidateLastName).sendKeys("Gupta");
		Thread.sleep(3000);
		driver.findElement(vacancyAddSel).click();
		driver.findElement(allSelOptions).click();
		driver.findElement(emailAddBox).sendKeys("admin@example.com");
		Thread.sleep(4000);
		driver.findElement(saveBtn).click();

		// 6. Shortlist the candidate and schedule the interview
		Thread.sleep(6000);
		driver.findElement(shortlistBtn).click();
		Thread.sleep(4000);
		driver.findElement(saveBtn).click();
		Thread.sleep(6000);
		driver.findElement(scheduleInvBtn).click();
		Thread.sleep(5000);
		driver.findElement(saveBtn).click();
		Thread.sleep(3000);

		// Schedule Interview
		driver.findElement(intvTitleSel).sendKeys("SQA");
		driver.findElement(intviewerSrchBtn).sendKeys("aa");
		Thread.sleep(3000);
		driver.findElement(allSelOptions).click();

		// 7. Mark the interview passed and offer job

	}

	public static void main(String[] args) throws InterruptedException {

		OrangeHRMAssignment test = new OrangeHRMAssignment();
		test.orangeHRMLoginPage();

	}
}
