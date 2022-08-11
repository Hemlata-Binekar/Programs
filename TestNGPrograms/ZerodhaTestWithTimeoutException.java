package TestNGPrograms;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ZerodhaTestWithTimeoutException {
	public WebDriver driver;
	  @Test(dataProvider = "kiteData", expectedExceptions = AssertionError.class)
	  public void kitelogin(String username, String password, String pin) throws InterruptedException {
		  
		  //launch chrome browser
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://kite.zerodha.com");
		  
		  //Insert Login user id and password credential
		  WebElement Username = driver.findElement(By.xpath("//input[@id='userid']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  Username.sendKeys(username);
		  Password.sendKeys(password);
		  LoginBtn.click();
		  Thread.sleep(1000);
		  
		  //Insert Pin Credential
		  WebElement PIN = driver.findElement(By.xpath("//input[@id='pin']"));
		  WebElement ContinueBTn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  PIN.sendKeys(pin);
		  ContinueBTn.click();
		  Thread.sleep(3000);
		  
		  //Searching for Homepage Title
		  String ExpectedTitle ="Dashboard / Lite";
		  String ActualTitle = driver.getTitle();
		  Assert.assertEquals(ActualTitle, ExpectedTitle);
		    
	  }

	  @DataProvider
	  public Object[][] kiteData() {
	    return new Object[][] {
	      new Object[] { "XA0634", "1234568655", "122331"},
	      new Object[] { "1234532", "12345743", "23111111"},
	      new Object[] { "XA0634", "Sarika699!", "691991"}
	    };
	  }
	}
