package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class FBDataTest {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void fblogin(String username, String password) 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  UserName.sendKeys(username);
	  Password.sendKeys(password);
	  LoginBtn.click();
	  
	  String ExpectedTitle = "Facebook";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
  
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "hbinekar@gmail.com", "123456788" },
      new Object[] { "hbinekar45@gmail.com", "123456788" },
      new Object[] { "hbinekar04@gmail.com", "123456788" },
      new Object[] { "hbinekar90@gmail.com", "123456788" },
 /*   new Object[] { "hbinekar19@gmail.com", "123456788" },
      new Object[] { "hbinekar11@gmail.com", "123456788" },
      new Object[] { "hbinekar1990@gmail.com", "123456788" },
      new Object[] { "hbinekar23@gmail.com", "123456788" },
      new Object[] { "hbinekar21@gmail.com", "123456788" },
      new Object[] { "hbinekar1@gmail.com", "123456788" },
      new Object[] { "hbinekar123@gmail.com", "123456788" },
      */
    };
  }
}
