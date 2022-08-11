package Selenium_April_2022;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class headless {

	public static void main(String[] args)
	{
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		
	}

}
