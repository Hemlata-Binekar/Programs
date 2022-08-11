package Selenium_April_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
		WebElement alertBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertBtn.click();
		
		driver.switchTo().alert().accept();
				
		WebElement timeralertBtn =driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		timeralertBtn.click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		WebElement ConfirmBtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		js.executeScript("arguments[0].click();", ConfirmBtn);
		ConfirmBtn.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		WebElement PromptBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
		//if 'ad' visible on click button due to not possible to click then we use below method
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].click", PromptBtn);
		
		PromptBtn.click();
		driver.switchTo().alert().sendKeys("Hemlata Binekar");
		driver.switchTo().alert().accept(); 
		
		
		
	
	}

}
