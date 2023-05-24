package practic_Advance_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conatinDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.findElement(By.id("login2")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("loginusername")).sendKeys("Waterfall");
		driver.findElement(By.id("loginpassword")).sendKeys("12345");
		
	

	}

}
