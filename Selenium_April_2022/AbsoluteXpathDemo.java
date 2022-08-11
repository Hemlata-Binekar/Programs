package Selenium_April_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathDemo
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.Zerodha.com");
		
		// Absolute xpath
	//	WebElement userid=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[2]/input"));
	//	WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[3]/input"));
	//	WebElement loginbtn=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[4]/button"));
		
		driver.get("https://www.facebook.com");
		
		// Relative Xpath
//		WebElement userid=driver.findElement(By.xpath("//input[@id='email']"));
//		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		//  relative xpath with AND method
		WebElement userid=driver.findElement(By.xpath("//input[@id='email' and @name='email']"));
		
		// Relative xpath with "OR" method
		WebElement password=driver.findElement(By.xpath("//input[@id='pass' and @placeholder='Password']"));
		// relative xpath with basic
		//WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
//		WebElement loginbtn=driver.findElement(By.xpath("//button[starts-with(@class,'_42ft')]"));
		
		// relative xpath with text
		WebElement loginbtn=driver.findElement(By.xpath("//button[text()='Log In']"));
		// relative xpath with text
		WebElement forgot1=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		//Relative xpath with contains text
		//WebElement frgt=driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
		userid.sendKeys("XAU09R");
		password.sendKeys("1234876");
	    loginbtn.click();
	    forgot1.click();
		
		
	/*	driver.get("https://accounts.google.com/signup");
		// Relative xpath basic
		WebElement FN=driver.findElement(By.xpath("//input[@id='firstName']"));
		
		//Relative xpath with contains
		WebElement LN=driver.findElement(By.xpath("//input[contains(@id,'la')]"));
		//Relative xpath starts-with
		WebElement username=driver.findElement(By.xpath("//input[starts-with(@name,'User')]"));

		//Relative xpath with contains
		WebElement Password=driver.findElement(By.xpath("//input[contains(@aria-label,'Pass')]"));
		
		//Relative xpath with starts-with
		WebElement Password1=driver.findElement(By.xpath("//input[starts-with(@name,'Conf')]"));

	//	WebElement nxt= driver.findElement(By.xpath("//span[text()='Next']"));
		//WebElement Signin=driver.findElement(By.xpath("//span[text()='Sign in instead']"));
	    WebElement Signin=driver.findElement(By.xpath("//span[contains(text(),'Sign in instead')]"));
		FN.sendKeys("Hemlata");
		LN.sendKeys("Binekar");
		username.sendKeys("binekarh045");
		Password.sendKeys("123487678");
		Password1.sendKeys("123487678");
		//nxt.click();
		Signin.click();
		*/
		
		
		
	}

}
