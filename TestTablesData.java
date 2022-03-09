package com.mphasis.selenium.SeliniumDemo1;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestTablesData {
	private WebDriver driver;
	private String url;
	@BeforeEach
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\U.JASWANTH SAGAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		url="https://demo.guru99.com/test/web-table-element.php";
		driver.navigate().to(url);
		
	}
	
	
	
  @Test
  public void shouldGetTableValues() throws InterruptedException
  {
  	WebElement tableEle = driver.findElement(By.xpath("\"leftcontainer\"]/table/tbody"));
  	
  	List<WebElement> rows = tableEle.findElements(By.tagName("tr"));
  	
  	
  	
  	Thread.sleep(2000);
  }
  }

