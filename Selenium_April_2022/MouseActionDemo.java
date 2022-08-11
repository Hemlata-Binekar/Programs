package Selenium_April_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDemo 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement doubleclickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		act.doubleClick(doubleclickBtn).perform();
		
		WebElement RightclickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	
		act.contextClick(RightclickBtn).perform();
	
		// if click me not visible ad is comming middle button 'click me'
//		WebElement Buttons = driver.findElement(By.xpath(""));
//		act.moveToElement(Buttons);
		
		WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		act.click(clickBtn).perform();
		
		WebElement BookStore = driver.findElement(By.xpath("//div[text()='Book Store Application']"));
		act.moveToElement(BookStore).perform();
		
		//mouse over action
		driver.get("https://www.naukri.com/");
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		act.moveToElement(jobs).perform();
		
		
		//drag abd drop
		driver.get("https://demoqa.com/droppable");
		WebElement interactions = driver.findElement(By.xpath("//div[text()='Interactions']"));
		act.moveToElement(interactions).perform();
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		act.dragAndDrop(source, target).perform();
		
		
		
		
	}

}
