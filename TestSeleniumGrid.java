package com.mphasis.selenium.SeliniumDemo1;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSeleniumGrid {
	WebDriver driver;
	String baseURL,nodeURL;
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		baseURL = "http://www.techgatha.com";
		nodeURL = "http://localhost:4444";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
			
	}
	@AfterMethod
	public void cleanUp() {
		driver.close();
	}
  @Test
  public void f() {
	  driver.navigate().to(baseURL);
	  String title = driver.getTitle();
	  assertEquals(title, "TechGatha - Best IT Training Providers");
  }
}
