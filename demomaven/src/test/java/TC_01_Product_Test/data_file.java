package TC_01_Product_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class data_file {
	
	@Test
	public void dataproperties() throws FileNotFoundException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Properties p = new Properties();
		p.load(new FileInputStream("./data.properties"));
		driver.get(p.);
		
//		Properties p = new Properties();
//		p.load(new FileInputStream("./data.properties"));
//		driver.get(p.getProperty("url"));
//		
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(p.getProperty("username"));
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(p.getProperty("password"));
	}

}
