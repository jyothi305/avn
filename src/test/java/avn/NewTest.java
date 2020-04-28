package avn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://google.com");
  }
}
