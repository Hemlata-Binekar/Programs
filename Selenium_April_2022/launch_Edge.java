package Selenium_April_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class launch_Edge
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\msedgedriver.exe");
		
		//EdgeOptions opt=new EdgeOptions();
		//opt.addArguments("--headless");
		//opt.addArguments("--disable-notifications");
				
		WebDriver driver=new EdgeDriver();
		
		//driver.get("https://www.Facebook.com/");
		//System.out.println(driver.getTitle());
		
		
		
		driver.get("https://www.flipkart.com/");
		WebElement userid=driver.findElement(By.className("_2IX_2-"));
		WebElement password=driver.findElement(By.className("_3mctLh"));
		//WebElement login=driver.findElement(By.cssSelector("button[class^='_2KpZ6l']"));
		WebElement login=driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL"));
		userid.sendKeys("hbinekar45@gmail.com");
		password.sendKeys("1234578");
		login.click(); 
		
		
		
		
		/*driver.get("https://accounts.google.com/signin");
		WebElement userid=driver.findElement(By.id("identifierId"));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		if(links.size() !=0)
		{
			for(WebElement linkname : links)
			{
				System.out.println(linkname.getText());
			}
		}
		
		
		WebElement LM=driver.findElement(By.partialLinkText("Lear"));
		LM.click();
	
		WebElement nxt=driver.findElement(By.tagName("button"));
		WebElement password=driver.findElement(By.className("whsOnd"));
		WebElement nxt1=driver.findElement(By.className("VfPpkd-vQzf8d"));
		
		userid.sendKeys("hbinekar45@gmail.com");
		nxt.click();
		password.sendKeys("12344");
		nxt1.click();*/
		
		
		
	}

}

/*driver.get("https://kite.zerodha.com/");

WebElement userid=driver.findElement(By.id("userid"));
WebElement password=driver.findElement(By.id("password"));
WebElement login=driver.findElement(By.className("button-orange"));


userid.sendKeys("XA0634");
password.sendKeys("45667");
login.click();*/
