package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebdriverScript
{  
	
	public static WebDriver driver;
	
	public static WebDriver browserlaunch(String ldriver,String url)
	{
		if(ldriver.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(ldriver.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(ldriver.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
}
