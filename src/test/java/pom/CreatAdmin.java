package pom;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatAdmin
{
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[1]")
	private WebElement adminmajortab;
	
	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement addtextfield;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    private WebElement userroletextfield;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeenametextfield;
	
	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--focus']")
	private WebElement statustextfield;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	private WebElement usernametextfield;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	private WebElement conformtextfield;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement canceltextfield;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement savetextfield;
	
	public CreatAdmin(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	public void adminmajortabmethod()
	{
		adminmajortab.click();
		//driver.findElement(By.xpath("(//span[.='Admin'])[3]")).click();
	
	}
	public void addmethod() 
	{
		addtextfield.click();
	}
	
	public void userrolemethod() throws InterruptedException
	{
		Thread.sleep(2000);
		userroletextfield.click();
		WebElement usroll=driver.findElement(By.xpath("(//div[.='Admin'])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(usroll).click().perform();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",usroll);
		/*
		 * List<
		 * WebElement>element=driver.findElements(By.xpath("//div[@role='option']"));
		 * for(int i=0;i<element.size();i++) {
		 * if(element.get(i).getText().contentEquals("Admin")) { element.get(i).click();
		 * break; } }
		 */
	}
	public void empoyeenamemethod() throws InterruptedException 
	{
		Thread.sleep(2000);
		employeenametextfield.sendKeys("Lisa Andrews");
	}
	public void statusmethod()
	{
		statustextfield.click();
		List< WebElement>element=driver.findElements(By.xpath("//div[@role='listbox']"));
		for(int i=0;i<element.size();i++)
		{
			if(element.get(i).getText().contentEquals("Enabled"))
			{
				element.get(i).click();
				break;
			}
	}
}
	public void usernamemethod() 
	{
		usernametextfield.sendKeys("ranjit kumar ghadei");
		
	}
	public void passwordmehod() 
	{
		passwordtextfield.sendKeys("Ranjit@123");
	}
	public void conformpasswordmethod()
	{
	conformtextfield.sendKeys("Ranjit@123");	
	}
	public void savemehod() 
	{
		savetextfield.click();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	