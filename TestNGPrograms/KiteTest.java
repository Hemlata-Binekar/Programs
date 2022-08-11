package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KiteTest {
	public WebDriver driver;
	  @Test(dataProviderClass = dpkite.class, dataProvider="kiteData")
	  public void kitelogin(String username, String password, String pin) throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://kite.zerodha.com");
		  
		  WebElement Username = driver.findElement(By.xpath("//input[@id='userid']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  Username.sendKeys(username);
		  Password.sendKeys(password);
		  LoginBtn.click();
		  Thread.sleep(1000);
		  
		  WebElement PIN = driver.findElement(By.xpath("//input[@id='pin']"));
		  WebElement ContinueBTn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  PIN.sendKeys(pin);
		  ContinueBTn.click();
		  Thread.sleep(3000);
		  
		  String ExpectedTitle ="Dashboard / Kite";
		  String ActualTitle = driver.getTitle();
		  Assert.assertEquals(ActualTitle, ExpectedTitle);
		    
	  }

}
