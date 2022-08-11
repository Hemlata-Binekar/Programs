package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewParallelTest {
	public WebDriver driver;
	@Test
	public void launchchrome() throws InterruptedException
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		    ChromeOptions opt1 = new ChromeOptions();
		    opt1.addArguments("--headless");
		    driver = new ChromeDriver(opt1);
		  driver.get("https://kite.zerodha.com");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
	 
		  WebElement Username = driver.findElement(By.xpath("//input[@id='userid']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  Username.sendKeys("XA0634");
		  Password.sendKeys("Sarika699!");
		  LoginBtn.click();
		  Thread.sleep(2000);
	
		  WebElement PIN = driver.findElement(By.xpath("//input[@id='pin']"));
		  WebElement ContinueBTn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  PIN.sendKeys("691991");
		  ContinueBTn.click();
		  Thread.sleep(3000);
	
		  String ExpectedTitle ="Kite - Zerodha's fast and elegant flagship trading platform";
		  String ActualTitle = driver.getTitle();
		  Assert.assertEquals(ActualTitle, ExpectedTitle);
	

		  driver.close();
		}

@Test
public void launchedge() throws InterruptedException
{
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\msedgedriver.exe");
	  EdgeOptions opt2 = new EdgeOptions();
	  opt2.addArguments("--headless");
	  driver = new EdgeDriver(opt2);
	  driver.get("https://kite.zerodha.com");
	  driver.manage().window().maximize();
 
	  WebElement Username = driver.findElement(By.xpath("//input[@id='userid']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	  Username.sendKeys("XA0634");
	  Password.sendKeys("Sarika699!");
	  LoginBtn.click();
	  Thread.sleep(2000);

	  WebElement PIN = driver.findElement(By.xpath("//input[@id='pin']"));
	  WebElement ContinueBTn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	  PIN.sendKeys("691991");
	  ContinueBTn.click();
	  Thread.sleep(3000);

	  String ExpectedTitle ="Kite - Zerodha's fast and elegant flagship trading platform";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);


	  driver.close();
	}

@Test
public void launchfirefox() throws InterruptedException
{
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\geckodriver.exe");
	  FirefoxOptions opt3 = new FirefoxOptions();
	  opt3.addArguments("--headless");
	  driver = new FirefoxDriver(opt3);
	  driver.get("https://kite.zerodha.com");
	  driver.manage().window().maximize();
 
	  WebElement Username = driver.findElement(By.xpath("//input[@id='userid']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	  Username.sendKeys("XA0634");
	  Password.sendKeys("Sarika699!");
	  LoginBtn.click();
	  Thread.sleep(2000);

	  WebElement PIN = driver.findElement(By.xpath("//input[@id='pin']"));
	  WebElement ContinueBTn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	  PIN.sendKeys("691991");
	  ContinueBTn.click();
	  Thread.sleep(3000);

	  String ExpectedTitle ="Kite - Zerodha's fast and elegant flagship trading platform";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);


	  driver.close();
	}
}

