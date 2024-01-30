package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobject.ItechPageObj;
import pageobject.LoginPageObj;

public class Itechpom {
    ChromeDriver d;

    @Test
    public void itech() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
        d = new ChromeDriver();
        d.get("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory/");
        d.manage().window().maximize();
        List<WebElement> a = ItechPageObj.header(d);
        int x = a.size();
        System.out.println("the No.of Headers are: " + x);
        for (int i = 0; i < x; i++) {
            System.out.println(a.get(i).getText());
        }
        Thread.sleep(2000);
        ItechPageObj.prod(d).click();
        Thread.sleep(2000);
        ItechPageObj.prod1(d).click();
        Thread.sleep(2000);
        d.navigate().to("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory");
        List<WebElement> b = ItechPageObj.feature(d);
        int y = b.size();
        System.out.println("the Features are below");
        for (int i = 0; i < y; i++) {
            System.out.println(b.get(i).getText());
        }
        ItechPageObj.tech(d).click();
        Thread.sleep(2000);
        ItechPageObj.tech1(d).click();
        Thread.sleep(2000);
        d.navigate().to("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory");
       

    }
}
