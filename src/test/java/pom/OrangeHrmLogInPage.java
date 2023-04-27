package pom;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import autoframework.Autoconstant;
import autoframework.ExcellLibrary;
import autoframework.Helper;

public class OrangeHrmLogInPage implements Autoconstant 
{
 public WebDriver driver;

@FindBy(xpath = "//input[@placeholder='Username']")
private WebElement usernametextfield;
			
@FindBy(xpath = "//input[@placeholder='Password']")
private WebElement passwordtextfield;

@FindBy(xpath = "//button[@type='submit']")
private WebElement logintextfield;

@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
private WebElement forgottpassword;

public OrangeHrmLogInPage(WebDriver driver)
{
	
    PageFactory.initElements(driver, this);

	}
public void usernameMethod() throws InterruptedException, IOException
{
	Helper.highlightelement(driver, usernametextfield);
	Thread.sleep(5000);
	usernametextfield.sendKeys(ExcellLibrary.excelldata(excellsheet,5,3));
}
public void passwordMethod() throws InterruptedException, IOException
{
	Helper.highlightelement(driver, passwordtextfield);
	Thread.sleep(2000);
	passwordtextfield.sendKeys(ExcellLibrary.excelldata( excellsheet,6,3));
}
public void loginMethod() throws InterruptedException, IOException
{
	//Helper.highlightelement(driver, usernametextfield);
	//Thread.sleep(5000);
	usernametextfield.sendKeys(ExcellLibrary.excelldata(excellsheet,4,3));
	//Helper.highlightelement(driver, passwordtextfield);
	Thread.sleep(2000);
	passwordtextfield.sendKeys(ExcellLibrary.excelldata(excellsheet,5,3));
	Thread.sleep(2000);
	logintextfield.click();;
}
}
