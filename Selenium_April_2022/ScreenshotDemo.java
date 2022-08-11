package Selenium_April_2022;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo 
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zerodha.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver; //typecasting byte to float , int to char & char to byte
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Screenshot\\"+timestamp()+".jpeg"));
		
	}
	public static String timestamp() 
	{
		return new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		
		
	}
	

	}


