package Selenium_April_2022;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwaitDemo 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		
		WebElement colorchangeBtn = driver.findElement(By.xpath("//button[@id='colorChange']"));
		WebElement EnableafterBtn = driver.findElement(By.xpath("//button[@id='enableAfter']"));
		
		System.out.println("Before Button get enabled"+EnableafterBtn.isEnabled());
		System.out.println("Before Visible After button shown"+colorchangeBtn.getCssValue("coclor"));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
		System.out.println("After Button get enabled"+EnableafterBtn.isEnabled());
		System.out.println("After Visible After button shown"+colorchangeBtn.getCssValue("color"));
		
		
		
		
	}

}
