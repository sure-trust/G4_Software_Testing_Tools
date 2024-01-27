package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNg1 {
	ChromeDriver d;
  @Test
  public void loginTest() throws InterruptedException 
  {
	  d.findElement(By.id("email")).sendKeys("abcdefgh123@gmail.com");
	  Thread.sleep(2000);
	  d.findElement(By.id("passwd")).sendKeys("123456@@@");
	  Thread.sleep(2000);
	  d.findElement(By.id("SubmitLogin")).click();
	  Thread.sleep(2000);
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
	  d.close();
  }

}
