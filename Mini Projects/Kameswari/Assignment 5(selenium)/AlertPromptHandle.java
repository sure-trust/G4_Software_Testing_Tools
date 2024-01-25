package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPromptHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/delete_customer.php");
		d.manage().window().maximize();
		d.findElement(By.name("cusid")).sendKeys("456732189");
		d.findElement(By.name("submit")).click();
		Thread.sleep(5000);
	       Alert a=d.switchTo().alert(); //Switching the driver to alert
	       String msg=d.switchTo().alert().getText(); //Capturing the alert text
	       System.out.println(msg);
	       Thread.sleep(2000);
	       a.accept();
	       Alert b=d.switchTo().alert();
	       String msg1=d.switchTo().alert().getText(); //Capturing the alert text
	       System.out.println(msg1);
	       Thread.sleep(2000);
	       b.accept();
	       
		
	}

}
