package Selenium_April_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class launch_firefox 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\geckodriver.exe");
		
		FirefoxOptions opt=new FirefoxOptions();
		/*opt.addArguments("--headless");
		opt.addArguments("--disable-notifications");*/
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipKart.com/");
		WebElement userid=driver.findElement(By.className("_2IX_2-"));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		if(links.size() !=0)
		{
			for(WebElement linkname : links)
			{
				System.out.println(linkname.getText());
			}
		}
		
	}

}
