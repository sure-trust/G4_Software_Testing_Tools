package apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class BankWrite {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BROWSER DRIVERS\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get(" http://demo.guru99.com/V4/");
		d.manage().window().maximize();
		d.findElement(By.name("uid")).sendKeys("Kameswari@");
		d.findElement(By.name("password")).sendKeys("12345678");
		d.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
	       Alert a=d.switchTo().alert(); //Switching the driver to alert
	       String msg=d.switchTo().alert().getText(); //Capturing the alert text
	       System.out.println(msg);
	       Thread.sleep(2000);
	       a.accept();
	       
	       d.findElement(By.name("uid")).sendKeys("Kavya@");
			d.findElement(By.name("password")).sendKeys("23456789");
			d.findElement(By.name("btnLogin")).click();
			Thread.sleep(2000);
		       Alert b=d.switchTo().alert(); //Switching the driver to alert
		       String msg1=d.switchTo().alert().getText(); //Capturing the alert text
		       System.out.println(msg);
		       Thread.sleep(2000);
		       a.accept();

	       
		
		FileInputStream f=new FileInputStream("C:\\ApacheTesting notes\\BankPoi.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("Bankdata");
		XSSFRow r0=sh.createRow(0);
		XSSFCell c0=r0.createCell(0);
		c0.setCellValue("USERNAME");
		XSSFCell c1=r0.createCell(1);
		c1.setCellValue("PASSWORD");
		XSSFRow r1=sh.createRow(1);
		XSSFCell c2=r1.createCell(0);
		c2.setCellValue("Kameswari@");
		XSSFCell c3=r1.createCell(1);
		c3.setCellValue("12345678");
		XSSFRow r2=sh.createRow(2);
		XSSFCell c4=r2.createCell(0);
		c4.setCellValue("Kavya@");
		XSSFCell c5=r2.createCell(1);
		c5.setCellValue("23456789");
		
		XSSFRow r3=sh.createRow(3);
		XSSFCell c6=r3.createCell(0);
		c6.setCellValue("SaiKiran@");
		XSSFCell c7=r3.createCell(1);
		c7.setCellValue("34567890");
		
		
		FileOutputStream f1=new FileOutputStream("C:\\ApacheTesting notes\\BankPoi.xlsx");
		wb.write(f1);
		System.out.println("End of Writing");

		
		
		
		
		
		

	}

}
