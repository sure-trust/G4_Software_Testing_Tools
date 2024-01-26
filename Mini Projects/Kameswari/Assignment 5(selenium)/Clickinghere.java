package automation;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickinghere {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
	       ChromeDriver d=new ChromeDriver();
	       d.get("http://demo.guru99.com/popup.php");
	       d.manage().window().maximize();
	       d.findElement(By.linkText("Click Here")).click();
	       Set<String> x=d.getWindowHandles();
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
			ArrayList<String>abc=new ArrayList<>(x);
			d.switchTo().window(abc.get(1));
	       d.findElement(By.name("emailid")).sendKeys("abcdefghij123@gmail.com");
	       d.findElement(By.name("btnLogin")).click();
	}

}
