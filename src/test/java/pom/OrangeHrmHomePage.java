package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmHomePage
{
    @FindBy(xpath="//a[@class='oxd-main-menu-item active']")
    private WebElement diroctoryButton;
    
    @FindBy(xpath="//a[normalize-space()='Logout']")
    private WebElement logoutButton;
    
    @FindBy(xpath="//p[@class='oxd-userdropdown-name']")
    private WebElement userMenu;
    
    @FindBy(xpath="//a[@class='oxd-main-menu-item active']")
    private WebElement adminTab;
    
    public OrangeHrmHomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void diroctoryMethod()
    {
    	diroctoryButton.click();
    }
    public void userMenuMethod() throws InterruptedException
    {
    	Thread.sleep(2000);
    	userMenu.click();
    }
    public void adminTabMethod()
    {
    	adminTab.click();
    }
    public void logoutMethod() throws InterruptedException
    {
    	Thread.sleep(2000);
    	logoutButton.click();
    }  
}
