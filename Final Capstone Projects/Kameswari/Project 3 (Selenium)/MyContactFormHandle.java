package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyContactFormHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.mycontactform.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
        d.findElement(By.linkText("Sample Forms")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
        d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]")).click();
        Thread.sleep(2000);
        d.findElement(By.name("subject")).sendKeys("Automation");
        Thread.sleep(2000);
        d.findElement(By.name("email")).sendKeys("ABCDEFGH@gmail.com");
        Thread.sleep(2000);
        d.findElement(By.name("q1")).sendKeys("Hi,Good day!");
        Thread.sleep(2000);
        d.findElement(By.name("q2")).sendKeys("I need the sales reports of this month.Please send me the sales reports by EOD");
        //Working with Drop down buttons
        Thread.sleep(2000);
        WebElement x =d.findElement(By.name("q3"));
        x.click();
        Select s=new Select(x);
        s.selectByValue("Fourth Option");
        d.findElement(By.cssSelector("input[value='Fourth Option']")).click();
        Thread.sleep(2000);
        d.findElement(By.id("q5")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[9]/td/div[1]/input[4]")).click();
        Thread.sleep(2000);
        d.findElement(By.name("q7")).click();
        WebElement k=d.findElement(By.id("ui-datepicker-div"));
        k.findElement(By.linkText("22")).click();
        Thread.sleep(2000);
        WebElement y=d.findElement(By.name("q8"));
        y.click();
        Select r=new Select(y);
        r.selectByValue("HI");
        Thread.sleep(2000);
        WebElement z=d.findElement(By.name("q9"));
        z.click();
        Select t=new Select(z);
        t.selectByValue("India");
        Thread.sleep(2000);
        WebElement a=d.findElement(By.name("q10"));
        a.click();
        Select u=new Select(a);
        u.selectByValue("Yukon");
        Thread.sleep(2000);
        WebElement b=d.findElement(By.name("q11_title"));
        b.click();
        Select v=new Select(b);
        v.selectByValue("Miss");
        Thread.sleep(2000);
        d.findElement(By.name("q11_first")).sendKeys("Kameswari");
        Thread.sleep(2000);
        d.findElement(By.name("q11_last")).sendKeys("Pendyala");
        Thread.sleep(2000);
        WebElement c=d.findElement(By.name("q12_month"));
        c.click();
        Select g=new Select(c);
        g.selectByValue("10");
        WebElement e=d.findElement(By.name("q12_day"));
        e.click();
        Select h=new Select(e);
        h.selectByValue("22");
        WebElement f=d.findElement(By.name("q12_year"));
        f.click();
        Select i=new Select(f);
        i.selectByValue("2000");
        d.findElement(By.id("attach4589")).sendKeys("C:\\Users\\kames\\Downloads\\testimage.jpeg");
        
	}

}
