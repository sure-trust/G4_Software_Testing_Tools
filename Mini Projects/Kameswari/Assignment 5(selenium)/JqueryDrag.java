package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDrag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
	       ChromeDriver d=new ChromeDriver();
	       d.get("https://jqueryui.com/");
	       d.manage().window().maximize();
	       d.findElement(By.linkText("Draggable")).click();
	       WebElement f=d.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
			d.switchTo().frame(f);
	       WebElement drag=d.findElement(By.id("draggable"));
	       Actions a=new Actions(d);  
			Thread.sleep(2000);
			a.dragAndDropBy(drag,100 ,100 ).build().perform();
			a.clickAndHold().release().perform();
			System.out.println("Dragged and dropped successfully");
	}

}
