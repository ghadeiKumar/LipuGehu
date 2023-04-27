package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pom.OrangeHrmHomePage;
import pom.OrangeHrmLogInPage;

public class TestClass1 
{
	   @Test(invocationCount = 2)
	   
		public void loginLogout() throws InterruptedException, IOException
		{
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		    WebDriver driver=new ChromeDriver(option);
		    driver.get("https://opensour ce-demo.orangehrmlive.com");
	        OrangeHrmLogInPage login=new OrangeHrmLogInPage(driver);
	        login.usernameMethod();
	        login.passwordMethod();
	        login.loginMethod();
	        OrangeHrmHomePage homepage=new OrangeHrmHomePage(driver);
	        homepage.userMenuMethod();
	        homepage.logoutMethod();
		}
	
	        @Test(priority = 2,invocationCount = 3)
	        public void login() throws InterruptedException, IOException
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
	        }
		

	}



