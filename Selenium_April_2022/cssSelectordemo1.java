package Selenium_April_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssSelectordemo1
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		// css selector with other attribute
		WebElement username= driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']"));
		
		username.sendKeys("7709353569");
		
		// css selector with other attribute
		//WebElement password= driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']"));
		
		// css selector with class
//		WebElement password= driver.findElement(By.cssSelector("input._2IX_2-._3mctLh.VJZDxU"));
		
		// css selector combination of class with other attribute
		WebElement password= driver.findElement(By.cssSelector("input._2IX_2-._3mctLh.VJZDxU[type='password']"));
		password.sendKeys("1238655");
		
		
		//css selector with class
//		WebElement loginbtn=driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL"));
		
		//css selector with other attribute
//		WebElement loginbtn=driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']"));
		
		//css selector with sub string (char AT)
	//	WebElement loginbtn=driver.findElement(By.cssSelector("button[class^='_2KpZ6l']"));
		
		//css selector with sub string (dollor)
		WebElement loginbtn=driver.findElement(By.cssSelector("button[class$='_3AWRsL']"));

		//css selector with sub string (star)
//		WebElement loginbtn=driver.findElement(By.cssSelector("button[class*='_2HKlqd']"));
		loginbtn.click();
		
		
	}

}
