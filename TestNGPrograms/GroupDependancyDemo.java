package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDependancyDemo
{
	public WebDriver driver;
	 @Test(groups = "LaunchB")
	  public void launchbrowser()
	  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  }
	 @Test(groups = "CheckT")
	 public void checkTitle()
	 {
		 String expectedTitle = "Facebook – log in or sign up";
		 String ActualTitle = driver.getTitle();
		 Assert.assertEquals(ActualTitle, expectedTitle);
	 }
	@Test(groups = "SignIn")
	public void login()
	{
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement LoginBtn =  driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("hbinekar45@gmail.com");
		password.sendKeys("12346788");
		LoginBtn.click();
	}
	@Test(groups = "SignOut")
		public void teardown()
		{
			driver.close();
		}
	}
