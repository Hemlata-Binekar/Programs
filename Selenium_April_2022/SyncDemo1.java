package Selenium_April_2022;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncDemo1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//	Thread.sleep(5000);

		WebElement jobs= driver.findElement(By.xpath("//div[text()='Jobs']"));
		jobs.click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Skills, Designations, Companies']"))).sendKeys("Automation Testing");
//		WebElement SDC= driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']"));
	//	SDC.sendKeys("Automation testing");
		
		WebElement Loc = driver.findElement(By.xpath("//input[@placeholder='Location/Locality']"));
		Loc.sendKeys("Pune");
	
	}

}
