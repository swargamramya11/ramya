package pkg_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","chromedriver_v79.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
  }
}
