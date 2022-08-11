package Selenium_April_2022;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readProperty 
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream srcfile = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\config.properties");
		
		Properties prop = new Properties();
		
		prop.load(srcfile);
		
		System.setProperty(prop.getProperty("key"), prop.getProperty("value"));
		ChromeDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
		
		WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
		userid.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		
		
		
		
		
		
	}

}
