package com.policybazaar.secondary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeekoDriverSetup {


		
		public WebDriver getWebDriver() {
			
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\webDrivers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			return driver;
		}
	}


