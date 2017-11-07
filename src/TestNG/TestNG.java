package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestNG {
	public WebDriver driver;

  @Test
  public void f() {
	     // driver.findElement(By.id("menu-item-22803")).click();

	      driver.findElement(By.id("email")).sendKeys("3136878013");
	 
	      driver.findElement(By.id("pass")).sendKeys("1102380468");
	 
	      driver.findElement(By.id("u_0_3")).submit();
	 
	      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 

 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\saaib\\Google Drive\\UNAC\\VIII semestre\\Calidad\\Drivers\\geckodriver.exe");
      driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.facebook.com/");
  }

  @AfterMethod
  public void afterMethod() {
	   driver.quit();
  }

}
