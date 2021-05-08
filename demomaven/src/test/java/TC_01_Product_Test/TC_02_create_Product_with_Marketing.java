package TC_01_Product_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_02_create_Product_with_Marketing {
	
	@Test
	public void TC2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		// get url
			driver.get("http://localhost:8888/");
			
			// login to the applications.
			driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin", Keys.ENTER);
			
			// navigate to organizations
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Products")).click();
			
			// Create new product
			
			driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
			
			//create new product
			
			driver.findElement(By.name("productname")).sendKeys("Sony");
			
			// select radio button
			
			driver.findElement(By.xpath("//input[@type='radio'][2]")).click();
			
			//dropDown
			
			WebElement ele = driver.findElement(By.name("assigned_group_id"));
			Select s = new Select(ele);
			//Thread.sleep(3000);
			s.selectByValue("3");
			
			//logout
			
             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			 WebElement ele1 = driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
	         Actions a = new Actions(driver);
	         a.moveToElement(ele1).perform();
	        // Thread.sleep(3000);
	         driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
				
		
	}

}
