package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNg2 {
	static ChromeDriver d;
	
  @Test(dataProvider="loginData")
  public void logincheck(String username,String pwd) throws InterruptedException
	{
		d.findElement(By.id("email")).sendKeys(username);
		  Thread.sleep(2000);
		  d.findElement(By.id("passwd")).sendKeys(pwd);
		  Thread.sleep(2000); 
		  d.findElement(By.id("SubmitLogin")).click();
		  Thread.sleep(2000);
		  d.navigate().to("https://demo.guru99.com/test/login.html");
 }
  @DataProvider(name = "loginData")
  
	  public Object[][] getData() 
  {
	        // Return the test data from a data-driven method
	        return new Object[][] {
	            {"test1@gmail.com", "test123"},
	            {"test2@gmail.com", "test456"},
	            {"test3@gmail.com", "test789"}
	        };
	    }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://demo.guru99.com/test/login.html");
	  d.manage().window().maximize();
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() 
  {
	d.quit();  
  }
  
  
  

}
