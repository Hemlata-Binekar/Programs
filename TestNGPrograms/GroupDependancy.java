package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupDependancy
{
@Test(groups = "SignIn")
public void login()
	  {
		System.out.println("Login successfully");
	  }
@Test(dependsOnGroups = "SignIn")
public void viewAccount()
{
	System.out.println("View Account successfully");
}
}
