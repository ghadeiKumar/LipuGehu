package autoframework;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Basepage
{
	
	public void robot () throws AWTException 
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);	
    }
	public void action(WebElement element ,WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.click().perform();
		action.sendKeys("admin").perform();
		action.moveToElement(element).perform(); 
	}
	public void javascriptclick(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0]",element );
	}
	
}