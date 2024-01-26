package automation;

import org.openqa.selenium.chrome.ChromeDriver;


public class SelDrivers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
       ChromeDriver d=new ChromeDriver();
       d.get("https://www.amazon.in/");
       d.manage().window().maximize();
       Thread.sleep(2000);
       System.out.println(d.getTitle());
       d.navigate().to("https://www.facebook.com/login.php/");
       d.manage().window().maximize();
       System.out.println(d.getTitle());
      
       
       
	}

}
