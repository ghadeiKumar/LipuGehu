package autoframework;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends ExcellLibrary implements Autoconstant 
{
	public static WebDriver driver;

	@BeforeSuite
	public void executionstart()
	{
		System.out.println("execution start");	
	}

	@BeforeClass
	public void launch() throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments(chromeoptionargument);
		WebDriverManager.chromedriver().setup();
		//System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

	@AfterSuite
	public void executioncomplete()
	{
		System.out.println("execution complete");
	}
}
