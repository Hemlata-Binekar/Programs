package Selenium_April_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_demo1 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
	/*	WebElement ESDC=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter skills')]//ancestor::div[1]"));
		ESDC.sendKeys("Manual testing");
		WebElement ser=driver.findElement(By.xpath("//div[text()='Search']"));
		ser.click();
		WebElement abtus=driver.findElement(By.xpath("//ul//child::li//a[text()='About us']"));
		abtus.click();
		*/
	}

}
