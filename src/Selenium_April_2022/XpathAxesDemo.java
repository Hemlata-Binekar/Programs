package Selenium_April_2022;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathAxesDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Dimension d= new Dimension (400, 330);
	//	driver.manage().window().setSize();
		
		WebElement CustomerService = driver.findElement(By.xpath("//a[text()='Health, Household & Personal Care']"));
		CustomerService.click();
		driver.close();
	}

}
