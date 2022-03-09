package com.mphasis.selenium.SeliniumDemo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestLocatorByName {
	private WebDriver driver;
	private String url;
  
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("Webdriver.crome.driver","C:\\Users\\U.JASWANTH SAGAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  url ="https://studio.code.org/users/sign_up";
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  @Test
  
  public void testByNameStrategy() throws InterruptedException {;
	  WebElement emailele =driver.findElement(By.name("user[email]"));
	  emailele.sendKeys("gorlasreevani20@gmail.com");
	  
	  WebElement pwd =driver.findElement(By.name("user[password]"));
	  pwd.sendKeys("gorlasreevani");
	  
	  driver.findElement(By.name("user[password_configuration]")).sendKeys("gorlasreevani");
	  driver.findElement(By.className("sumbit")).click();
	  String expected = "has alredy been taken";
	  String actual = driver.findElement(By.className("error")).getText();
	  assertEquals(actual ,expected);
	  
	  Thread.sleep(2000);

}
}