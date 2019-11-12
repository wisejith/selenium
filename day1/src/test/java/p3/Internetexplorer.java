package p3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Internetexplorer 
{
  
 
	  WebDriver driver;
	  
		@BeforeTest
		void before()
		
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Desktop\\traning\\day1\\src\\test\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Desktop\\traning\\day1\\src\\test\\resources\\chromedriver.exe");
			//driver = new ChromeDriver();
		 
			}
		
	
	    
	 @AfterTest
	  void after()
	  {
		  driver.close();
	  }
  
}
