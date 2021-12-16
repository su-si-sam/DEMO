package packageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassFour {
	
	@Test
	  public void testFour(){
		  
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("http://book.theautomatedtester.co.uk");
		 
		 driver.close();
		  
	  }

}
