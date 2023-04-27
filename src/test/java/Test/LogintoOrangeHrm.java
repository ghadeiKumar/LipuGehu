package Test;

import java.io.IOException;
import org.testng.annotations.Test;
import autoframework.BaseTest;
import pom.OrangeHrmLogInPage;

public class LogintoOrangeHrm extends BaseTest
{
	@Test
	public void loginOrangehrm() throws InterruptedException, IOException
	{
		OrangeHrmLogInPage loginpage=new OrangeHrmLogInPage(driver);
		//loginpage.usernameMethod();
		//loginpage.passwordMethod();
		loginpage.loginMethod();		
	}
}
