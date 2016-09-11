package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginTc extends constants
{
	@Test
	public void org_LoginTC()
	{
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		lp.org_Login(u, p);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
