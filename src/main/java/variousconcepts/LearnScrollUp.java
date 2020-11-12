package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScrollUp {

	
	WebDriver driver;
	
	@Before
	public void launchbroswer() {
		
		System.setProperty("webdriver.chrome.driver", "data\\chromedriver_1.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		//remove cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@Test
	public void TestLogin() throws InterruptedException {
		//Storing webelemet in selenium
		//element library
		
		
		WebElement USERNAME_FIELD_ELEMENT= driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement SIGNIN_BUTTON_ELEMENT= driver.findElement(By.xpath("//button[@name ='login']"));
		
		USERNAME_FIELD_ELEMENT.clear();
		USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
		PASSWORD_FIELD_ELEMENT.sendKeys("abc123");
		
		SIGNIN_BUTTON_ELEMENT.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 400)");
		
		
		
}
}
