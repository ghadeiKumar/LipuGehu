package autoframework;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenShort implements ITestListener
{
public void onTestFailure(ITestResult result) 
{
TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
File sourcefile=ts.getScreenshotAs(OutputType.FILE);
File destinationfile=new File("./failedscreenshort/screenshort.png");
try {
	FileHandler.copy(sourcefile, destinationfile);
} catch (Exception e) {
	
	e.printStackTrace();
}

}
}
