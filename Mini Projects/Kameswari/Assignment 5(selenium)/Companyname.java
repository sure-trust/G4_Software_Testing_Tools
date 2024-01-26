package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Companyname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/web-table-element.php");
		d.manage().window().maximize();
		WebElement w=d.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
		List<WebElement> x=d.findElements(By.tagName("th"));
		int l=x.size();
		for(int i=0;i<l;i++)
		{
			System.out.print(x.get(i).getText()+"    ");
		}
		System.out.println();
		List<WebElement> y=w.findElements(By.cssSelector("tr td a"));
		int k=y.size();
		for( int j=0;j<k;j++)
		{
			System.out.println(y.get(j).getText());
		}
		d.navigate().to("https://demo.guru99.com/test/login.html");
		d.findElement(By.id("email")).sendKeys("abcdefghijkl1234@gmail.com");
		d.findElement(By.id("passwd")).sendKeys("123456789@@@");
		d.findElement(By.id("SubmitLogin")).click();
	}

}
