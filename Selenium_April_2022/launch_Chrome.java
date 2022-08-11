package Selenium_April_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launch_Chrome
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		opt.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}

}
