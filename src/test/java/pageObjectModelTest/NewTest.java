package pageObjectModelTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.AfterClass;

public class NewTest {
	
  @Test
  public void firstfunction() {
	  assertNotNull(new String());
  }
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
}