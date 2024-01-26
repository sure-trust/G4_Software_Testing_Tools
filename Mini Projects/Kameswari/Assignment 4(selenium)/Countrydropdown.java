package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countrydropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
	       ChromeDriver d=new ChromeDriver();
	       d.get("https://demo.guru99.com/test/radio.html");
	       d.manage().window().maximize();
	       d.findElement(By.id("vfb-7-1")).click();
	       Thread.sleep(2000);
	       d.findElement(By.id("vfb-6-1")).click();
	       d.findElement(By.id("vfb-6-2")).click();
	       Thread.sleep(2000);
	       d.navigate().to("https://demo.guru99.com/test/newtours");
	       d.findElement(By.linkText("REGISTER")).click();
	      WebElement x= d.findElement(By.name("country"));
	      x.click();
	      Select s=new Select(x);
	     s.selectByValue("KUWAIT");
	}

}
