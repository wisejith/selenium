package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chrome

{
	WebDriver driver;
		
	@BeforeTest
  public void before()
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Desktop\\traning\\day1\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
  @Test
  public void f() 
  {
	
	
	//System.out.println(driver.getCurrentUrl());
	//driver.navigate().to("https://yahoo.com");
	
	//driver.findElement(By.xpath("//input[@id ='username']")).sendKeys("MercySowmi");
	//driver.findElement(By.xpath("//input[@ name ='pw']")).sendKeys("123abc");
	//driver.findElement(By.xpath("//input[@ name ='Login']")).click();	
	//driver.findElement(By.name("Login")).click();
	//driver.findElement(By.xpath("//*[contains(@ type,'submit')]")).click();
	//driver.findElement(By.xpath("//input[@type='submit' or  @name='Login']")).click();
	
	//driver.findElement(By.cssSelector("input#username")).sendKeys("ercy");
	//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("ytfuy");
	//driver.findElement(By.cssSelector("input[class='button r4 wide primary']")).click();
	//driver.findElement(By.cssSelector("class.fl pr db tn3")).click();
	
	
	
	//driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	//System.out.println(driver.getTitle());
	//driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.get("https://www.google.com");
	js.executeScript("window.scrollBy(0, 6000)");
	                                                          
	
	//WebElement dropdown = driver.findElement(By.id("id_contact"));
	//Select drop= new Select(dropdown);
	//dropdown.click();
	//drop.selectByIndex(1);
	 driver.findElement(By.name("q")).sendKeys("wisejith");
	 driver.findElement(By.name("btnK")).submit();
	 
	//drop.selectByValue("1");
	//drop.selectByVisibleText("Customer service);"
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	java.util.List<WebElement> s = driver.findElements(By.xpath("//div//div//a/div/span"));
	for (int i=0;i<s.size();i++)
	{
		System.out.println(s.get(i));
	}
	
	
  }

  
  @AfterTest
  public void after()
  {
	  driver.close();
  }
}
