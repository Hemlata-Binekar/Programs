package Selenium_April_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://demoqa.com/text-box'");
		
	//	driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		js.executeScript("arguments[0].value='Hema Binekar'", username);

	//	js.executeScript("document.getElementById('username').value='Ravi Nangre'");
		
		
		
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
	//	SubmitBtn.click();
		js.executeScript("arguments[0].click()", SubmitBtn);
		
		js.executeScript("alert('Welcome to Java Script Executor demo')");
		driver.switchTo().alert().accept();
		
		//Fetching domain name of 
		String DomainName = js.executeScript("return document.domain;").toString();
		System.out.println("Domain Name of The site="+DomainName);
		
		//fetching Url link
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL of the site="+url);
		
		//Fetching Title of page
		String TitleName = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page="+TitleName);
		
	//	js.executeScript("window.scrollBy(0,400)");
		WebElement checkbox = driver.findElement(By.xpath("//span[text()='Check Box']"));
		js.executeScript("arguments[0].scrollIntoView(true)", checkbox);
		
		js.executeScript("location.reload()");
		
		String sText = js.executeScript("return document.documentElement.InnerText").toString();
		System.out.println("Inner Text of web page" +sText);
		
		WebElement logo = driver.findElement(By.xpath("//img[@srs='/images/Toolsqa.jpg']"));
		System.out.println(logo.isDisplayed());
	}
}
