package Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_OR 
{
	
	@FindBy(name="txtUserName")
	WebElement UN;
	
	@FindBy(name="txtPassword")
	WebElement PWD;
	
}
