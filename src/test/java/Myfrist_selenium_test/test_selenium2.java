package Myfrist_selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_selenium2 {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(5000);//Manual Wait - WE put some wait time
		driver.findElement(By.id("Sign-username")).sendKeys("Falgun");//Enter User Name
		driver.findElement(By.id("Sign-password")).sendKeys("Jahan1234");// Enter Password
		driver.findElement(By.xpath("//button[ text()='Sign up']")).click();// click sign up
		
		
		
		
	}

}
