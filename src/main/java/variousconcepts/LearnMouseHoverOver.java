package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LearnMouseHoverOver {
	
	WebDriver driver;
	
	  @Before
		public void launchbrowser() {
			
			System.setProperty("webdriver.chrome.driver", "data\\chromedriver_1.exe");
			 driver = new ChromeDriver();
			driver.get("https://www.dell.com/en-us");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
	  
	  @Test
		public void TestLogin() {
		  
		  WebElement PRODUCT_MENU_ELEMENT = driver.findElement(By.xpath("//*[@id=\"category-bar\"]/div[4]/div/img"));
		  WebElement HOME_MENU_ELEMENT = driver.findElement(By.xpath("//*[@id=\"category-bar\"]/div[4]/div/div[2]/a[1]"));
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(PRODUCT_MENU_ELEMENT).build().perform();
		  action.moveToElement(HOME_MENU_ELEMENT).build().perform();
		  HOME_MENU_ELEMENT.click();
		  
		  WebElement SIZE_MENU_ELEMENT = driver.findElement(By.xpath("//*[@id=\"anav-filter-section\"]/div[2]/nav/ul/li[1]/h2/a/span[1]"));
		  Select sel = new Select(SIZE_MENU_ELEMENT);
		  sel.selectByVisibleText("20");
		  
	  }
	  }
