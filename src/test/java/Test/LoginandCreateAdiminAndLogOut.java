package Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pom.CreatAdmin;
import pom.OrangeHrmLogInPage;

public class LoginandCreateAdiminAndLogOut
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver(option);
	    driver.get("https://opensource-demo.orangehrmlive.com");
	    OrangeHrmLogInPage login=new OrangeHrmLogInPage(driver);
        login.usernameMethod();
        login.passwordMethod();
        login.loginMethod();
        CreatAdmin admin=new CreatAdmin(driver);
        Thread.sleep(2000);
        admin.adminmajortabmethod();
        Thread.sleep(2000);
        admin.addmethod();
        admin.userrolemethod();
        admin.empoyeenamemethod();
        admin.statusmethod();
        admin.usernamemethod();
        admin.passwordmehod();
        admin.conformpasswordmethod();
        admin.savemehod();
	}

}
