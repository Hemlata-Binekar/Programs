package Selenium_April_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynhDemo
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//Syntax of Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//Syntax of Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement CreatNewAcc = driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]"));
		CreatNewAcc.click();
		
		// Static wait
	//	Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Hemlata");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastname']"))).sendKeys("Binekar");
//		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
//		FirstName.sendKeys("Hemlata");
		
	//	WebElement Surname=driver.findElement(By.xpath("//input[@name='lastname']"));
	//	Surname.sendKeys("Binekar");
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("alert('Welcome to Facebook Sign Up Page')");
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	/*	Thread.sleep(2000);
		driver.manage().window().minimize();
	*/
	}

}
