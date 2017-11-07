package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class TestngParameters {

	private static WebDriver driver;

 // @Parameters({ "sUsername", "sPassword" })
  
  @DataProvider(name = "Authentication")

  public static Object[][] credentials() {
        return new Object[][] { { "3136878013", "1102380468" }, { "3136878013", "1102380468" }};
  }
  
  @Test(dataProvider = "Authentication")

  public void test(String sUsername, String sPassword) throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\saaib\\Google Drive\\UNAC\\VIII semestre\\Calidad\\Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //driver.get("http://www.store.demoqa.com");
      driver.get(" https://www.facebook.com/");

     // driver.findElement(By.xpath(".//*[@id='account']/a")).click();

      driver.findElement(By.id("email")).sendKeys(sUsername);

      driver.findElement(By.id("pass")).sendKeys(sPassword);

    //  driver.findElement(By.id("login")).click();
      driver.findElement(By.id("u_0_3")).submit();
      
      Thread.sleep(3000);

      driver.quit();

  }

}