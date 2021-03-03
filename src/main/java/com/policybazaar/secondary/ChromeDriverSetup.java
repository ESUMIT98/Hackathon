package com.policybazaar.secondary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSetup {
	
	public WebDriver getWebDriver() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\webDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		return driver;
	}
	//For grid use this code//
	/*public WebDriver getWebDriver() {
		DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setBrowserName("chrome");
        String Node = "http://192.168.0.103:4444/wd/hub";
        driver = new RemoteWebDriver(new URL(Node), cap);
        return driver;
	}*/
}
