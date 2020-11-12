package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearAlertpopup {
	WebDriver driver;
	
	  @Test
		public void launchbrowser() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "data\\chromedriver_1.exe");
			 driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='proceed']")).click();
			Thread.sleep(2000);
			
			String alertmessage =driver.switchTo().alert().getText();
			System.out.println("Alert Msg="+alertmessage);
			driver.switchTo().alert().accept();

}
}