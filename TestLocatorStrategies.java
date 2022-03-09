package com.mphasis.selenium.SeliniumDemo1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLocatorStrategies {
	private WebDriver driver;
	private String url;
  @Test
  public void testFindById() throws InterruptedException{
	  WebElement nameEle = driver.findElement(By.id("firstName"));
	  System.out.println(nameEle.getTagName());
	  
	  nameEle.sendKeys("sagar");
	  
	  WebElement lastnameEle = driver.findElement(By.id("lastName"));
	  lastnameEle.sendKeys("jaswanth");
	  
	  WebElement emailele = driver.findElement(By.id("userEmail"));
	  emailele.sendKeys("jaswanthsagar22@gmail.com");
	  
      Thread.sleep(1000);
	  
      WebElement radioMale = driver.findElement(By.id("gender-radio-1"));
	  
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].click()", radioMale);
      
      WebElement phoneele = driver.findElement(By.id("userNumber"));
      phoneele.sendKeys("1234567891");
      WebElement date =driver.findElement(By.id("dateOfBirthInput"));
	  
      date.sendKeys("05 Feb 2022");
      date.sendKeys(Keys.ESCAPE);
      driver.findElement(By.id("subjectsInput")).sendKeys("xyz");

      Thread.sleep(1000);
      
      WebElement chkbox1 = driver.findElement(By.id("hobbies-checkbox-1"));
      js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].click()", chkbox1);
      Thread.sleep(3000);
      js.executeScript("window.scroll(0,380)");
      WebElement fileele = driver.findElement(By.id("uploadPicture"));
      System.out.println(fileele.getAttribute("type"));
      fileele.sendKeys("C:\\Users\\U.JASWANTH SAGAR\\OneDrive\\Desktop\\javascript");

      
      
  }
 @BeforeMethod
 public void beforeMethod() {
	 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\U.JASWANTH SAGAR\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	 driver = new ChromeDriver();
	 url="https://demoqa.com/automation-practice-form";
	 driver.navigate().to(url);
	 driver.manage().window().maximize();
  }
 @AfterMethod
 public void afterMethod() {
	driver.close();
  }
}