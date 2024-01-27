package pageobject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ItechPageObj {
  public static   List<WebElement> header(ChromeDriver d)
  {
	 return d.findElements(By.id("topnav"));
   }
  public static WebElement prod(ChromeDriver d)
  {
	  return d.findElement(By.linkText("Work"));
  }
  public static WebElement prod1(ChromeDriver d)
  {
	  return d.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[5]/ul/li[3]/ul/li/a"));
  }
  public static List<WebElement> feature(ChromeDriver d)
  {
	  return d.findElements(By.cssSelector("li strong"));
  }
  public static WebElement tech(ChromeDriver d)
  {
	  return d.findElement(By.linkText("Work"));
  }
  public static WebElement tech1(ChromeDriver d)
  {
	  return d.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[5]/ul/li[4]/ul/li/a"));
  }
  public static WebElement getquote(ChromeDriver d)
  {
	  return d.findElement(By.linkText("Get a Quote"));
  }
  public static WebElement formclick(ChromeDriver d)
  {
	  return d.findElement(By.xpath("//*[@id=\"sib-form\"]"));
  }
  public static WebElement fn(ChromeDriver d) 
  {
	  return d.findElement(By.id("FIRSTNAME"));
  }
  public static WebElement email(ChromeDriver d) 
  {
	  return d.findElement(By.id("EMAIL"));
  }
  public static WebElement countsel(ChromeDriver d)
  {
	  return d.findElement(By.xpath("//*[@id=\"sib-form\"]/div[4]/div/div/div/div/div/div"));
  }
  public static WebElement phn(ChromeDriver d)
  {
	 return d.findElement(By.id("PHONE")) ;
  }
  public static WebElement interest(ChromeDriver d)
  {
	  return d.findElement(By.id("IT_INTEREST"));
  }
  public static WebElement require(ChromeDriver d)
  {
	  return d.findElement(By.id("IT_REQUIREMENT"));
  }
  public static WebElement submit(ChromeDriver d)
  {
	  return d.findElement(By.xpath("//*[@id=\"sib-form\"]/div[10]/div/button"));
  }
}


