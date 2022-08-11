package Selenium_April_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorDemo
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// CSS selector with ID---1
	//	WebElement UserEmail =driver.findElement(By.cssSelector("input#email"));
		
		//css selector combination of id with other atrribute----4a
		WebElement UserEmail=driver.findElement(By.cssSelector("input#email[name='email']"));
		
		UserEmail.sendKeys("hbinekar45@gmail.com");
		
		// CSS selector with class----2
//		WebElement password=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));

		
		// CSS selector with class with other atrribute----4b
//		WebElement password=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[name='pass']"));
//		WebElement password=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[type='password']"));
	
		// parent child tag relatrionship-----5
		WebElement password=driver.findElement(By.cssSelector("div>input[placeholder='Password']"));
		password.sendKeys("1246433");
		
		// CSS selector with other attribute----3
		WebElement loginbtn=driver.findElement(By.cssSelector("button[name='login']"));
		// parent child tag relatrionship-----5
//		WebElement loginbtn=driver.findElement(By.cssSelector("div>button"));
	
		// css selector with substring (charAT)
	//	WebElement loginbtn=driver.findElement(By.cssSelector("button[class^=_42ft]"));
		
		// css selector with substring (dollor)
//		WebElement loginbtn=driver.findElement(By.cssSelector("button[class$=_51sy]"));
	
		// css selector with substring (star)
//		WebElement loginbtn=driver.findElement(By.cssSelector("button[class*=_6lth]"));
		
		// CSS selector with text
//		WebElement loginbtn=driver.findElement(By.cssSelector("//a[text()='Log In']"));
		loginbtn.click();
		
		//css with parent child relationship
//		WebElement CAP=driver.findElement(By.cssSelector("div>a[class='_8esh']"));		
	//	CAP.click();
		
		
	}

}
