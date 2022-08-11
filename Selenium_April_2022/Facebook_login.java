package Selenium_April_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//locator-id--1
		//WebElement useremail=driver.findElement(By.id("email"));
	//	WebElement password=driver.findElement(By.id("pass"));
		
		WebElement useremail=driver.findElement(By.className("inputtext"));
		WebElement password=driver.findElement(By.id("pass"));	
		
		//Locator --Tagname-4
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		if(links.size() !=0)
		{
			for(WebElement linkname : links)
			{
				System.out.println(linkname.getText());
			}
		}
		
		//Locator -name---2
		//WebElement Loginbtn=driver.findElement(By.name("login"));
		
		//Locator -tagname-4
		//WebElement Loginbtn=driver.findElement(By.tagName("button"));
				
		useremail.sendKeys("hbinekar45@gmail.com");
		password.sendKeys("12345");
		//Loginbtn.click();
		
		//Locator LinkText---5
		//WebElement FBPay= driver.findElement(By.linkText("Facebook Pay"));
		//FBPay.click();
		
		//Locator Partial ----6
		WebElement VIC=driver.findElement(By.partialLinkText("Voting Infor"));
		VIC.click();
		
		Thread.sleep(5000);
		
		
		driver.get("https://kite.zerodha.com/");
		WebElement userid=driver.findElement(By.id("userid"));
		WebElement password1=driver.findElement(By.id("password"));
				
		//Locator classname-----3
		WebElement loginbtn=driver.findElement(By.className("button-orange"));
		
		userid.sendKeys("XAUAT5");
		password1.sendKeys("a122345");
		loginbtn.click();
		
		
		
		
	}

}
