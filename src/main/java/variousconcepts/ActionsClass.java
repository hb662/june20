package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	WebDriver driver;
	
	  @Before
		public void launchbrowser(){
			
			System.setProperty("webdriver.chrome.driver", "data\\chromedriver_1.exe");
			 driver = new ChromeDriver();
			driver.get("http://www.techfios.com/billing/?ng=admin/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		

}
	  
	  @Test
		public void TestLogin() {
		WebElement USERNAME_FIELD_ELEMENT= driver.findElement(By.xpath("//input[@id='username']"));
			WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='password']"));
			 
			USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
			PASSWORD_FIELD_ELEMENT.sendKeys("abc123");
			
			Actions action = new Actions(driver);
			//action.sendKeys(Keys.ENTER).build().perform();
			action.sendKeys(Keys.RETURN).build().perform();
			
			
}
}
