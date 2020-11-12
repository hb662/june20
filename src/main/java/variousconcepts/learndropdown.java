package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class learndropdown {
	
	WebDriver driver;
	
	  @Before
		public void launchbrowser() {
			
			System.setProperty("webdriver.chrome.driver", "data\\chromedriver_1.exe");
			 driver = new ChromeDriver();
			driver.get("http://www.techfios.com/billing/?ng=admin/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@Test
		public void test1() {
			
			WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
		    WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='password']"));
		    WebElement SIGNIN_FIELD_ELEMENT = driver.findElement(By.xpath("//button[@name ='login']"));
			
			USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
			PASSWORD_FIELD_ELEMENT.sendKeys("abc123");
			SIGNIN_FIELD_ELEMENT.click();

			driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]")).click();
			
			WebElement COMPANY_DROPDOWN_ELEMENT = driver.findElement(By.xpath("//select[@id='cid']"));
			COMPANY_DROPDOWN_ELEMENT.click();
			Select sel = new Select(COMPANY_DROPDOWN_ELEMENT);
			sel.selectByVisibleText("Techfios");
			
}
}
