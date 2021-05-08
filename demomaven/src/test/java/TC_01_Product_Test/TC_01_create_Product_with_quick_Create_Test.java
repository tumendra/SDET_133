package TC_01_Product_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_01_create_Product_with_quick_Create_Test {
	
	@Test
	
	public void TC1() throws InterruptedException {
		
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
			
			// Craete new product
			
			driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
			
			//create new product
			
			driver.findElement(By.name("productname")).sendKeys("Sony");
			
			//select radio button
			driver.findElement(By.name("assigntype")).click();
			
			//save
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			
			//logout
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 WebElement ele = driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
	         Actions a = new Actions(driver);
	         a.moveToElement(ele).perform();
	        // Thread.sleep(3000);
	         driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	        // Thread.sleep(5000);
	         
	         //close driver
	         driver.close();
			
			
			
			
	}
	

}
