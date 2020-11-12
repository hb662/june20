package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeariFrame {
	WebDriver driver;
	
	  @Test
		public void launchbrowser() {
			
			System.setProperty("webdriver.chrome.driver", "data\\chromedriver_1.exe");
			 driver = new ChromeDriver();
			driver.get("https://docs.oracle.com/javase/8/docs/api/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.switchTo().frame("packageListFrame");
			driver.findElement(By.linkText("java.awt")).click();
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.linkText("AppletContext")).click();
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("classFrame");
			driver.findElement(By.linkText("")).click();
			

}
}
