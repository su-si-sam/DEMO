package packageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassOne {
	
  
  @Test
  public void testOne(){
	  
	  WebDriver driver = new FirefoxDriver();
		 
		 driver.get("http://omayo.blogspot.in");
		 
		 driver.close(); 
	  
  }
  
  
}
