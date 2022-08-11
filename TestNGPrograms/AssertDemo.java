package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	public WebDriver driver;
	  @Test(groups = "sanity")
	  public void facebookLaunch()
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		//Reporter log file syntax
		Reporter.log("Welcome to facebook page", true);
		
		String ExpectedTitle = "Facebook – log in or sign Up";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		WebElement fblogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		Assert.assertTrue(fblogo.isDisplayed());
		System.out.println("Welcome to TestNg Assert");
		 
	  }
	  
	  @Test(groups = "regression")
	  public void LaunchKite()
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Welcome to Zerodha page",true);
		
		String ExpectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String ActualTitle = driver.getTitle();
		SoftAssert SAssert = new SoftAssert();
		SAssert.assertEquals(ActualTitle, ExpectedTitle);
		
		WebElement Kitelogo = driver.findElement(By.xpath("//img[contains(@src,'kite-logo')]"));
		SAssert.assertTrue(Kitelogo.isDisplayed());
		System.out.println("Welcome to TestNg Assert");
		SAssert.assertAll();
		
	  }
	  @Test(enabled = false)
	  public void SkipMethod()
	  {
		  driver.close();
	  }

}
