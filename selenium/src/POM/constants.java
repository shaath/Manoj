package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class constants
{
	public String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="admin";
	public WebDriver driver=new FirefoxDriver();
	loginPage lp=PageFactory.initElements(driver, loginPage.class);
	adminPage ap=PageFactory.initElements(driver, adminPage.class);
}
