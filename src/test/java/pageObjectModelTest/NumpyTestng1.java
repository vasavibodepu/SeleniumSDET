package pageObjectModelTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NumpyTestng1 {
	

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside beforeMethod()");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside afterMethod()");

	}

	@DataProvider
	public Object[][] dp() {
		System.out.println("Inside dp()");

		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass1() {
		System.out.println("Inside beforeClass()");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("Inside afterClass()");

	}
	

	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside beforeTest()");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("Inside afterTest()");

	}
	
	@Test(dataProvider = "dp")

	public void testMethod(Integer n, String s) {
		System.out.println("Inside testMethod()");

	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Inside beforeSuite()");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Inside afterSuite()");

	}

}
