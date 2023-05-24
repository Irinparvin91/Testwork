package Myfrist_selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_testcase {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login2")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("loginusername")).sendKeys("Waterfall");
		driver.findElement(By.id("loginpassword")).sendKeys("12345");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}

}
