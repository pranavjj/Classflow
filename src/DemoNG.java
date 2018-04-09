import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.*;
import org.testng.*;
import org.testng.annotations.*;

public class DemoNG 
{
	WebDriver driver;
	
	@BeforeTest
	public void primary()
	{
	System.setProperty("webdriver.chrome.driver","D:/Automation/PJ POC/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();

	// Navigate to URL
	driver.get("https://classflowinqa2.prometheanjira.com/classflow/#!/login");
	driver.manage().deleteAllCookies();
	//driver.get("https://prod.classflow.com/classflow/#!/login");
	//Thread.sleep(2000);
	driver.manage().window().maximize();  
	}
  @Test
  public void login() throws InterruptedException
  {
	  
	  	driver.findElement(By.className("auth-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("account")).sendKeys("inqa2_teacher");
		driver.findElement(By.name("password")).sendKeys("pranav@777");
		driver.findElement(By.className("button")).click();
		Thread.sleep(8000); 	  
  }
  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();  
	  
	  // new comment dfdsf
  }


}
