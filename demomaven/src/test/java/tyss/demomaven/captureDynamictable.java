package tyss.demomaven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class captureDynamictable {
	
	@Test
	public void captureOrgName() throws InterruptedException
	{
		//step1 get URL
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//step2: login to application
		
		driver.get("http://localhost:8888/");
		
		//step3: login to app
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		//step4:  navigate to org 
		
		driver.findElement(By.linkText("Organizations")).click();
		
		//capture all the orgname 
		
		String x = "//table[@class='lvt small']/tbody/tr[*]/td[3]/a";
		List<WebElement> list = driver.findElements(By.xpath(x));
		
		for(WebElement wb:list)
		{
			System.out.println(wb.getText());
			
		}
		
	}

}
