package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogin 
{
	@Test
	public void login()
	{
		WebDriver driver= WebdriverScript.browserlaunch("firefox", "http://apps.qaplanet.in/qahrm");
		Login_OR LoginPOM=PageFactory.initElements(driver, Login_OR.class);
		
		LoginPOM.UN.sendKeys("TESTdvsd");
		LoginPOM.PWD.sendKeys("PASSWORD");
		
	}
	
	
}
