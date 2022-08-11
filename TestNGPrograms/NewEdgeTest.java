package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewEdgeTest {
	public WebDriver driver;
	  @Test
	  public void launchChrome()
	  {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\msedgedriver.exe");
		  EdgeOptions option = new EdgeOptions();
		  option.addArguments("--headless");
			driver = new EdgeDriver(option);
		  
		  driver.get("https://kite.zerodha.com");
			driver.manage().window().maximize();
	  }

	@Test(priority = 1)
	public void loginkite() throws InterruptedException
	{
		  WebElement Username = driver.findElement(By.xpath("//input[@id='userid']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  Username.sendKeys("XA0634");
		  Password.sendKeys("Sarika699!");
		  LoginBtn.click();
		  Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void loginKitePin() throws InterruptedException
	{
		  WebElement PIN = driver.findElement(By.xpath("//input[@id='pin']"));
		  WebElement ContinueBTn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  PIN.sendKeys("691991");
		  ContinueBTn.click();
		  Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void CheckTitle()
	{
		  String ExpectedTitle ="Kite - Zerodha's fast and elegant flagship trading platform";
		  String ActualTitle = driver.getTitle();
		  Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	@Test(priority = 4)
	public void teardown()
	{
		  driver.quit();
	}

}
