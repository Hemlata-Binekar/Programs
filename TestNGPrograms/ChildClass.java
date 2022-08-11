package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChildClass extends SuperClass{
	@Test(dependsOnMethods = "launchbrowser")
	 public void checkTitle()
	 {
		 String expectedTitle = "Facebook – log in or sign up";
		 String ActualTitle = driver.getTitle();
		 Assert.assertEquals(ActualTitle, expectedTitle);
	 }
	@Test(dependsOnMethods = "checkTitle")
	public void login()
	{
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement LoginBtn =  driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("hbinekar45@gmail.com");
		password.sendKeys("12346788");
		LoginBtn.click();
	}
	@Test(dependsOnMethods = "login")

		public void teardown()
		{
			driver.close();
		}
}
