package TC_01_Product_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class create_contact_name_with_org {
	
	@Test
	public void create_contact_name_with_org() {
		
		
			
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			// get url
				driver.get("http://localhost:8888/");
				
				// login to the applications.
				driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin", Keys.ENTER);
				
				//navigate to contact
				
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
				driver.findElement(By.name("lastname")).sendKeys("piple");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//img[@alt='Select']")).click();
				
				//Switchwindow
				
				String firstWin = driver.getWindowHandle();
				System.out.println(firstWin);
				driver.findElement(By.xpath("//a[text()='Retro']"));
				
				 
				
	}
	
	

}
