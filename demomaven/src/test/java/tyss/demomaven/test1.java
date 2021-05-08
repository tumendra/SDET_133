package tyss.demomaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void createOrganization() {

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
		driver.findElement(By.linkText("Organizations")).click();

		// create organization
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//*[@name='accountname']")).sendKeys("Retro");
		driver.findElement(By.xpath("//tbody/tr[1]/td/div[1]/input[@title='Save [Alt+S]']")).click();

	}

}
