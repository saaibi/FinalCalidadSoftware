package TestNG;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Reporter;

import org.testng.annotations.Test;

import utility.Log;

public class ReporterLogs {

	private static WebDriver driver;

	private static Logger Log = Logger.getLogger(Log.class.getName());

    @Test
	public static void test() {

		DOMConfigurator.configure("log4j.xml");

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saaib\\Google Drive\\UNAC\\VIII semestre\\Calidad\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

        Log.info("New driver instantiated");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Log.info("Implicit wait applied on the driver for 10 seconds");

        //driver.get("http://www.store.demoqa.com");
        driver.get(" https://www.facebook.com/");

        Log.info("Web application launched");

        // Our first step is complete, so we produce a main event log here for our reports.

        Reporter.log("Application Lauched successfully | ");

       // driver.findElement(By.xpath(".//*[@id='account']/a")).click();

        Log.info("Click action performed on My Account link");

        driver.findElement(By.id("email")).sendKeys("3136878013");

        Log.info("Username entered in the Username text box");

        driver.findElement(By.id("pass")).sendKeys("1102380468");

        Log.info("Password entered in the Password text box");

        //driver.findElement(By.id("login")).click();
        driver.findElement(By.id("u_0_3")).submit();

        Log.info("Click action performed on Submit button");

        // Here we are done with our Second main event

        Reporter.log("Sign In Successful | " );

        driver.quit();

        Log.info("Browser closed");

        // This is the third main event

        Reporter.log("User is Logged out and Application is closed | ");

	}

}