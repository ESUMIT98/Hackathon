package com.policybazaar.secondary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeekoDriverSetup {


		
		public WebDriver getWebDriver() {
			
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\webDrivers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			return driver;
		}
		//For grid use this code//
		/*public WebDriver getWebdriver() {
			
		         String Node = "http://192.168.0.103:4444/wd/hub";
		         DesiredCapabilities cap = DesiredCapabilities.firefox();
		         cap.setBrowserName("firefox");
		         
		         driver = new RemoteWebDriver(new URL(Node), cap);
		         // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		         
		         return driver;
		}*/
	}


